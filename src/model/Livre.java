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
public class Livre {
    private int idLivre;
    private String titreLivre;
    private String anneeLivre;
    private String resumeLivre;
    private TypeLivre typelivre;
    private Auteur auteurLivre; 
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Livre(int idLivre, String titreLivre, String anneeLivre, String resumeLivre, TypeLivre typelivre) {
        this.idLivre = idLivre;
        this.titreLivre = titreLivre;
        this.anneeLivre = anneeLivre;
        this.resumeLivre = resumeLivre;
        this.typelivre = typelivre;
    }

    public Livre(int idLivre, String titreLivre, String resumeLivre, TypeLivre typelivre, Auteur auteurLivre) {
        this.idLivre = idLivre;
        this.titreLivre = titreLivre;
        this.resumeLivre = resumeLivre;
        this.typelivre = typelivre;
        this.auteurLivre = auteurLivre;
    }

    public Livre(int idLivre, String titreLivre, Auteur auteurLivre) {
        this.idLivre = idLivre;
        this.titreLivre = titreLivre;
        this.auteurLivre = auteurLivre;
    }

    public Livre(int idLivre, String titreLivre) {
        this.idLivre = idLivre;
        this.titreLivre = titreLivre;
    }
    
    public Livre() {
    }
    
/*-----------------------------------------------------------------------------*/ 
    //Getter
/*-----------------------------------------------------------------------------*/

    public int getIdLivre() {
        return idLivre;
    }

    public String getTitreLivre() {
        return titreLivre;
    }

    public String getAnneeLivre() {
        return anneeLivre;
    }

    public String getResumeLivre() {
        return resumeLivre;
    }

    public TypeLivre getTypelivre() {
        return typelivre;
    }

    public Auteur getAuteurLivre() {
        return auteurLivre;
    }
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public void setIdLivre(int idLivre) {
        this.idLivre = idLivre;
    }

    public void setTitreLivre(String titreLivre) {
        this.titreLivre = titreLivre;
    }

    public void setAnneeLivre(String anneeLivre) {
        this.anneeLivre = anneeLivre;
    }

    public void setResumeLivre(String resumeLivre) {
        this.resumeLivre = resumeLivre;
    }

    public void setTypelivre(TypeLivre typelivre) {
        this.typelivre = typelivre;
    }

    public void setAuteurLivre(Auteur auteurLivre) {
        this.auteurLivre = auteurLivre;
    }
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Livre{" + "idLivre=" + idLivre + ", titreLivre=" + titreLivre + ", anneeLivre=" + anneeLivre + ", resumeLivre=" + resumeLivre + ", typelivre=" + typelivre + ", auteurLivre=" + auteurLivre + '}';
    }


    
}
