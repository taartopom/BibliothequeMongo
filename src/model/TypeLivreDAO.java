package model;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class TypeLivreDAO implements TypeLivreInterface {
/*-----------------------------------------------------------------------------------*/
    // Connexion
/*-----------------------------------------------------------------------------------*/
   private DB db;
   private DBCollection collectionTypeLivre;
   
/*-----------------------------------------------------------------------------------*/
   // Connexion a la db
/*-----------------------------------------------------------------------------------*/  
  	public TypeLivreDAO() {
        // connexion a la DB
        this.db = Connexion.getConnexion();
        
        //connexion a la collection Pays
        this.collectionTypeLivre = this.db.getCollection("TypeLivre");
    }  
/*-----------------------------------------------------------------------------------*/
    // Methodes pour le CRUD
/*-----------------------------------------------------------------------------------*/
    /*
     * Attibut de class
     * private int idTypeLivre;
     * private String nomLibelle;
     
/*-----------------------------------------------------------------------------------*/
  	//pour l'ajout d'un type de livre
	@Override
	public void addTypeLivre(TypeLivre typeLivre) {
	    // creation d'un document pays
	    BasicDBObject docTypeLivre = new BasicDBObject();
	        
	    //ajout des attibuts pour la création du document pays
	    docTypeLivre.append("_id", typeLivre.getIdTypeLivre())
	              .append("nomTypeLivre", typeLivre.getLibelle());
	        
	    //on insert le document dans la collection pays dans la DB
	    this.collectionTypeLivre.insert(docTypeLivre);
		
	}
	
/*-----------------------------------------------------------------------------------*/
	//pour la suppression d'un type de livre
	@Override
	public void deleteTypeLivre(TypeLivre typeLivre) {
		// creation d'un document pays
        BasicDBObject docTypeLivre = new BasicDBObject();
        
        //recuperer l'id du produit a supprimer
        docTypeLivre.append("_id", typeLivre.getIdTypeLivre()); 
        
        //on supprime le document dans la collection pays dans la DB
        this.collectionTypeLivre.remove(docTypeLivre); 
		
	}
	
/*-----------------------------------------------------------------------------------*/
	//Pour la modification d'un type de livre
	@Override
	public void updateTypeLivre(TypeLivre typeLivre) {
		// creation d'un nouveau document pays
        BasicDBObject docTypeLivreNew = new BasicDBObject();
        
        //creation du nouveau pays
        docTypeLivreNew.append("_id", typeLivre.getIdTypeLivre())
                       .append("Libelle", typeLivre.getLibelle());
        
        // creation d'un document pays
        BasicDBObject docTypeLivreOld = new BasicDBObject();
        
        //recuperer l'id du produit a supprimer
        docTypeLivreOld.append("_id", typeLivre.getIdTypeLivre());
        
        //remplacement de l'ancien document pays par le nouveaux document pays
        this.collectionTypeLivre.update(docTypeLivreNew, docTypeLivreOld); 
		
	}

/*-----------------------------------------------------------------------------------*/
	// pour reccuperer la liste des types de livres
	@Override
	public List<TypeLivre> getAllTypeLivre() {
		 // creation d'une liste de pays
        List<TypeLivre> listeTypeLivre = new ArrayList<>(); 
        
        //nous parcourons les document de la collection
        DBCursor cursor = this.collectionTypeLivre.find();
        
        //hasnext est une methodes 
        while(cursor.hasNext()){
            DBObject objTypeLivre = cursor.next();
            TypeLivre typeLivre = new TypeLivre();
            typeLivre.setIdTypeLivre((int)objTypeLivre.get("_id"));
            typeLivre.setLibelle(objTypeLivre.get("Libelle").toString());

            listeTypeLivre.add(typeLivre);       
        }
        return listeTypeLivre;

	}

/*-----------------------------------------------------------------------------------*/
	//pour recuperer un seul type de livre avec son id
	@Override
	public TypeLivre getOneTypeLivre(int idTypeLivre) {
		 // creation d'un document pays
        BasicDBObject id = new BasicDBObject("_id", idTypeLivre);
        
        //recuperation d'un objet dans la collection pays
        DBObject objTypeLivre = this.collectionTypeLivre.findOne(id);
        
        //
        TypeLivre typeLivre= new TypeLivre();
        typeLivre.setIdTypeLivre((int) objTypeLivre.get("_id"));
        typeLivre.setLibelle(objTypeLivre.get("Libelle").toString());
  
        return typeLivre;
	}

}
