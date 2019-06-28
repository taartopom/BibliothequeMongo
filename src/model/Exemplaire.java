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
    private Edition idEdition;
    private Livre idLivre;
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Exemplaire(String refExemplaire, Edition idEdition, Livre idLivre) {
        this.refExemplaire = refExemplaire;
        this.idEdition = idEdition;
        this.idLivre = idLivre;
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

    public Edition getIdEdition() {
        return idEdition;
    }

    public Livre getIdLivre() {
        return idLivre;
    }
    
/*-----------------------------------------------------------------------------*/ 
    //Setter
/*-----------------------------------------------------------------------------*/ 

    public void setRefExemplaire(String refExemplaire) {
        this.refExemplaire = refExemplaire;
    }

    public void setIdEdition(Edition idEdition) {
        this.idEdition = idEdition;
    }

    public void setIdLivre(Livre idLivre) {
        this.idLivre = idLivre;
    }
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Exemplaire{" + "refExemplaire=" + refExemplaire + ", idEdition=" + idEdition + ", idLivre=" + idLivre + '}';
    }

}
