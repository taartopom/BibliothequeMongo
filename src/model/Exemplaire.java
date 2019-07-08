/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Cette class permet de creer des objets de type Exemplaire
 * @author sandra
 * @version 1.0
 */
public class Exemplaire {
/*-----------------------------------------------------------------------------*/ 
    //les attributs
/*-----------------------------------------------------------------------------*/
    private int refExemplaire;
    private Edition idEditionExemplaire;
    private Livre idLivreExemplaire;
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Exemplaire(int refExemplaire, Edition idEditionExemplaire, Livre idLivreExemplaire) {
        this.refExemplaire = refExemplaire;
        this.idEditionExemplaire = idEditionExemplaire;
        this.idLivreExemplaire = idLivreExemplaire;
    }

    public Exemplaire(int refExemplaire) {
        this.refExemplaire = refExemplaire;
    }

    public Exemplaire() {
    }



/*-----------------------------------------------------------------------------*/ 
    //Getter
/*-----------------------------------------------------------------------------*/

    public int getRefExemplaire() {
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

    public void setRefExemplaire(int refExemplaire) {
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
        return "Exemplaire{" + "refExemplaire=" + refExemplaire + ", idEditionExemplaire=" + idEditionExemplaire + ", idLivreExemplaire=" + idLivreExemplaire + '}';
    }

   

}
