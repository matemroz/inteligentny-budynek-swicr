package Model.DAO;

import Model.Utils.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MsUrzadzenieDAO implements IUrzadzenieDAO {

    public MsUrzadzenieDAO() {
    }

    public int znajdzUrzadzenie(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int dodaj(int idPokoju) {
        List<String> columnNames = new ArrayList<String>();
        columnNames.add("idPokoju");
        columnNames.add("nazwa");
        columnNames.add("moc");
        columnNames.add("poborGazu");

        List<String> columnTypes = new ArrayList<String>();
        columnTypes.add("int");
        columnTypes.add("Varchar(40)");
        columnTypes.add("float");
        columnTypes.add("float");

        String idPok = Integer.toString(idPokoju);

        List<String> values = new ArrayList<String>();
        values.add(idPok);
        values.add("Urzadzenie");
        values.add("0");
        values.add("0");
        DatabaseUtils.executeCommandWithOutput("Urzadzenia", columnNames, columnTypes, values);
        return 0;
    }

    public int przenies(int idUrzadzenia, int idPokoju) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean usun(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean czyPracuje(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String pobierzNazwa(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean ustawNazwa(int idUrzadzenia, String nazwa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double pobierzMoc(int idUrzadzenia) {
        return 4.0;
    }

    public boolean ustawMoc(int idUrzadzenia, double moc) {
        DatabaseUtils.updateCommand("Urzadzenia", "moc", Double.toString(moc), "idUrzadzenia = '" + idUrzadzenia + "'");
    //TODO zwracana wartosc
        return true;
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

    public static void main(String args[]) throws SQLException {
       // (new MsUrzadzenieDAO()).dodaj(1);
       (new MsUrzadzenieDAO()).ustawMoc(1, 90);
    }
}
