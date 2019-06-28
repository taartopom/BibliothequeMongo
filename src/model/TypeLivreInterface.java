package model;

import java.util.List;

public interface TypeLivreInterface {
	public void addTypeLivre (TypeLivre typeLivre);
	public void deleteTypeLivre (TypeLivre typeLivre);
	public void updateTypeLivre (TypeLivre typeLivre);
	public List<TypeLivre> getAllTypeLivre();
	public TypeLivre getOneTypeLivre(int idTypeLivre);
	
}
