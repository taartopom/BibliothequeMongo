/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.util.List;
import model.Auteur;
import model.AuteurDAO;
import model.Connexion;
import model.Edition;
import model.EditionDAO;
import model.Inscrit;
import model.InscritDAO;
import model.Pays;
import model.PaysDAO;
import model.TypeLivre;
import model.TypeLivreDAO;

/**
 *
 * @author Administrateur
 */
public class Bibliotheque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /******************TEST METHODES*******************/
    
    /*----------------------------------------------------------------------*/
        //Edition
    /*----------------------------------------------------------------------*/
    // pour ajouter des editions
      
        //Edition edition = new Edition(0,"livre de poche");
        //Edition edition = new Edition(1,"J'aime lire");
        //Edition edition = new Edition(2,"Marvel");
        //Edition edition = new Edition(3,"Prestige");
        //EditionDAO edDAO = new EditionDAO();
        
        //edDAO.addEdition(edition);
        
    /*----------------------------------------------------------------------*/
    //pour supprimer une edition
        //Edition edition = new Edition(2,"Marvel");
        //EditionDAO edDAO = new EditionDAO();
        
        //edDAO.deleteEdition(edition);
        
    /*----------------------------------------------------------------------*/
    //pour modifier une edition
        //Edition editionNew = new Edition(3, "FanBook");
        //EditionDAO edDAO = new EditionDAO();
        //edDAO.updateEdition(editionNew);
        
    /*----------------------------------------------------------------------*/
    // getOne 
        //EditionDAO edDAO = new EditionDAO();
        //System.out.println(edDAO.getOneEditeur(3));
  
    /*----------------------------------------------------------------------*/
        //Pays
    /*----------------------------------------------------------------------*/       
      //pour ajouter des pays
        //Pays pays =  new Pays(0, "France");
        //Pays pays =  new Pays(1, "Belgique");
        //Pays pays =  new Pays(2, "Angleterre");
        //Pays pays =  new Pays(3, "a modifier");
        //Pays pays =  new Pays(4, "a supprimer");
        
        //PaysDAO paysDAO = new PaysDAO();
        
        //paysDAO.addPays(pays);
    
    /*----------------------------------------------------------------------*/
    // pour supprimer un pays
        //Pays pays =  new Pays(4, "a supprimer");
        //PaysDAO paysDAO = new PaysDAO();
        
        //paysDAO.deletePays(pays);
    
    /*----------------------------------------------------------------------*/
    //pour modifier un pays
        //Pays paysNew = new Pays(3, "Allemagne");
        //PaysDAO paysDAO = new PaysDAO();
        //paysDAO.updatePays(paysNew);
        
    /*----------------------------------------------------------------------*/
    // getOne 
        //PaysDAO paysDAO = new PaysDAO();
        //System.out.println(paysDAO.getOnePays(2));
    
    /*----------------------------------------------------------------------*/
        //TypeLivre
    /*----------------------------------------------------------------------*/ 
    //pour ajouter des type de livre
        //TypeLivre type = new TypeLivre(0,"policier");
        //TypeLivre type = new TypeLivre(1,"fantastique");
        //TypeLivre type = new TypeLivre(2,"enfant");
        //TypeLivre type = new TypeLivre(4,"a modifier");
        //TypeLivre type = new TypeLivre(5,"a supprimer");
        
        //TypeLivreDAO tpDAO = new TypeLivreDAO();
        
        //tpDAO.addTypeLivre(type);
        
    /*----------------------------------------------------------------------*/ 
    //pour supprimer un type de livre 
        //TypeLivre type = new TypeLivre(5,"a supprimer");
        //TypeLivreDAO tpDAO = new TypeLivreDAO();
        
        //tpDAO.deleteTypeLivre(type);
        
    /*----------------------------------------------------------------------*/
    //pour modifier un pays
        //TypeLivre type =  new TypeLivre(4,"documentaire");
        //TypeLivreDAO tpDAO =  new TypeLivreDAO();
        
        //tpDAO.updateTypeLivre(type);
        
    /*----------------------------------------------------------------------*/
    //GetOne
        //TypeLivreDAO tpDAO = new TypeLivreDAO();
        //System.out.println(tpDAO.getOneTypeLivre(4));
        
        
    /*----------------------------------------------------------------------*/
        //Inscrit
    /*----------------------------------------------------------------------*/
    // pour ajouter un inscrit
        //Inscrit inscrit = new Inscrit(0,"dupont","pierre", "13/06/1965","10 rue des arbres","Lille",59000,"pd@email.com","0328629342", "0628629342");
        //Inscrit inscrit = new Inscrit(1,"biere","jean", "15/05/1973","16 les hautes herbes","Lomme",59800,"bj@email.com","0326859712", "0663745701");
        //Inscrit inscrit = new Inscrit(2,"a","modifier", "15/05/1973","16 les hautes herbes","Lomme",59800,"bj@email.com","0326859712", "0663745701");
        //Inscrit inscrit = new Inscrit(3,"a","supprimer", "15/05/1973","16 les hautes herbes","Lomme",59800,"bj@email.com","0326859712", "0663745701");

        //InscritDAO insDAO = new InscritDAO();
        //insDAO.addInscrit(inscrit);

   /*----------------------------------------------------------------------*/ 
    //pour supprimer un inscrit
        //InscritDAO insDAO = new InscritDAO();
        //Inscrit inscrit = new Inscrit(3,"a","supprimer", "15/05/1973","16 les hautes herbes","Lomme",59800,"bj@email.com","0326859712", "0663745701");

        //insDAO.deleteInscrit(inscrit);
   /*----------------------------------------------------------------------*/ 
    //pour modifier un inscrit
        //Inscrit inscrit = new Inscrit(2,"Connor","sarah", "15/05/1973","2 rue des robots","Socx",59380,"sc@email.com","0326859712", "0663745701");
        //InscritDAO insDAO = new InscritDAO();
        
        //insDAO.updateInscrit(inscrit);
           
/*----------------------------------------------------------------------*/ 
    //pour selectionner un seul inscrit
        //InscritDAO insDAO = new InscritDAO();
        //System.out.println(insDAO.getOneInscrit(2));
        
/*----------------------------------------------------------------------*/
    //Auteur
/*----------------------------------------------------------------------*/
    // pour ajouter un auteur
    //Pays pays = new Pays(1,"France");
    //Auteur auteurNew = new Auteur(2, "Abel", "Barbara", "01/10/2006",pays);
    //Auteur auteur = new Auteur(5, "Cool", "Zep", "28/11/1986", new Pays(4, "Espagne"));
    //Auteur auteur = new Auteur(0, "bref", "Zep", "28/11/1986", new Pays(0, "France"));
    //Auteur auteur = new Auteur(1, "a", "modifier", "28/11/1986", new Pays(0, "France"));
     //Auteur auteur = new Auteur(4, "a", "supprimer", "28/11/1986", new Pays(0, "France"));
    //AuteurDAO auteurDAO = new AuteurDAO();
    
    //auteurDAO.addAuteur(auteur);
    
    /*----------------------------------------------------------------------*/
    // pour modifier un auteur
        //Auteur auteur = new Auteur(1, "jack", "pot", "30/07/1694", new Pays(2, "Allemangne"));
        //AuteurDAO auDAO = new AuteurDAO();
        
        //auDAO.updateAuteur(auteur);
        
/*----------------------------------------------------------------------*/
    // pour supprimer un auteur
        //Auteur auteur = new Auteur(4, "a", "supprimer", "28/11/1986", new Pays(0, "France"));
        //AuteurDAO auDAO =  new AuteurDAO();
        
        //auDAO.deleteAuteur(auteur);
/*----------------------------------------------------------------------*/
    // pour selectionner un auteur
        AuteurDAO auDAO = new AuteurDAO();
        System.out.println(auDAO.getOneAuteur(2)); 
        
    
    }   
    
}
