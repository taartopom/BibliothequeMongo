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
public class LivreDAO implements LivreInterface{
    
/*-----------------------------------------------------------------------------------*/
    // Connexion
/*-----------------------------------------------------------------------------------*/
   private DB db;
   private DBCollection collectionLivre;
   
   	public LivreDAO() {
        // connexion a la DB
        this.db = Connexion.getConnexion();
        
        //connexion a la collection Pays
        this.collectionLivre = this.db.getCollection("Livre");
    }
    
/*-----------------------------------------------------------------------------------*/
    // methode du CRUD
/*-----------------------------------------------------------------------------------*/ 
        /*Attribut de la class livre
        * private int idLivre;
        * private String titreLivre;
        * private String anneeLivre;
        * private String resumeLivre;
        * private TypeLivre typelivre;
        * private Auteur auteurLivre;
/*-----------------------------------------------------------------------------------*/
    //pour ajouter un livre a la bdd

                
    public void addLivre(Livre livre) {
       BasicDBObject docLivre = new BasicDBObject();
       
       docLivre.append("_id",livre.getIdLivre())
               .append("titreLivre",livre.getTitreLivre())
               .append("anneeLivre",livre.getAnneeLivre())
               .append("resumeLivre", livre.getResumeLivre())
               
               .append("typeLivre",new BasicDBObject(
               "_id",livre.getTypeLivre().getIdTypeLivre())
                    .append("libelle",livre.getTypeLivre().getLibelle())
                       
                    .append("auteurLivre", new BasicDBObject(
                    "_id",livre.getAuteurLivre().getIdAuteur())
                    .append("nomAuteur",livre.getAuteurLivre().getNomAuteur())
                    .append("prenomAuteur",livre.getAuteurLivre().getPrenomAuteur()))
               );
        this.collectionLivre.insert(docLivre);
    }
/*-----------------------------------------------------------------------------------*/
    //pour supprimer un livre dans la bdd
@Override
    public void deleteLivre(Livre livre) {
       BasicDBObject docLivre = new BasicDBObject();
       docLivre.append("_id",livre.getIdLivre());
       this.collectionLivre.remove(docLivre);
    }
    
/*-----------------------------------------------------------------------------------*/
    //pour modifier un livre a la bdd
@Override
    public void updateLivre(Livre livre) {
        BasicDBObject docLivreNew = new BasicDBObject();
         docLivreNew.append("_id",livre.getIdLivre())
               .append("titreLivre",livre.getTitreLivre())
               .append("anneeLivre",livre.getAnneeLivre())
               .append("resumeLivre", livre.getResumeLivre())
               
               .append("typeLivre",new BasicDBObject(
               "_id",livre.getTypeLivre().getIdTypeLivre())
                    .append("libelle",livre.getTypeLivre().getLibelle())
                .append("auteurLivre", new BasicDBObject(
                "_id",livre.getAuteurLivre().getIdAuteur())
                    .append("nomAuteur",livre.getAuteurLivre().getNomAuteur())
                    .append("prenomAuteur",livre.getAuteurLivre().getPrenomAuteur()))
               );
         
        BasicDBObject docLivreOld = new BasicDBObject();
        docLivreOld.append("_id",livre.getIdLivre());
        
        this.collectionLivre.update(docLivreOld, docLivreNew);
        
    }
/*-----------------------------------------------------------------------------------*/
    //pour recuperer un seul livre avec son id
@Override
    public Livre getOnelivre(int idLivre) {
        BasicDBObject id = new BasicDBObject("_id",idLivre);
        
        DBObject obj = this.collectionLivre.findOne(id);
        
        Livre livre  = new Livre();
        livre.setIdLivre((int)obj.get("_id"));
        livre.setTitreLivre(obj.get("titreLivre").toString());
        livre.setAnneeLivre(obj.get("anneeLivre").toString());
        livre.setResumeLivre(obj.get("resumeLivre").toString());
        
        DBObject objTypeLivre = (DBObject)obj.get("typeLivre");
        
        
        livre.setTypeLivre(new TypeLivre((int)objTypeLivre.get("_id"),
                objTypeLivre.get("libelle").toString()));
        DBObject objAuteurLivre = (DBObject)objTypeLivre.get("auteurLivre");

        livre.setAuteurLivre(new Auteur((int)objAuteurLivre.get("_id"),
                objAuteurLivre.get("nomAuteur").toString(),
                objAuteurLivre.get("prenomAuteur").toString()));
        
       
        return livre;
    }
    
/*-----------------------------------------------------------------------------------*/
    //pour recuperer la liste des livres dans la bdd
@Override
    public List<Livre> getAllLivre() {
        
        List<Livre> listeLivre = new ArrayList<>();
        DBCursor cursor = this.collectionLivre.find();
        
        while(cursor.hasNext()){
            
            DBObject obj = cursor.next();
            Livre livre  = new Livre();
            livre.setIdLivre((int)obj.get("_id"));
            livre.setTitreLivre(obj.get("titreLivre").toString());
            livre.setAnneeLivre(obj.get("anneeLivre").toString());
            livre.setResumeLivre(obj.get("resumeLivre").toString());

            // creation du document type livre dans le document livre
            DBObject objTypeLivre = (DBObject)obj.get("typeLivre");
            livre.setTypeLivre(new TypeLivre((int)objTypeLivre.get("_id"),
                    objTypeLivre.get("libelle").toString()));
            
            // creation d'un document auteur dans le document type livre de livre
            DBObject objAuteurLivre = (DBObject)objTypeLivre.get("auteurLivre");
            livre.setAuteurLivre(new Auteur((int)objAuteurLivre.get("_id"),
                    objAuteurLivre.get("nomAuteur").toString(),
                    objAuteurLivre.get("prenomAuteur").toString()));
            
            listeLivre.add(livre);
        }
    return listeLivre;
    }
    
}
