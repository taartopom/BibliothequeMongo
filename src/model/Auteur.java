/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mongodb.BasicDBObject;
import java.util.List;

/**
 * Cette class permet de creer des objets de type Auteur
 * @author sandra
 * @version 1.0
 */
public class Auteur {
/*-----------------------------------------------------------------------------*/ 
    //les attributs
/*-----------------------------------------------------------------------------*/
    private int idAuteur;
    private String nomAuteur;
    private String prenomAuteur;
    private String dateNaissanceAuteur;
    private Pays paysAuteur;
    private List<BasicDBObject> listLivre;
    
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/
    
    public Auteur(int idAuteur, String nomAuteur, String prenomAuteur, String dateNaissanceAuteur) {
        this.idAuteur = idAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.dateNaissanceAuteur = dateNaissanceAuteur;
    }

    public Auteur(int idAuteur, String nomAuteur, String prenomAuteur, String dateNaissanceAuteur,Pays paysAuteur) {
        this.idAuteur = idAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.dateNaissanceAuteur = dateNaissanceAuteur;
        this.paysAuteur = paysAuteur;
    }

    public Auteur(int idAuteur, String nomAuteur, String prenomAuteur) {
        this.idAuteur = idAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
    }

    public Auteur(List<BasicDBObject> listLivre) {
        this.listLivre = listLivre;
    }
    
    public Auteur() {
	paysAuteur = new Pays();
    }

/*-----------------------------------------------------------------------------*/ 
    //Getter
/*-----------------------------------------------------------------------------*/

    public int getIdAuteur() {
        return idAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    public String getDateNaissanceAuteur() {
        return dateNaissanceAuteur;
    }

    public Pays getPaysAuteur() {
        return paysAuteur;
    }

    public List<BasicDBObject> getListLivre() {
        return listLivre;
    }
    
/*-----------------------------------------------------------------------------*/ 
    //Setter
/*-----------------------------------------------------------------------------*/

    public void setIdAuteur(int idAuteur) {
        this.idAuteur = idAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    public void setDateNaissanceAuteur(String dateNaissanceAuteur) {
        this.dateNaissanceAuteur = dateNaissanceAuteur;
    }

    public void setPaysAuteur(Pays paysAuteur) {
        this.paysAuteur = paysAuteur;
    }

    public void setListLivre(List<BasicDBObject> listLivre) {
        this.listLivre = listLivre;
    }
    
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Auteur{" + "idAuteur=" + idAuteur + ", nomAuteur=" + nomAuteur + ", prenomAuteur=" + prenomAuteur + ", dateNaissanceAuteur=" + dateNaissanceAuteur + ", paysAuteur=" + paysAuteur + ", listLivre=" + listLivre + '}';
    }




    
}
