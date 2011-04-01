package Model.DAO;

import Controller.ElementyBudynku.Urzadzenie;
import java.util.List;

public class MsPokojDAO implements IPokojDAO{

    /*
     * Zwracane idPokoju z bazy
     */
    public int dodaj(String nazwa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean usun(int idPokoju) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Zwracana jest nowa nazwa pokoju
     */
    public String ustawNazwe(int idPokoju, String nazwa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String pobierzNazwa(int idPokoju) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Zwracana jest lista urządzeń z pokoju
     */
    public List<Urzadzenie> wylistujUrzadzenia(int idPokoju) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
