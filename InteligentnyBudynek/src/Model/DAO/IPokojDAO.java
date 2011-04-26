package Model.DAO;

import Controller.ElementyBudynku.Urzadzenie;
import java.util.List;

public interface IPokojDAO {

    int dodaj(String nazwa);

    boolean usun(int idPokoju);

    boolean ustawNazwe(int idPokoju, String nazwa) ;

    String pobierzNazwa(int idPokoju);
    
    int pobierzIdPietra(int idPokoju);
    
    void ustawIdPietra (int idPokoju, int idPietra);

    List<Urzadzenie> wylistujUrzadzenia(int idPokoju);
}
