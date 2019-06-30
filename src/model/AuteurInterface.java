package model;

import java.util.List;



public interface AuteurInterface {

    public void addAuteur(Auteur auteur);
    public void deleteAuteur(Auteur auteur);
    public void updateAuteur(Auteur auteur);
    
    public List<Auteur> getAllAuteur();
    public Auteur getOneAuteur(int idAuteur);   
}
