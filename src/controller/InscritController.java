/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Inscrit;
import model.InscritDAO;
import view.InscritVue;

/**
 *
 * @author Administrateur
 */
public class InscritController implements ActionListener, MouseListener{
    private final InscritDAO  inscritDAO;
    private final InscritVue inscritVUE;
    private DefaultTableModel modelInscrit;
    
        
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/

    public InscritController() {
        inscritDAO = new InscritDAO();
        inscritVUE = new InscritVue();
        
        initModelInscrit();
        addListener();
        nextId();
        inscritVUE.setVisible(true);


    }

/*-----------------------------------------------------------------------------------*/
    // methode 
/*-----------------------------------------------------------------------------------*/ 
    // ajout des ecouteus sur les boutons de la vue
    public void addListener(){
        this.inscritVUE.getBtnAddInscrit().addActionListener(this);
        this.inscritVUE.getBtnDeleteInscrit().addActionListener(this);
        this.inscritVUE.getBtnUpdateInscrit().addActionListener(this);
        this.inscritVUE.getBtnRechInscrit().addActionListener(this);
        this.inscritVUE.getTableauInscrits().addMouseListener(this);
    }
/*-----------------------------------------------------------------------------------*/
    // cette methode crer le model d'un inscrit
    public void initModelInscrit(){
        // creation du model inscrit
        modelInscrit = new DefaultTableModel();

        //ajout des colonnes dans le model inscrit
        modelInscrit.addColumn("ID inscrit");
        modelInscrit.addColumn("Nom");
        modelInscrit.addColumn("Prenom");
        modelInscrit.addColumn("Date de naissance");
        modelInscrit.addColumn("rue");
        modelInscrit.addColumn("Ville");
        modelInscrit.addColumn("Code postal");
        modelInscrit.addColumn("Email");
        modelInscrit.addColumn("n° tel");
        modelInscrit.addColumn("n° GSM");

        //inserer les lignes dans le model inscrit
        List<Inscrit> allInscrit =  new ArrayList<>();
        allInscrit =  this.inscritDAO.getAllInscrit();

        for (Inscrit inscrit : allInscrit){
            modelInscrit.addRow(new Object[]{
                inscrit.getIdInscrit(),
                inscrit.getNomInscrit(),
                inscrit.getPrenomInscrit(),
                inscrit.getDateNaissanceInscrit(),
                inscrit.getRueInscrit(),
                inscrit.getVilleInscrit(),
                inscrit.getCpInscrit(),
                inscrit.getEmailInscrit(),
                inscrit.getNumTelInscrit(),
                inscrit.getNumGSMIscrit()});
        }
        this.inscritVUE.getTableauInscrits().setModel(modelInscrit);
    }
/*-----------------------------------------------------------------------------------*/
    //cette methode retourne l'id max de la collection Inscrit
    public int maxId(){
        List<Inscrit> listeInscrit = this.inscritDAO.getAllInscrit();
        List<Integer> listeIdInscrit = new ArrayList<>();
        
        for(Inscrit inscrits : listeInscrit){
            listeIdInscrit.add(inscrits.getIdInscrit());
        }
        if(listeIdInscrit.isEmpty()){
            listeIdInscrit.add(0);
        }
        return Collections.max(listeIdInscrit);
    }
    
 /*-----------------------------------------------------------------------------------*/
    // cette méthodes met a jour l'idInscrit avec l'id max + 1 de la base
    public void nextId(){
        this.inscritVUE.getTxtIdInscrit().setText(Integer.toString(maxId() + 1));
    }
/*-----------------------------------------------------------------------------------*/
    // Evenement
/*-----------------------------------------------------------------------------------*/ 
    /*private int idInscrit;
    private String nomInscrit;
    private String prenomInscrit;
    private String dateNaissanceInscrit;
    private String rueInscrit;
    private String villeInscrit;
    private int cpInscrit;
    private String emailInscrit;
    private String numTelInscrit;
    private String numGSMIscrit;*/
/*-----------------------------------------------------------------------------------*/
    // ajout des actions sur les boutons de la vue
    @Override
    public void actionPerformed(ActionEvent ae) {
        // pour le bouton ajouter un inscrit
        if (ae.getSource().equals(this.inscritVUE.getBtnAddInscrit())) {
            Inscrit inscrit =  new Inscrit();
            inscrit.setIdInscrit(Integer.parseInt(this.inscritVUE.getTxtIdInscrit().getText()));
            inscrit.setNomInscrit(this.inscritVUE.getTxtNomInscrit().getText());
            inscrit.setPrenomInscrit(this.inscritVUE.getTxtPrenomInscrit().getText());
            inscrit.setDateNaissanceInscrit(this.inscritVUE.getTxtDateNaissanceInscrit().getText());
            inscrit.setRueInscrit(this.inscritVUE.getTxtRueInscrit().getText());
            inscrit.setVilleInscrit(this.inscritVUE.getTxtVilleInscrit().getText());
            inscrit.setCpInscrit(Integer.parseInt(this.inscritVUE.getTxtCPInscrit().getText()));
            inscrit.setEmailInscrit(this.inscritVUE.getTxtEmailInscrit().getText());
            inscrit.setNumTelInscrit(this.inscritVUE.getTxtTelInscrit().getText());
            inscrit.setNumGSMIscrit(this.inscritVUE.getTxtGSMIscrit().getText());
            
            this.inscritDAO.addInscrit(inscrit);
            initModelInscrit();
            
        }
        
        //pour le bouton suprimer un inscrit
        if(ae.getSource().equals(this.inscritVUE.getBtnDeleteInscrit())){
           Inscrit inscrit =  new Inscrit();
           inscrit.setIdInscrit(Integer.parseInt(this.inscritVUE.getTxtIdInscrit().getText()));
           
           this.inscritDAO.deleteInscrit(inscrit);
           initModelInscrit();
        }
        
        //pour le bouton modifier un inscrit
        if(ae.getSource().equals(this.inscritVUE.getBtnUpdateInscrit())){
            Inscrit inscrit =  new Inscrit();
            inscrit.setIdInscrit(Integer.parseInt(this.inscritVUE.getTxtIdInscrit().getText()));
            inscrit.setNomInscrit(this.inscritVUE.getTxtNomInscrit().getText());
            inscrit.setPrenomInscrit(this.inscritVUE.getTxtPrenomInscrit().getText());
            inscrit.setDateNaissanceInscrit(this.inscritVUE.getTxtDateNaissanceInscrit().getText());
            inscrit.setRueInscrit(this.inscritVUE.getTxtRueInscrit().getText());
            inscrit.setVilleInscrit(this.inscritVUE.getTxtVilleInscrit().getText());
            inscrit.setCpInscrit(Integer.parseInt(this.inscritVUE.getTxtCPInscrit().getText()));
            inscrit.setEmailInscrit(this.inscritVUE.getTxtEmailInscrit().getText());
            inscrit.setNumTelInscrit(this.inscritVUE.getTxtTelInscrit().getText());
            inscrit.setNumGSMIscrit(this.inscritVUE.getTxtGSMIscrit().getText());
            
            this.inscritDAO.updateInscrit(inscrit);
            initModelInscrit();
        }
    }

/*-----------------------------------------------------------------------------------*/
    // pour ajouter un evenement au click de la sourie sur une ligne de la vue
    @Override
    public void mouseClicked(MouseEvent me) {
        
        int ligne = this.inscritVUE.getTableauInscrits().getSelectedRow();
        this.inscritVUE.getTxtIdInscrit().setText(modelInscrit.getValueAt(ligne, 0).toString());
        this.inscritVUE.getTxtNomInscrit().setText(modelInscrit.getValueAt(ligne, 1).toString());
        this.inscritVUE.getTxtPrenomInscrit().setText(modelInscrit.getValueAt(ligne, 2).toString());
        this.inscritVUE.getTxtDateNaissanceInscrit().setText(modelInscrit.getValueAt(ligne, 3).toString());
        this.inscritVUE.getTxtRueInscrit().setText(modelInscrit.getValueAt(ligne, 4).toString());
        this.inscritVUE.getTxtVilleInscrit().setText(modelInscrit.getValueAt(ligne, 5).toString());
        this.inscritVUE.getTxtCPInscrit().setText(modelInscrit.getValueAt(ligne, 6).toString());
        this.inscritVUE.getTxtEmailInscrit().setText(modelInscrit.getValueAt(ligne, 7).toString());
        this.inscritVUE.getTxtTelInscrit().setText(modelInscrit.getValueAt(ligne, 8).toString());
        this.inscritVUE.getTxtGSMIscrit().setText(modelInscrit.getValueAt(ligne, 9).toString());

    }

    @Override
    public void mousePressed(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
