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
public interface PaysInterface {
	public void addPays(Pays pays); 
	public void deletePays(Pays pays);
	public void updatePays(Pays pays); 
	public Pays getOnePays(int idPays);
	public List<Pays> getAllPays();
}
