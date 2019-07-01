package model;

import java.util.List;

interface EmpruntInterface {
	
	//interface pour l'emprunt lui meme
	public void addEmprunt(Emprunt emprunt);
	public void deleteEmprunt (Emprunt emprunt);
	public List<Emprunt> getAllEmprunt();	
	public Emprunt getOneEmprunt(int idEmprunt);
	
	// interface pour le livre concerne par l'emprunt
	public void addLivreEmprunt ( Emprunt emprunt, Livre livre);
	public void deleteLivreEmprunt (Emprunt emprunt , Livre livre);
	public void modifierLivreEmprunt ( Emprunt emprunt, Livre livre);

	
}
