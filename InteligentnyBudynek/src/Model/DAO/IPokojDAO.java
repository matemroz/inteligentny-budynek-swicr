package Model.DAO;

import Controller.ElementyBudynku.Urzadzenie;
import java.util.List;

public interface IPokojDAO {

    boolean dodaj( );

    boolean dodaj(String nazwa);

    boolean usun(int idPokoju);

    void ustawNazwe(int idPokoju, String nazwa);

    String getNazwa(int idPokoju);

    //metoda zwraca liste urzadzen z danego pokoju
    public List<Urzadzenie> wylistujUrzadzenia();
}
