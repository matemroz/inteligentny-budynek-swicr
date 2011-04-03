package Model.DAO;
import Model.Utils.*;

public class MsUrzadzenieDAO implements IUrzadzenieDAO {

    public MsUrzadzenieDAO() {
    }

    public int znajdzUrzadzenie(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int dodaj(int idPokoju) {
        DatabaseUtils.executeCommand(null, null, null, null);
        return 0;
    }

    public int przenies(int idUrzadzenia, int idPokoju) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean usun(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean czyPracuje(int idUrzadzenia){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String pobierzNazwa(int idUrzadzenia){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean ustawNazwa(int idUrzadzenia, String nazwa){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double pobierzMoc(int idUrzadzenia) {
        return 4.0;
    }

    public boolean ustawMoc(int idUrzadzenia, double moc){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double pobierzPoborGazu(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean ustawPoborGazu(int idUrzadzenia, double poborGazu) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean rejestrujWlaczenie(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean rejestrujWylaczenie(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int pobierzCzasPracy(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
