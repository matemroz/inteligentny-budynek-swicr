package Model.DAO;

import Controller.ElementyBudynku.Urzadzenie;
import java.util.List;

public interface IPokojDAO {

    int dodaj(String nazwa);

    boolean usun(int idPokoju);

    boolean ustawNazwe(int idPokoju, String nazwa) ;

    String pobierzNazwa(int idPokoju);

    List<Urzadzenie> wylistujUrzadzenia(int idPokoju);
}
