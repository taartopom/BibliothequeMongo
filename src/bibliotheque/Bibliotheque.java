/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import com.mongodb.BasicDBObject;
import controller.ExemplaireController;
import controller.InscritController;
import java.util.ArrayList;
import java.util.List;
import model.Auteur;
import model.AuteurDAO;
import model.Connexion;
import model.Edition;
import model.EditionDAO;
import model.Emprunt;
import model.EmpruntDAO;
import model.Exemplaire;
import model.ExemplaireDAO;
import model.Inscrit;
import model.InscritDAO;
import model.Livre;
import model.LivreDAO;
import model.Pays;
import model.PaysDAO;
import model.TypeLivre;
import model.TypeLivreDAO;
import view.ExemplaireVue;
import view.InscritVue;

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
    //pour selectionner la liste des editions
        //EditionDAO edDAO = new EditionDAO();
        //List<Edition> listEdition = edDAO.getAllEditeur();
        //System.out.println(listEdition);
  
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
    //pour selectionner la liste des pays
        //PaysDAO paDAO = new PaysDAO();
        //List<Pays> listPays = paDAO.getAllPays();
        //System.out.println(listPays);
    
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
    //pour selectionner la liste des typeLivre    
        //TypeLivreDAO tpLivre = new TypeLivreDAO();
        //List<TypeLivre> listTpLivre = tpLivre.getAllTypeLivre();
        //System.out.println(listTpLivre);
        
        
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
    //pour selectionner la liste des inscrits    
        //InscritDAO insDAO = new InscritDAO();
        //List<Inscrit> listInscrit = insDAO.getAllInscrit();
        //System.out.println(listInscrit);
        
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
        //AuteurDAO auDAO = new AuteurDAO();
        //System.out.println(auDAO.getOneAuteur(5)); 
        
/*----------------------------------------------------------------------*/
    // pour selectionner la liste des auteurs
        //AuteurDAO auDAO = new AuteurDAO();
        //List<Auteur> listAuteur = auDAO.getAllAuteur();
        //System.out.println(listAuteur);
    
      
/*----------------------------------------------------------------------*/
    //Livre
/*----------------------------------------------------------------------*/
    // pour ajouter un livre
        //LivreDAO liDAO =  new LivreDAO();
        //Livre livre  =  new Livre(0, "Level 26","2011", "un livre sur un meutrier en série", new TypeLivre(0, "policier"), new Auteur(2,"Abel", "Barbara"));
        //Livre livre  =  new Livre(2, "Harry potter","2001", "un magicien avec une belle baguette", new TypeLivre(1, "fantastique"), new Auteur(2,"Abel", "Barbara"));
        //Livre livre  =  new Livre(3, "a modifier", "un magicien avec une belle baguette", new TypeLivre(1, "fantastique"), new Auteur(2,"Abel", "Barbara"));
        //Livre livre  =  new Livre(4, "a supprimer", "un magicien avec une belle baguette", new TypeLivre(1, "fantastique"), new Auteur(2,"Abel", "Barbara"));

    //liDAO.addLivre(livre);

/*----------------------------------------------------------------------*/
    // pour modifier un livre
        //Livre livre  =  new Livre(3, " pokemon","1998", "attrapé les tous", new TypeLivre(1, "fantastique"), new Auteur(2,"Abel", "Barbara"));
        //LivreDAO liDAO = new LivreDAO();
        
        //liDAO.updateLivre(livre);
    
/*----------------------------------------------------------------------*/ 
    //pour supprimer un livre
        //Livre livre  =  new Livre(4, "a supprimer", "un magicien avec une belle baguette", new TypeLivre(1, "fantastique"), new Auteur(2,"Abel", "Barbara"));
        //LivreDAO liDAO =  new LivreDAO();
        
        //liDAO.deleteLivre(livre);
    
/*----------------------------------------------------------------------*/
    // pour selectionner un livre
        //LivreDAO liDAO = new LivreDAO();
        //System.out.println(liDAO.getOnelivre(2)); 
        
/*----------------------------------------------------------------------*/  
// pour selectionner la liste des auteurs 
        //LivreDAO liDAO = new LivreDAO();
        //List<Livre> listLivre = liDAO.getAllLivre();
        //System.out.println(listLivre);
        
        
/*----------------------------------------------------------------------*/
    //Exemplaire
/*----------------------------------------------------------------------*/
    //Pour l'ajout d'un exemplaire
        //ExemplaireDAO exDAO =  new ExemplaireDAO();
        
        /***** premier exemplaire ajoute******/
        //Edition idEditionExemplaire = new Edition(2, "Marvel");
        //Livre idLivreExemplaire = new Livre (3, " pokemon","1998", "attrapé les tous", new TypeLivre(1, "fantastique"), new Auteur(2,"Abel", "Barbara"));
        //Exemplaire exemplaire =  new Exemplaire(0, idEditionExemplaire, idLivreExemplaire);
        
         /***** deuxieme exemplaire ajoute******/
        //Edition idEditionExemplaire = new Edition(10, "DC");
        //Livre idLivreExemplaire = new Livre (9, " Batman","1998", "Contre le joker", new TypeLivre(1, "fantastique"), new Auteur(7,"Ali", "Baba"));
        //Exemplaire exemplaire =  new Exemplaire(1, idEditionExemplaire, idLivreExemplaire);
        
         /***** troisieme exemplaire ajoute******/
        //Edition idEditionExemplaire = new Edition(10, "DC");
        //Livre idLivreExemplaire = new Livre (5, "  a modifier","1998", "Contre le joker", new TypeLivre(1, "fantastique"), new Auteur(7,"Ali", "Baba"));
        //Exemplaire exemplaire =  new Exemplaire(3, idEditionExemplaire, idLivreExemplaire);
        
        /***** 4eme exemplaire ajoute******/
        //Edition idEditionExemplaire = new Edition(10, "DC");
        //Livre idLivreExemplaire = new Livre (5, "  a supprimer","1998", "Contre le joker", new TypeLivre(1, "fantastique"), new Auteur(7,"Ali", "Baba"));
        //Exemplaire exemplaire =  new Exemplaire(15, idEditionExemplaire, idLivreExemplaire);
        //exDAO.addExemplaire(exemplaire);

/*----------------------------------------------------------------------*/
    //Pour modifier un exemplaire
        //ExemplaireDAO exDAO =  new ExemplaireDAO();
        
        //Edition idEditionExemplaire = new Edition(6, "PetitMousse");
        //Livre idLivreExemplaire = new Livre (7, "Ane trotro","1998", "trop trop rigolo", new TypeLivre(1, "fantastique"), new Auteur(7,"Ali", "Baba"));
        //Exemplaire exemplaire =  new Exemplaire("numExemplaire2", idEditionExemplaire, idLivreExemplaire);
        
        //exDAO.updateExemplaire(exemplaire);
        
/*----------------------------------------------------------------------*/
    //Pour suprimer un exemplaire
        //ExemplaireDAO exDAO =  new ExemplaireDAO();
        //Edition idEditionExemplaire = new Edition(10, "DC");
        //Livre idLivreExemplaire = new Livre (5, "  a supprimer","1998", "Contre le joker", new TypeLivre(1, "fantastique"), new Auteur(7,"Ali", "Baba"));
        //Exemplaire exemplaire =  new Exemplaire("numExemplaire3", idEditionExemplaire, idLivreExemplaire);
        //exDAO.deleteExemplaire(exemplaire);
        
/*----------------------------------------------------------------------*/
    //Pour selection un exemplaire
        //ExemplaireDAO exDAO =  new ExemplaireDAO();
        //System.out.println(exDAO.getOneExemplaire(0));
        
/*----------------------------------------------------------------------*/
    //Pour selection un exemplaire
        //ExemplaireDAO exDAO =  new ExemplaireDAO();
        //List<Exemplaire> listExemplaire = exDAO.getAllExemplaire();
        //System.out.println(listExemplaire);
/*----------------------------------------------------------------------*/
    //Emprunt
/*----------------------------------------------------------------------*/
    // pour ajouter un emprunt
        //EmpruntDAO emDAO =  new EmpruntDAO();
        //Emprunt emprunt  = new Emprunt(0, "02/07/2019", 15);
        //Emprunt emprunt  = new Emprunt(1, "a modifier", 6);
        //Emprunt emprunt  = new Emprunt(2, "03/06/2019", 0);
        //emDAO.addEmprunt(emprunt);
        
/*----------------------------------------------------------------------*/
    // pour modifier un emprunt
        //EmpruntDAO emDAO =  new EmpruntDAO();
        //Emprunt emprunt  = new Emprunt(2, "a supprimer", 0);
        
        //emDAO.deleteEmprunt(emprunt);

/*----------------------------------------------------------------------*/
/************************A REVOIR************************/ 
   /* //ajouter un livre a l'emprunt
        EmpruntDAO emDAO =  new EmpruntDAO();
        Emprunt emprunt = new Emprunt(4, "03/07/19", 8);
       
        List<BasicDBObject> listeExp = new ArrayList<>();
       
        BasicDBObject exemplaire = new BasicDBObject("_id",15)
               .append("idEdition",new BasicDBObject("_id",10))
                    .append("idLivre", new BasicDBObject("_id", 2));
               
             listeExp.add(exemplaire);
        
        emDAO.addLivreEmprunt(emprunt,new Livre(9, "Batman"));*/
/*----------------------------------------------------------------------*/
    //Controller LIVRE
/*----------------------------------------------------------------------*/
        InscritVue insVUE = new InscritVue();
        //insVUE.setVisible(true);
        InscritController  controlInscrit =  new InscritController();
        ExemplaireController controlExemp =  new ExemplaireController();
        ExemplaireVue exempVUE =  new ExemplaireVue();
        exempVUE.setVisible(true);
        }
        
        
    }

