package model;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class InscritDAO implements InscritInterface{
	
/*-----------------------------------------------------------------------------------*/
    // Connexion
/*-----------------------------------------------------------------------------------*/
   private DB db;
   private DBCollection collectionInscrit;
   
   	public InscritDAO() {
        // connexion a la DB
        this.db = Connexion.getConnexion();
        
        //connexion a la collection Pays
        this.collectionInscrit = this.db.getCollection("Auteur");
    }

/*-----------------------------------------------------------------------------------*/
    // methode du CRUD
/*-----------------------------------------------------------------------------------*/   	
   	/*Attribut de la class Inscrit
   	 * private int idInscrit;
     * private String nomInscrit;
     * private String prenomInscrit;
     * private String dateNaissanceInscrit;
     * private String rueInscrit;
     * private String villeInscrit;
     * private int cpInscrit;
     * private String emailInscrit;
     * private int numTelInscrit;
     * private int numGSMIscrit;
   	 */
   	
/*-----------------------------------------------------------------------------------*/  
   	//pour ajouter un nouvel inscrit dans la database
@Override
	public void addInscrit(Inscrit inscrit) {
	
    	BasicDBObject docInscrit = new BasicDBObject();
    	docInscrit.append("_id",inscrit.getIdInscrit())
    		.append("nomInscrit",inscrit.getNomInscrit())
    		.append("prenomInscrit", inscrit.getPrenomInscrit())
    		.append("dateNaissanceInscrit", inscrit.getDateNaissanceInscrit())
    		.append("rueInscrit", inscrit.getRueInscrit())
    		.append("villeInscrit", inscrit.getVilleInscrit())
    		.append("cpInscrit", inscrit.getCpInscrit())
    		.append("emailInscrit", inscrit.getEmailInscrit())
    		.append("numTelInbscrit",inscrit.getNumTelInscrit())
    		.append("numGSMIscrit", inscrit.getNumGSMIscrit());

    	this.collectionInscrit.insert(docInscrit);
		
	}

/*-----------------------------------------------------------------------------------*/  
	//pour supprimer un inscrit avec son id
@Override
	public void deleteInscrit(Inscrit inscrit) {
		
		BasicDBObject docInscrit = new BasicDBObject();
		docInscrit.append("_id", inscrit.getIdInscrit());
		
		this.collectionInscrit.remove(docInscrit);
		
	}

/*-----------------------------------------------------------------------------------*/  
	//pour modifier les informations d'un inscrit
@Override
	public void updateInscrit(Inscrit inscrit) {
		
    	BasicDBObject docInscritNew = new BasicDBObject();
    	docInscritNew.append("_id",inscrit.getIdInscrit())
    		.append("nomInscrit",inscrit.getNomInscrit())
    		.append("prenomInscrit", inscrit.getPrenomInscrit())
    		.append("dateNaissanceInscrit", inscrit.getDateNaissanceInscrit())
    		.append("rueInscrit", inscrit.getRueInscrit())
    		.append("villeInscrit", inscrit.getVilleInscrit())
    		.append("cpInscrit", inscrit.getCpInscrit())
    		.append("emailInscrit", inscrit.getEmailInscrit())
    		.append("numTelInbscrit",inscrit.getNumTelInscrit())
    		.append("numGSMIscrit", inscrit.getNumGSMIscrit());
    	
    	BasicDBObject docInscritOld = new BasicDBObject();
    	docInscritOld.append("_id", inscrit.getIdInscrit());
    	
    	this.collectionInscrit.update(docInscritOld, docInscritNew);
    	
		
	}
	
/*-----------------------------------------------------------------------------------*/  
   	//pour recuperer tous les inscrits
@Override
	public List<Inscrit> getAllInscrit() {
		List<Inscrit> listeInscrit = new ArrayList<>();
	    DBCursor cursor = this.collectionInscrit.find();    
	    while(cursor.hasNext()){
	        DBObject obj = cursor.next();
	        Inscrit inscrit = new Inscrit();
	        inscrit.setIdInscrit((int)obj.get("_id"));
	        inscrit.setNomInscrit(obj.get("nomInscrit").toString());
	        inscrit.setPrenomInscrit(obj.get("prenomInscrit").toString());
	        inscrit.setDateNaissanceInscrit(obj.get("dateNaissanceInscrit").toString());
	        inscrit.setRueInscrit(obj.get("rueInscrit").toString());
	        inscrit.setVilleInscrit(obj.get("villeInscrit").toString());
	        inscrit.setCpInscrit((int)obj.get("cpInscrit"));
	        inscrit.setEmailInscrit(obj.get("emailInscrit").toString());
	        inscrit.setNumTelInscrit((int)obj.get("numTelInscrit"));
	        inscrit.setNumGSMIscrit((int)obj.get("numGSMInscrit"));

	        //ajout de l'inscrit la liste des inscrits
	        listeInscrit.add(inscrit);       
	    	}
		return listeInscrit;
	}
	
/*-----------------------------------------------------------------------------------*/  
   	//pour recuperer un seul inscrit

	@Override
	public Inscrit getOneInscrit(int idInscrit) {
		BasicDBObject id = new BasicDBObject("_id", idInscrit);
		
		DBObject obj = this.collectionInscrit.findOne(id);
		Inscrit inscrit = new Inscrit();
        inscrit.setIdInscrit((int)obj.get("_id"));
        inscrit.setNomInscrit(obj.get("nomInscrit").toString());
        inscrit.setPrenomInscrit(obj.get("prenomInscrit").toString());
        inscrit.setDateNaissanceInscrit(obj.get("dateNaissanceInscrit").toString());
        inscrit.setRueInscrit(obj.get("rueInscrit").toString());
        inscrit.setVilleInscrit(obj.get("villeInscrit").toString());
        inscrit.setCpInscrit((int)obj.get("cpInscrit"));
        inscrit.setEmailInscrit(obj.get("emailInscrit").toString());
        inscrit.setNumTelInscrit((int)obj.get("numTelInscrit"));
        inscrit.setNumGSMIscrit((int)obj.get("numGSMInscrit"));
		
		return inscrit;
	}
   	


}
