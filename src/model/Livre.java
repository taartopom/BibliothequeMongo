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
    private TypeLivre typeLivre;
    private Auteur auteurLivre; 
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Livre(int idLivre, String titreLivre, String anneeLivre, String resumeLivre, TypeLivre typeLivre, Auteur auteurLivre) {
        this.idLivre = idLivre;
        this.titreLivre = titreLivre;
        this.anneeLivre = anneeLivre;
        this.resumeLivre = resumeLivre;
        this.typeLivre = typeLivre;
        this.auteurLivre = auteurLivre;
    }

    public Livre(TypeLivre typeLivre) {
        this.typeLivre = typeLivre;
    }

    public Livre(Auteur auteurLivre) {
        this.auteurLivre = auteurLivre;
    }

    public Livre(int idLivre, String titreLivre, String anneeLivre, String resumeLivre) {
        this.idLivre = idLivre;
        this.titreLivre = titreLivre;
        this.anneeLivre = anneeLivre;
        this.resumeLivre = resumeLivre;
    }

    public Livre() {
        typeLivre = new TypeLivre();
        auteurLivre = new Auteur();
    }

    public Livre(int idLivre, String titreLivre) {
        this.idLivre = idLivre;
        this.titreLivre = titreLivre;
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
    

    public Auteur getAuteurLivre() {
        return auteurLivre;
    }

    public TypeLivre getTypeLivre() {
        return typeLivre;
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


    public void setTypeLivre(TypeLivre typeLivre) {
        this.typeLivre = typeLivre;
    }

    public void setAuteurLivre(Auteur auteurLivre) {
        this.auteurLivre = auteurLivre;
    }
    
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Livre{" + "idLivre=" + idLivre + ", titreLivre=" + titreLivre + ", anneeLivre=" + anneeLivre + ", resumeLivre=" + resumeLivre + ", typeLivre=" + typeLivre + ", auteurLivre=" + auteurLivre + '}';
    }




    
}
