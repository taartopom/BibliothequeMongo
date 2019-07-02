package model;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class EditionDAO implements EditionInterface {
/*-----------------------------------------------------------------------------------*/
    // Connexion
/*-----------------------------------------------------------------------------------*/
   private DB db;
   private DBCollection collectionEdition;
   
/*-----------------------------------------------------------------------------------*/
   // Connexion a la db
/*-----------------------------------------------------------------------------------*/  
  	public EditionDAO() {
        // connexion a la DB
        this.db = Connexion.getConnexion();
        
        //connexion a la collection Pays
        this.collectionEdition = this.db.getCollection("Edition");
    }  
  	
/*-----------------------------------------------------------------------------------*/
    // methode du CRUD
/*-----------------------------------------------------------------------------------*/  
    /*
     * Attibut de class
     * private int idEdition;
     * private String nomLibelle;
    
/*-----------------------------------------------------------------------------------*/  
  	//selection d'une liste d'edition 
	@Override
	public List<Edition> getAllEditeur() {
		 // creation d'une liste de pays
        List<Edition> listeEdition = new ArrayList<>(); 
        
        //nous parcourons les document de la collection
        DBCursor cursor = this.collectionEdition.find();
        
        //hasnext est une methodes 
        while(cursor.hasNext()){
            DBObject objEdition = cursor.next();
            Edition edition = new Edition();
            edition.setIdEdition((int)objEdition.get("_id"));
            edition.setNomLibelle(objEdition.get("nomEdition").toString());

            listeEdition.add(edition);       
        }
        return listeEdition;
	}
/*-----------------------------------------------------------------------------------*/ 
	//selection d'une seule edition
	@Override
	public Edition getOneEditeur(int idEdition) {
		
        // creation d'un document pays
        BasicDBObject id = new BasicDBObject("_id", idEdition);
        
        //recuperation d'un objet dans la collection pays
        DBObject objEdition = this.collectionEdition.findOne(id);
        
        //
        Edition edition = new Edition();
        edition.setIdEdition((int) objEdition.get("_id"));
        edition.setNomLibelle(objEdition.get("nomLibelle").toString());
  
        return edition;
	}
	
/*-----------------------------------------------------------------------------------*/ 
	//pour l'ajout d'une edition
	@Override
	public void addEdition(Edition edition) {
	    // creation d'un document pays
	    BasicDBObject docEdition = new BasicDBObject();
	        
	    //ajout des attibuts pour la création du document pays
	    docEdition.append("_id", edition.getIdEdition())
	              .append("nomEdition", edition.getNomLibelle());
	        
	    //on insert le document dans la collection pays dans la DB
	    this.collectionEdition.insert(docEdition);
		
	}
	
/*-----------------------------------------------------------------------------------*/ 
	//pour la suppression d'une edition
	@Override
	public void deleteEdition(Edition edition) {
        // creation d'un document pays
        BasicDBObject docEdition = new BasicDBObject();
        
        //recuperer l'id du produit a supprimer
        docEdition.append("_id", edition.getIdEdition()); 
        
        //on supprime le document dans la collection pays dans la DB
        this.collectionEdition.remove(docEdition); 
		
	}
	
/*-----------------------------------------------------------------------------------*/ 
	//pour la modification d'une edition
	@Override
	public void updateEdition(Edition edition) {
        // creation d'un nouveau document pays
        BasicDBObject docEditionNew = new BasicDBObject();
        
        //creation du nouveau pays
        docEditionNew.append("_id", edition.getIdEdition())
                     .append("nomLibelle", edition.getNomLibelle());
        
        // creation d'un document pays
        BasicDBObject docEditionOld = new BasicDBObject();
        
        //recuperer l'id du produit a supprimer
        docEditionOld.append("_id", edition.getIdEdition());
        
        //remplacement de l'ancien document pays par le nouveaux document pays
        this.collectionEdition.update(docEditionOld, docEditionNew); 
		
	}

	

}
