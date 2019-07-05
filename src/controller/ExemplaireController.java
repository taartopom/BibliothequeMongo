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
import javax.swing.table.DefaultTableModel;
import model.AuteurDAO;
import model.EditionDAO;
import model.ExemplaireDAO;
import model.LivreDAO;
import view.ExemplaireVue;

/**
 *
 * @author Administrateur
 */
public class ExemplaireController implements ActionListener, MouseListener{
    
    private LivreDAO livreDAO;
    private AuteurDAO auteurDAO;
    private ExemplaireDAO exemplaireDAO;
    private ExemplaireVue exemplaireVUE;
    private EditionDAO editionDAO;
    private DefaultTableModel modelLivre, modelAuteur;
    
/*-----------------------------------------------------------------------------*/ 
    //Constructeur
/*-----------------------------------------------------------------------------*/
    public ExemplaireController() {
        livreDAO =  new LivreDAO();
        auteurDAO = new AuteurDAO();
        editionDAO =  new EditionDAO();
        exemplaireDAO = new ExemplaireDAO();
        exemplaireVUE = new ExemplaireVue();
    }
    
    
/*-----------------------------------------------------------------------------------*/
    // methode 
/*-----------------------------------------------------------------------------------*/ 
    //ajout des ecouteur sur les boutons de la vue exemplaire
    public void addListener(){
        //pour la partie livre
        this.exemplaireVUE.getBtnAjoutLivre().addActionListener(this);
        this.exemplaireVUE.getBtnModifierLivre().addActionListener(this);
        this.exemplaireVUE.getBtnSupprimerLivre().addActionListener(this);
        this.exemplaireVUE.getTableauLivres().addMouseListener(this);
        
        //pour la partie auteur
        this.exemplaireVUE.getBtnAddAuteur().addActionListener(this);
        this.exemplaireVUE.getBtnUpdateAuteur().addActionListener(this);
        this.exemplaireVUE.getBtnDeleteAuteur().addActionListener(this);
        this.exemplaireVUE.getTableauDesAuteurs().addMouseListener(this);
    
        //pour la partie edition
        this.exemplaireVUE.getjBtnAddEdition().addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent me) {
/*-----------------------------------------------------------------------------------*/
        // pour la partie livre
        int ligneLivre = this.exemplaireVUE.getTableauLivres().getSelectedRow();
        
        //id du livre 
        int idLivre =  Integer.parseInt(modelLivre.getValueAt(ligneLivre, 0).toString());
        this.exemplaireVUE.getTxtIdLivre().setText(modelLivre.getValueAt(idLivre, 1).toString());
        this.exemplaireVUE.getTxtTitreLivre().setText(modelLivre.getValueAt(idLivre, 2).toString());
        this.exemplaireVUE.getTxtAnneeLivre().setText(modelLivre.getValueAt(idLivre, 3).toString());
/*-----------------------------------------------------------------------------------*/
        // pour la partie edition
        int ligneEdition = this.exemplaireVUE.getComboBoxEdition().getSelectedIndex();
        
        //id de l'edition
        int idEdition =  Integer.parseInt()
/*-----------------------------------------------------------------------------------*/
        // pour la partie auteur
        int ligneAuteur =  this.exemplaireVUE.getTableauDesAuteurs().getSelectedRow();
        
        //id de l'auteur
        int idAuteur =  Integer.parseInt(modelAuteur.getValueAt(ligneAuteur, 0).toString());
        this.exemplaireVUE.getTxtIdAuteur().setText(modelAuteur.getValueAt(idAuteur, 1).toString());
        this.exemplaireVUE.getTxtNomAuteur().setText(modelAuteur.getValueAt(idAuteur, 2).toString());
        this.exemplaireVUE.getTxtPrenomAuteur().setText(modelAuteur.getValueAt(idAuteur, 3).toString());
        this.exemplaireVUE.getTxtDateNaissanceAuteur().setText(modelAuteur.getValueAt(idAuteur, 4).toString());
        this.exemplaireVUE.getTxtPaysAuteur().setText(modelAuteur.getValueAt(idAuteur, 5).toString());
        
        
                }

    @Override
    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
