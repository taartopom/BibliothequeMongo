/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Cette class permet de creer des objets de type Pays
 * @author sandra
 * @version 1.0
 */
public class Pays {
/*-----------------------------------------------------------------------------*/ 
    //les attributs
/*-----------------------------------------------------------------------------*/
    private int idPays;
    private String nomPays;
  
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Pays(int idPays, String nomPays) {
        this.idPays = idPays;
        this.nomPays = nomPays;
    }

    public Pays(int idPays) {
        this.idPays = idPays;
    }

    public Pays(String nomPays) {
        this.nomPays = nomPays;
    }

    public Pays() {
    }
/*-----------------------------------------------------------------------------*/ 
    //Getter
/*-----------------------------------------------------------------------------*/

    public int getIdPays() {
        return idPays;
    }

    public String getNomPays() {
        return nomPays;
    }
/*-----------------------------------------------------------------------------*/ 
    //Setter
/*-----------------------------------------------------------------------------*/

    public void setIdPays(int idPays) {
        this.idPays = idPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Pays{" + "idPays=" + idPays + ", nomPays=" + nomPays + '}';
    }


}
