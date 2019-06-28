/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrateur
 */
public class Rediger {
    private Auteur idAuteur;
    private Livre idLivre;
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Rediger(Auteur idAuteur, Livre idLivre) {
        this.idAuteur = idAuteur;
        this.idLivre = idLivre;
    }

    public Rediger(Auteur idAuteur) {
        this.idAuteur = idAuteur;
    }

    public Rediger(Livre idLivre) {
        this.idLivre = idLivre;
    }

    public Rediger() {
    }
/*-----------------------------------------------------------------------------*/ 
    //Getter
/*-----------------------------------------------------------------------------*/

    public Auteur getIdAuteur() {
        return idAuteur;
    }

    public Livre getIdLivre() {
        return idLivre;
    }
/*-----------------------------------------------------------------------------*/ 
    //Setter
/*-----------------------------------------------------------------------------*/

    public void setIdAuteur(Auteur idAuteur) {
        this.idAuteur = idAuteur;
    }

    public void setIdLivre(Livre idLivre) {
        this.idLivre = idLivre;
    }
    
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Rediger{" + "idAuteur=" + idAuteur + ", idLivre=" + idLivre + '}';
    }
    
}
