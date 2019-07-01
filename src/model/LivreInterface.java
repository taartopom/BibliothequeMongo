/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Administrateur
 */
public interface LivreInterface {
    public void addLivre ( Livre livre);
    public void deleteLivre( Livre livre);
    public void updateLivre ( Livre livre);
    public Livre getOnelivre ( int idLivre);
    public List<Livre> getAllLivre();
}
