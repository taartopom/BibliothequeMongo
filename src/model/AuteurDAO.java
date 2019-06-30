package model;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import modele.Categorie;
import modele.Produit;

public class AuteurDAO implements AuteurInterface {
	
/*-----------------------------------------------------------------------------------*/
    // Connexion
/*-----------------------------------------------------------------------------------*/
   private DB db;
   private DBCollection collectionAuteur;
   
   	public AuteurDAO() {
        // connexion a la DB
        this.db = Connexion.getConnexion();
        
        //connexion a la collection Pays
        this.collectionAuteur = this.db.getCollection("Auteur");
    }
   	
/*-----------------------------------------------------------------------------------*/
    // methode du CRUD
/*-----------------------------------------------------------------------------------*/
   	/*  Attribut de la class auteur
   	 * 	private int idAuteur;
   	 *private String nomAuteur;
	 *private String prenomAuteur;
	 *private String dateNaissanceAuteur;
	 *private Pays paysAuteur;*/
   	
/*-----------------------------------------------------------------------------------*/
	//pour ajouter un auteur à la bdd
@Override
		public void addAuteur(Auteur auteur) {
	       
	        BasicDBObject docAuteur = new BasicDBObject();
	        docAuteur.append("_id", auteur.getIdAuteur())
                 .append("nomAuteur", auteur.getNomAuteur())
                 .append("prenomAuteur", auteur.getPrenomAuteur())
                 .append("dateNaissanceAuteur", auteur.getDateNaissanceAuteur())
                 .append("idPaysAuteur",new BasicDBObject(
                        "_id",auteur.getPaysAuteur().getIdPays())
                        .append("nomPays",auteur.getPaysAuteur().getNomPays()));
        this.collectionAuteur.insert(docAuteur);
		
	}

/*-----------------------------------------------------------------------------------*/
	//pour la suppression d'un auteur
@Override
	public void deleteAuteur(Auteur auteur) {
		BasicDBObject docAuteur = new BasicDBObject();
		docAuteur.append("_id", auteur.getIdAuteur());
		this.collectionAuteur.remove(docAuteur);
		
	}

/*-----------------------------------------------------------------------------------*/
	//pour la modification d'un auteur
@Override
	public void updateAuteur(Auteur auteur) {
		BasicDBObject docAuteurNew = new BasicDBObject();
		docAuteurNew.append("_id", auteur.getIdAuteur())
        .append("nomAuteur", auteur.getNomAuteur())
        .append("prenomAuteur", auteur.getPrenomAuteur())
        .append("dateNaissanceAuteur", auteur.getDateNaissanceAuteur())
        .append("idPaysAuteur",new BasicDBObject(
               "_id",auteur.getPaysAuteur().getIdPays())
               .append("nomPays",auteur.getPaysAuteur().getNomPays()));
		
		BasicDBObject docAuteurOld = new BasicDBObject();
		docAuteurOld.append("_id",auteur.getIdAuteur());
		
		this.collectionAuteur.update(docAuteurOld, docAuteurNew);
		
	}
	
/*-----------------------------------------------------------------------------------*/
	// pour la selection d'une liste d'auteur 

@Override
	public List<Auteur> getAllAuteur() {
		
	List<Auteur> listeAuteur = new ArrayList<>();
    DBCursor cursor = this.collectionAuteur.find();    
    while(cursor.hasNext()){
        DBObject obj = cursor.next();
        Auteur auteur = new Auteur();
        auteur.setIdAuteur((int)obj.get("_id"));
        auteur.setNomAuteur(obj.get("nomAuteur").toString());
        auteur.setPrenomAuteur(obj.get("prenomAuteur").toString());
        auteur.setDateNaissanceAuteur(obj.get("dateNaissanceAuteur").toString());
        
        
        /*Creation d'un document pour recupere le pays dans le document auteur */
        DBObject objPays = (DBObject)obj.get("idPays");
       
        /*maj du pays dans l'objet auteur*/
        auteur.setPaysAuteur(new Pays((int)objPays.get("_id"),
                objPays.get("nomPays").toString()));
        //ajout de l'auteur la liste
        listeAuteur.add(auteur);       
    	}
	
		return listeAuteur;
	}
	
/*-----------------------------------------------------------------------------------*/
	// pour la selection d'un seul auteur
@Override
	public Auteur getOneAuteur(int idAuteur) {
		BasicDBObject id = new BasicDBObject("_id", idAuteur);
		
		DBObject obj = this.collectionAuteur.findOne(id);
		
		Auteur auteur = new Auteur();
		 auteur.setIdAuteur((int)obj.get("_id"));
	        auteur.setNomAuteur(obj.get("nomAuteur").toString());
	        auteur.setPrenomAuteur(obj.get("prenomAuteur").toString());
	        auteur.setDateNaissanceAuteur(obj.get("dateNaissanceAuteur").toString());
	        
	        /*Creation d'un document pour recupere le pays dans le document auteur */
	        DBObject objPays = (DBObject)obj.get("idPays");
	       
	        /*maj du pays dans l'objet auteur*/
	        auteur.setPaysAuteur(new Pays((int)objPays.get("_id"),
	                objPays.get("nomPays").toString()));
		
		return auteur;
	}
  

	   	
}
