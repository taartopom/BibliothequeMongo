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
public class Edition {
    private int idEdition;
    private String nomLibelle;
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Edition(int idEdition, String nomLibelle) {
        this.idEdition = idEdition;
        this.nomLibelle = nomLibelle;
    }

    public Edition(int idEdition) {
        this.idEdition = idEdition;
    }

    public Edition(String nomLibelle) {
        this.nomLibelle = nomLibelle;
    }

    public Edition() {
    }
/*-----------------------------------------------------------------------------*/ 
    //Getter
/*-----------------------------------------------------------------------------*/

    public int getIdEdition() {
        return idEdition;
    }

    public String getNomLibelle() {
        return nomLibelle;
    }
/*-----------------------------------------------------------------------------*/ 
    //Setter
/*-----------------------------------------------------------------------------*/

    public void setIdEdition(int idEdition) {
        this.idEdition = idEdition;
    }

    public void setNomLibelle(String nomLibelle) {
        this.nomLibelle = nomLibelle;
    }

/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Edition{" + "idEdition=" + idEdition + ", nomLibelle=" + nomLibelle + '}';
    }

}
