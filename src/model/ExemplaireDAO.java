/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class ExemplaireDAO implements ExemplaireInterface{
    
/*-----------------------------------------------------------------------------------*/
    // Connexion
/*-----------------------------------------------------------------------------------*/
    private DB db;
    private DBCollection collectionExemplaire;
    
        public ExemplaireDAO (){
                    // connexion a la DB
        this.db = Connexion.getConnexion();
        
        //connexion a la collection Pays
        this.collectionExemplaire = this.db.getCollection("Exemplaire");
        }
/*-----------------------------------------------------------------------------------*/
    // methode du CRUD
/*-----------------------------------------------------------------------------------*/
        /*  Attribut de la class exemplaire
   	 * private String refExemplaire;
         * private Edition idEdition;
         * private Livre idLivre*/
/*-----------------------------------------------------------------------------------*/
    //pour ajouter un exemplaire a la bdd
@Override
    public void addExemplaire(Exemplaire exemplaire) {
        
       BasicDBObject docExemplaire = new BasicDBObject();
       docExemplaire.append("_id", exemplaire.getRefExemplaire())
               .append("idEdition",new BasicDBObject("_id",exemplaire.getIdEditionExemplaire().getIdEdition())
                    .append("nomEdition",exemplaire.getIdEditionExemplaire().getNomLibelle())
               .append("idLivre",new BasicDBObject("_id", exemplaire.getIdLivreExemplaire().getIdLivre())
                    .append("nomLivre",exemplaire.getIdLivreExemplaire().getTitreLivre())
               ));
       this.collectionExemplaire.insert(docExemplaire);
    }

/*-----------------------------------------------------------------------------------*/
    //pour supprimer un exmplaire de la bdd
@Override
    public void deleteExemplaire(Exemplaire exemplaire) {
        
        BasicDBObject docExemplaire = new BasicDBObject();
        docExemplaire.append("_id",exemplaire.getRefExemplaire());
        
        this.collectionExemplaire.remove(docExemplaire);

    }

/*-----------------------------------------------------------------------------------*/
    //pour modifier un exmplaire dans la bdd
@Override
    public void updateExemplaire(Exemplaire exemplaire) {
        
        BasicDBObject docExemplaireNew = new BasicDBObject();
        docExemplaireNew.append("_id", exemplaire.getRefExemplaire())
               .append("idEdition",new BasicDBObject("_id",exemplaire.getIdEditionExemplaire().getIdEdition())
                    .append("nomEdition",exemplaire.getIdEditionExemplaire().getNomLibelle())
               .append("idLivre",new BasicDBObject("_id", exemplaire.getIdLivreExemplaire().getIdLivre())
                    .append("nomLivre",exemplaire.getIdLivreExemplaire().getTitreLivre())
               ));
        
        BasicDBObject docExemplaireOld = new BasicDBObject();
        docExemplaireOld.append("_id",exemplaire.getRefExemplaire());
        
        this.collectionExemplaire.update(docExemplaireOld,docExemplaireNew);
        
    }
    
/*-----------------------------------------------------------------------------------*/
    //pour recuperer un seul exemplaire avec son id
@Override
    public Exemplaire getOneExemplaire(int idExemplaire) {
        
        BasicDBObject id = new BasicDBObject("_id", idExemplaire);
        
        DBObject obj = this.collectionExemplaire.findOne(id);
        
        Exemplaire exemplaire = new Exemplaire();
        exemplaire.setRefExemplaire((int)obj.get("_id"));
        
        //recuperation de l'edition de l'exemplaire choisi
        DBObject objEdition = (DBObject)obj.get("idEdition");
        exemplaire.setIdEditionExemplaire(new Edition((int)objEdition.get("_id"),
                objEdition.get("nomEdition").toString()));
        
        //recuperation du livre de l'exemplaire choisi
        DBObject objLivre = (DBObject)objEdition.get("idLivre");
        exemplaire.setIdLivreExemplaire(new Livre(
                (int)objLivre.get("_id"),
                objLivre.get("nomLivre").toString()
        ));
        
        
        return exemplaire;
    }

/*-----------------------------------------------------------------------------------*/
    //pour recuperer une liste d'emplaire
@Override
    public List<Exemplaire> getAllExemplaire() {
        
        List<Exemplaire> listeExemplaire = new ArrayList<>();
        
        DBCursor cursor = this.collectionExemplaire.find();
        
        while(cursor.hasNext()){
            DBObject obj = cursor.next();
            Exemplaire exemplaire = new Exemplaire();
            exemplaire.setRefExemplaire((int)obj.get("_id"));

            //recuperation de l'edition de l'exemplaire choisi
            DBObject objEdition = (DBObject)obj.get("idEdition");
            exemplaire.setIdEditionExemplaire(new Edition((int)objEdition.get("_id"),
                    objEdition.get("nomEdition").toString()));

            //recuperation du livre de l'exemplaire choisi
            DBObject objLivre = (DBObject)objEdition.get("idLivre");
            exemplaire.setIdLivreExemplaire(new Livre(
                    (int)objLivre.get("_id"),
                    objLivre.get("nomLivre").toString()));
            //ajout des exemplaire a la liste
            listeExemplaire.add(exemplaire);
        }
      return listeExemplaire;  
    }

}
