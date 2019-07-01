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
public class Exemplaire {
    private String refExemplaire;
    private Edition idEditionExemplaire;
    private Livre idLivreExemplaire;
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Exemplaire(String refExemplaire, Edition idEdition, Livre idLivre) {
        this.refExemplaire = refExemplaire;
        this.idEditionExemplaire = idEditionExemplaire;
        this.idLivreExemplaire = idLivreExemplaire;
    }

    public Exemplaire(String refExemplaire) {
        this.refExemplaire = refExemplaire;
    }

    public Exemplaire() {
    }
    
/*-----------------------------------------------------------------------------*/ 
    //Getter
/*-----------------------------------------------------------------------------*/

    public String getRefExemplaire() {
        return refExemplaire;
    }

    public Edition getIdEditionExemplaire() {
        return idEditionExemplaire;
    }

    public Livre getIdLivreExemplaire() {
        return idLivreExemplaire;
    }
    
/*-----------------------------------------------------------------------------*/ 
    //Setter
/*-----------------------------------------------------------------------------*/ 

    public void setRefExemplaire(String refExemplaire) {
        this.refExemplaire = refExemplaire;
    }

    public void setIdEditionExemplaire(Edition idEditionExemplaire) {
        this.idEditionExemplaire = idEditionExemplaire;
    }

    public void setIdLivreExemplaire(Livre idLivreExemplaire) {
        this.idLivreExemplaire = idLivreExemplaire;
    }
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Exemplaire{" + "refExemplaire=" + refExemplaire + ", idEdition=" + idEditionExemplaire + ", idLivre=" + idLivreExemplaire + '}';
    }

}
