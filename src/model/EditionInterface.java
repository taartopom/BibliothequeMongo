package model;

import java.util.List;


public interface EditionInterface {
    public List<Edition> getAllEditeur();
    public  Edition getOneEditeur(int idEdition);
    public void addEdition(Edition edition);
    public void deleteEdition(Edition edition);
    public void updateEdition(Edition edition);
}
