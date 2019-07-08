/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mongodb.BasicDBObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Cette class permet de creer des objets de type Emprunt
 * @author sandra
 * @version 1.0
 */
public class Emprunt {
/*-----------------------------------------------------------------------------*/ 
    //les attributs
/*-----------------------------------------------------------------------------*/
    private int idEmprunt;
    private String dateEmprunt;
    private int delaisEmprunt;
    private Inscrit idInscritEmprunt;
    private List<BasicDBObject> listeRefExemplaireEmprunt;
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Emprunt(int idEmprunt, String dateEmprunt, int delaisEmprunt, Inscrit idInscritEmprunt, List<BasicDBObject> refExemplaireEmprunt) {
        this.idEmprunt = idEmprunt;
        this.dateEmprunt = dateEmprunt;
        this.delaisEmprunt = delaisEmprunt;
        this.idInscritEmprunt = idInscritEmprunt;
        listeRefExemplaireEmprunt = new ArrayList<>();
    }



    public Emprunt() {
        listeRefExemplaireEmprunt = new ArrayList<>();
        
    }

    public Emprunt(int idEmprunt, String dateEmprunt, int delaisEmprunt) {
        this.idEmprunt = idEmprunt;
        this.dateEmprunt = dateEmprunt;
        this.delaisEmprunt = delaisEmprunt;
        listeRefExemplaireEmprunt = new ArrayList<>();
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

    public List<BasicDBObject> getListeRefExemplaireEmprunt() {
        return listeRefExemplaireEmprunt;
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

    public void setListeRefExemplaireEmprunt(List<BasicDBObject> listeRefExemplaireEmprunt) {
        this.listeRefExemplaireEmprunt = listeRefExemplaireEmprunt;
    }

 
    
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Emprunt{" + "idEmprunt=" + idEmprunt + ", dateEmprunt=" + dateEmprunt + ", delaisEmprunt=" + delaisEmprunt + ", idInscritEmprunt=" + idInscritEmprunt + ", listeRefExemplaireEmprunt=" + listeRefExemplaireEmprunt + '}';
    }



}
