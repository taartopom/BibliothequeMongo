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
public interface ExemplaireInterface {
    public void addExemplaire ( Exemplaire exemplaire);
    public void deleteExemplaire ( Exemplaire exemplaire);
    public void updateExemplaire ( Exemplaire exemplaire);
    public Exemplaire getOneExemplaire ( int idExemplaire);
    public List<Exemplaire> getAllExemplaire ();
}
