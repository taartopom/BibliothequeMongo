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
public class PaysDAO implements PaysInterface {
/*-----------------------------------------------------------------------------------*/
    // Connexion
/*-----------------------------------------------------------------------------------*/
   private DB db;
   private DBCollection collectionPays;
/*-----------------------------------------------------------------------------------*/
    // Constructeur
/*-----------------------------------------------------------------------------------*/  
   
    public PaysDAO() {
        // connexion a la DB
        this.db = Connexion.getConnexion();
        
        //connexion a la collection Pays
        this.collectionPays = this.db.getCollection("Pays");
    }
    
/*-----------------------------------------------------------------------------------*/
    // methode du CRUD
/*-----------------------------------------------------------------------------------*/
    /* Attribut de la class Pays:
        private int idPays;
        private String nomPays;


/*-----------------------------------------------------------------------------------*/
    //ajouter un pays
@Override
	public void addPays(Pays pays) {
	    // creation d'un document pays
	    BasicDBObject docPays = new BasicDBObject();
	        
	    //ajout des attibuts pour la création du document pays
	    docPays.append("_id", pays.getIdPays())
	           .append("nomPays", pays.getNomPays());
	        
	    //on insert le document dans la collection pays dans la DB
	    this.collectionPays.insert(docPays);
	}
/*-----------------------------------------------------------------------------------*/
	//supprimer un pays
@Override
	public void deletePays(Pays pays) {
	
	        // creation d'un document pays
	        BasicDBObject docPays = new BasicDBObject();
	        
	        //recuperer l'id du produit a supprimer
	        docPays.append("_id", pays.getIdPays()); 
	        
	        //on supprime le document dans la collection pays dans la DB
	        this.collectionPays.remove(docPays); 
	}
/*-----------------------------------------------------------------------------------*/
	//modifier pays
@Override
	public void updatePays(Pays pays) {
	   
	        // creation d'un nouveau document pays
	        BasicDBObject docPaysNew = new BasicDBObject();
	        
	        //creation du nouveau pays
	        docPaysNew.append("_id", pays.getIdPays())
	                .append("nomPays", pays.getNomPays());
	        
	        // creation d'un document pays
	        BasicDBObject docPaysOld = new BasicDBObject();
	        
	        //recuperer l'id du produit a supprimer
	        docPaysOld.append("_id", pays.getIdPays());
	        
	        //remplacement de l'ancien document pays par le nouveaux document pays
	        this.collectionPays.update(docPaysOld, docPaysNew); 
	}
/*-----------------------------------------------------------------------------------*/
	//selection un seul pays
@Override
	public Pays getOnePays(int idPays) {
	  
	        // creation d'un document pays
	        BasicDBObject id = new BasicDBObject("_id", idPays);
	        
	        //recuperation d'un objet dans la collection pays
	        DBObject objPays = this.collectionPays.findOne(id);
	        
	        //
	        Pays pays= new Pays();
	        pays.setIdPays((int) objPays.get("_id"));
	        pays.setNomPays(objPays.get("nom¨Pays").toString());
	  
	        return pays;
	 
	}
/*-----------------------------------------------------------------------------------*/
	//selectionner tous les pays
@Override
	public List<Pays> getAllPays() {
	        // creation d'une liste de pays
	        List<Pays> listePays = new ArrayList<>(); 
	        
	        //nous parcourons les document de la collection
	        DBCursor cursor = this.collectionPays.find();
	        
	        //hasnext est une methodes 
	        while(cursor.hasNext()){
	            DBObject objPays = cursor.next();
	            Pays pays = new Pays();
	            pays.setIdPays((int)objPays.get("_id"));
	            pays.setNomPays(objPays.get("nomPays").toString());
	
	            listePays.add(pays);       
	        }
	        return listePays;
    }
}
