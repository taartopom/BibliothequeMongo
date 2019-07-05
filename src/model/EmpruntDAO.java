package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class EmpruntDAO implements EmpruntInterface {
/*-----------------------------------------------------------------------------------*/
    // Connexion
/*-----------------------------------------------------------------------------------*/
   private DB db;
   private DBCollection collectionEmprunt;
   
/*-----------------------------------------------------------------------------------*/
   // Connexion a la db
/*-----------------------------------------------------------------------------------*/  
  	public EmpruntDAO() {
        // connexion a la DB
        this.db = Connexion.getConnexion();
        
        //connexion a la collection Pays
        this.collectionEmprunt = this.db.getCollection("Emprunt");
    }
  	
/*-----------------------------------------------------------------------------------*/
    // methode du CRUD
/*-----------------------------------------------------------------------------------*/  
  	/*Attribut de la class emprunt
  	 * private int idEmprunt;
     * private String dateEmprunt;
     * private int delaisEmprunt;
     * private Inscrit idInscritEmprunt;
     * private Exemplaire refExemplaireEmprunt; */

/*-----------------------------------------------------------------------------------*/  
  	// pour l'ajout d'un emprunt de livre
@Override
	public void addEmprunt(Emprunt emprunt) {
		BasicDBObject docEmprunt = new BasicDBObject("_id",emprunt.getIdEmprunt())
				.append("dateEmprunt", emprunt.getDateEmprunt())
				.append("delaiEmprunt", emprunt.getDelaisEmprunt())
				.append("idInscritEmprunt", new BasicDBObject("_id", emprunt.getIdInscritEmprunt()))
				.append("contenir",emprunt.getListeRefExemplaireEmprunt());
		this.collectionEmprunt.insert(docEmprunt);
		
	}

/*-----------------------------------------------------------------------------------*/  
	//pour la suppression d'un emprunt de livre
@Override
	public void deleteEmprunt(Emprunt emprunt) {
            BasicDBObject docEmprunt = new BasicDBObject("_id",emprunt.getIdEmprunt());
            DBObject obj = this.collectionEmprunt.findOne(docEmprunt);

            this.collectionEmprunt.remove(obj);
	
	}

/*-----------------------------------------------------------------------------------*/  
 	//pour afficher la  liste des emprunt
	@Override
	public List<Emprunt> getAllEmprunt() {
		List<Emprunt> listeEmprunt =  new ArrayList<>();
		
		DBCursor cursor = this.collectionEmprunt.find();
		
		while(cursor.hasNext()) {
			DBObject objEmprunt = cursor.next();
			
			Emprunt emprunt = new Emprunt();
			emprunt.setIdEmprunt((int)objEmprunt.get("-id"));
			emprunt.setDateEmprunt(objEmprunt.get("dateEmprunt").toString());
			emprunt.setDelaisEmprunt((int)objEmprunt.get("delaisEmprunt"));
		}
		return listeEmprunt;
	}

/*-----------------------------------------------------------------------------------*/
	//pour selectionner un emprunt avec son Id
	@Override
	public Emprunt getOneEmprunt(int idEmprunt) {
		// TODO Auto-generated method stub
		return null;
	}
	
/*-----------------------------------------------------------------------------------*/
	//pour ajouter un livre a emprunter
        /*Attribut de la class livre
        * private int idLivre;
        * private String titreLivre;
        * private String anneeLivre;
        * private String resumeLivre;
        * private TypeLivre typelivre;
        * private Auteur auteurLivre;*/
        
        
	@Override
	public void addLivreEmprunt(Emprunt emprunt, Livre livre) {
          /*  //création de l'ancienne commande avec juste l'id
            BasicDBObject docEmpruntOld = new BasicDBObject("_id", emprunt.getIdEmprunt());
            //recherche de la commande
            DBObject objEmprunt = this.collectionEmprunt.findOne(docEmpruntOld);
            //récupération de la liste des produits de la commande
            BasicDBList listLivre = (BasicDBList) objEmprunt.get("contenir");
                        
            //ajout du nouveau Livre à la liste des livre a emprunter
            BasicDBObject newLivreEmprunt =  new BasicDBObject("_id", livre.getIdLivre())
                .append("titreLivre",livre.getTitreLivre())
                .append("anneeLivre",livre.getAnneeLivre())
                .append("resumeLivre", livre.getResumeLivre());

            /*
            //ajout du nouveau Livre à la liste des livre a emprunter
            BasicDBObject newLivreEmprunt =  new BasicDBObject("_id", livre.getIdLivre())
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
            listLivre.add(newLivreEmprunt);
            
            //création de la nouvelle commande
            BasicDBObject docEmpruntNew =  new BasicDBObject("_id", emprunt.getIdEmprunt())
                    .append("dateEmprunt",emprunt.getDateEmprunt())
                    .append("delaisEmprunt",emprunt.getDelaisEmprunt());
            
            this.collectionEmprunt.update(docEmpruntOld, docEmpruntNew);*/
                    
            

	}

/*-----------------------------------------------------------------------------------*/
	//pour supprimer un livre a emprunter
	@Override
	public void deleteLivreEmprunt(Emprunt emprunt, Livre livre) {
		// TODO Auto-generated method stub
		
	}

/*-----------------------------------------------------------------------------------*/
	//pour modifier un livre de l'emprunt
	@Override
	public void modifierLivreEmprunt(Emprunt emprunt, Livre livre) {
		// TODO Auto-generated method stub
		
	}  



}
