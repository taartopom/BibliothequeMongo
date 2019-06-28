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
public class Inscrit {
    private int idInscrit;
    private String nomInscrit;
    private String prenomInscrit;
    private String dateNaissanceInscrit;
    private String rueInscrit;
    private String villeInscrit;
    private int cpInscrit;
    private String emailInscrit;
    private int numTelInscrit;
    private int numGSMIscrit;
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public Inscrit(int idInscrit, String nomInscrit, String prenomInscrit, String dateNaissanceInscrit, String rueInscrit, String villeInscrit, int cpInscrit, String emailInscrit, int numTelInscrit, int numGSMIscrit) {
        this.idInscrit = idInscrit;
        this.nomInscrit = nomInscrit;
        this.prenomInscrit = prenomInscrit;
        this.dateNaissanceInscrit = dateNaissanceInscrit;
        this.rueInscrit = rueInscrit;
        this.villeInscrit = villeInscrit;
        this.cpInscrit = cpInscrit;
        this.emailInscrit = emailInscrit;
        this.numTelInscrit = numTelInscrit;
        this.numGSMIscrit = numGSMIscrit;
    }

    public Inscrit(int idInscrit, String nomInscrit, String prenomInscrit, String dateNaissanceInscrit, String emailInscrit, int numTelInscrit, int numGSMIscrit) {
        this.idInscrit = idInscrit;
        this.nomInscrit = nomInscrit;
        this.prenomInscrit = prenomInscrit;
        this.dateNaissanceInscrit = dateNaissanceInscrit;
        this.emailInscrit = emailInscrit;
        this.numTelInscrit = numTelInscrit;
        this.numGSMIscrit = numGSMIscrit;
    }

    public Inscrit(int idInscrit, String rueInscrit, String villeInscrit, int cpInscrit) {
        this.idInscrit = idInscrit;
        this.rueInscrit = rueInscrit;
        this.villeInscrit = villeInscrit;
        this.cpInscrit = cpInscrit;
    }

    public Inscrit() {
    }
/*-----------------------------------------------------------------------------*/ 
    //Getter
/*-----------------------------------------------------------------------------*/    

    public int getIdInscrit() {
        return idInscrit;
    }

    public String getNomInscrit() {
        return nomInscrit;
    }

    public String getPrenomInscrit() {
        return prenomInscrit;
    }

    public String getDateNaissanceInscrit() {
        return dateNaissanceInscrit;
    }

    public String getRueInscrit() {
        return rueInscrit;
    }

    public String getVilleInscrit() {
        return villeInscrit;
    }

    public int getCpInscrit() {
        return cpInscrit;
    }

    public String getEmailInscrit() {
        return emailInscrit;
    }

    public int getNumTelInscrit() {
        return numTelInscrit;
    }

    public int getNumGSMIscrit() {
        return numGSMIscrit;
    }
/*-----------------------------------------------------------------------------*/ 
    //Setter
/*-----------------------------------------------------------------------------*/

    public void setIdInscrit(int idInscrit) {
        this.idInscrit = idInscrit;
    }

    public void setNomInscrit(String nomInscrit) {
        this.nomInscrit = nomInscrit;
    }

    public void setPrenomInscrit(String prenomInscrit) {
        this.prenomInscrit = prenomInscrit;
    }

    public void setDateNaissanceInscrit(String dateNaissanceInscrit) {
        this.dateNaissanceInscrit = dateNaissanceInscrit;
    }

    public void setRueInscrit(String rueInscrit) {
        this.rueInscrit = rueInscrit;
    }

    public void setVilleInscrit(String villeInscrit) {
        this.villeInscrit = villeInscrit;
    }

    public void setCpInscrit(int cpInscrit) {
        this.cpInscrit = cpInscrit;
    }

    public void setEmailInscrit(String emailInscrit) {
        this.emailInscrit = emailInscrit;
    }

    public void setNumTelInscrit(int numTelInscrit) {
        this.numTelInscrit = numTelInscrit;
    }

    public void setNumGSMIscrit(int numGSMIscrit) {
        this.numGSMIscrit = numGSMIscrit;
    }
/*-----------------------------------------------------------------------------*/ 
    //toString
/*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Inscrit{" + "idInscrit=" + idInscrit + ", nomInscrit=" + nomInscrit + ", prenomInscrit=" + prenomInscrit + ", dateNaissanceInscrit=" + dateNaissanceInscrit + ", rueInscrit=" + rueInscrit + ", villeInscrit=" + villeInscrit + ", cpInscrit=" + cpInscrit + ", emailInscrit=" + emailInscrit + ", numTelInscrit=" + numTelInscrit + ", numGSMIscrit=" + numGSMIscrit + '}';
    }

}
