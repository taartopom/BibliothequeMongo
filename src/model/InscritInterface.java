package model;

import java.util.List;

public interface InscritInterface {
	public void addInscrit (Inscrit inscrit);
	public void deleteInscrit (Inscrit inscrit);
	public void updateInscrit ( Inscrit inscrit);
	public List<Inscrit> getAllInscrit();
	public Inscrit getOneInscrit(int idInscrit);
}
