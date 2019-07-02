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
public class Emprunt {
    private int idEmprunt;
    private String dateEmprunt;
    private int delaisEmprunt;
    private Inscrit idInscritEmprunt;
    private Exemplaire refExemplaireEmprunt;
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Emprunt(int idEmprunt, String dateEmprunt, int delaisEmprunt, Inscrit idInscritEmprunt, Exemplaire refExemplaireEmprunt) {
        this.idEmprunt = idEmprunt;
        this.dateEmprunt = dateEmprunt;
        this.delaisEmprunt = delaisEmprunt;
        this.idInscritEmprunt = idInscritEmprunt;
        this.refExemplaireEmprunt = refExemplaireEmprunt;
    }

    public Emprunt() {
    }

    public Emprunt(int idEmprunt, String dateEmprunt, int delaisEmprunt) {
        this.idEmprunt = idEmprunt;
        this.dateEmprunt = dateEmprunt;
        this.delaisEmprunt = delaisEmprunt;
    }
    
    
/*-----------------------------------------------------------------------------*/ 
    //Getter
/*-----------------------------------------------------------------------------*/

    public int getIdEmprunt() {
        return idEmprunt;
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public int getDelaisEmprunt() {
        return delaisEmprunt;
    }

    public Inscrit getIdInscritEmprunt() {
        return idInscritEmprunt;
    }

    public Exemplaire getRefExemplaireEmprunt() {
        return refExemplaireEmprunt;
    }
/*-----------------------------------------------------------------------------*/ 
    //Setter
/*-----------------------------------------------------------------------------*/
    public void setIdEmprunt(int idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public void setDelaisEmprunt(int delaisEmprunt) {
        this.delaisEmprunt = delaisEmprunt;
    }

    public void setIdInscritEmprunt(Inscrit idInscritEmprunt) {
        this.idInscritEmprunt = idInscritEmprunt;
    }

    public void setRefExemplaireEmprunt(Exemplaire refExemplaireEmprunt) {
        this.refExemplaireEmprunt = refExemplaireEmprunt;
    }
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Emprunt{" + "idEmprunt=" + idEmprunt + ", dateEmprunt=" + dateEmprunt + ", delaisEmprunt=" + delaisEmprunt + ", idInscritEmprunt=" + idInscritEmprunt + ", refExemplaireEmprunt=" + refExemplaireEmprunt + '}';
    }

}
