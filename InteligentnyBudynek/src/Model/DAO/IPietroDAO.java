package Model.DAO;

import Controller.ElementyBudynku.Pokoj;
import java.util.List;


public interface IPietroDAO {

    List<Integer> wylistujPokoje(int idPietra);
    
    void ustawNazwe(int idPietra, String nazwa);
    
    String pobierzNazwe(int idPietra);
    
    int pobierzIdBudynku(int idPietra);
    
    void ustawIdBudynku(int idPietra, int idBudynku);
}
