/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Cette class permet de creer des objets de type TypeLivre
 * @author sandra
 * @version 1.0
 */
public class TypeLivre {
/*-----------------------------------------------------------------------------*/ 
    //les attributs
/*-----------------------------------------------------------------------------*/
    private int idTypeLivre;
    private String libelle;
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/ 

    public TypeLivre(int idTypeLivre, String libelle) {
        this.idTypeLivre = idTypeLivre;
        this.libelle = libelle;
    }

    public TypeLivre(int idTypeLivre) {
        this.idTypeLivre = idTypeLivre;
    }

    public TypeLivre(String libelle) {
        this.libelle = libelle;
    }

    public TypeLivre() {
    }
/*-----------------------------------------------------------------------------*/ 
    //getter
/*-----------------------------------------------------------------------------*/

    public int getIdTypeLivre() {
        return idTypeLivre;
    }

    public String getLibelle() {
        return libelle;
    }
/*-----------------------------------------------------------------------------*/ 
    //Setter
/*-----------------------------------------------------------------------------*/

    public void setIdTypeLivre(int idTypeLivre) {
        this.idTypeLivre = idTypeLivre;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/ 

    @Override
    public String toString() {
        return "TypeLivre{" + "idTypeLivre=" + idTypeLivre + ", libelle=" + libelle + '}';
    }
    
   
}
