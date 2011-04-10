package Model.DAO;

import Controller.ElementyBudynku.Urzadzenie;
import Model.Utils.DatabaseUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MsPokojDAO implements IPokojDAO {

    /*
     * Zwracane idPokoju z bazy
     */
    public int dodaj(String nazwa) {
        List<String> columnNames = new ArrayList<String>();
        columnNames.add("nazwa");

        List<String> columnTypes = new ArrayList<String>();
        columnTypes.add("Varchar(40)");

        List<String> values = new ArrayList<String>();
        values.add(nazwa);

        ResultSet rs = DatabaseUtils.insertCommandWithKeyResult("Pokoj", columnNames, values);

        if (rs == null) {
            return -2;
        }
        int id = -1;
        try {
            while (rs.next()) {
                id = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.err.println("Nie udało uzyskać się id dodanego pokoju!");
            id = -1;
        }
        return id;
    }

    public boolean usun(int idPokoju) {
        if (DatabaseUtils.deleteCommand("Pokoj", "idPokoju='" + idPokoju + "'") == false) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Zwracana jest nowa nazwa pokoju
     */
    public boolean ustawNazwe(int idPokoju, String nazwa) {
        int result = DatabaseUtils.updateCommand("Pokoj", "nazwa", "'" + nazwa + "'", "idPokoju = '" + idPokoju + "'");
        if (result != 1) {
            System.err.println("Nie dokonano zmiany nazwy pokoju!");
            return false;
        }
        return true;
    }

    public String pobierzNazwa(int idPokoju) {
        String nazwa = "";
        ResultSet rs = DatabaseUtils.queryCommand("nazwa", "Pokoj", "idPokoju='" + idPokoju + "'");

        if (rs == null) {
            return null;
        }
        try {
            while (rs.next()) {
                nazwa = rs.getString("nazwa");
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy próbie pobrania nazwy!");
            nazwa = null;
        }
        return nazwa;
    }

    /*
     * Zwracana jest lista urządzeń z pokoju
     */
    public List wylistujUrzadzenia(int idPokoju) {
        List<Integer> idUrzadzen = new ArrayList<Integer>();

        ResultSet rs = DatabaseUtils.queryCommand("idUrzadzenia", "InteligentnyBudynek.dbo.Urzadzenia", "idPokoju='" + idPokoju + "'");

        if (rs == null) {
            return null;
        }
        try {
            while (rs.next()) {
                int idUrzadzenia = Integer.parseInt(rs.getString("idUrzadzenia"));
                System.out.println(idUrzadzenia);
                idUrzadzen.add(idUrzadzenia);
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy próbie pobrania poboru pracy urzadzenia!");
        }
        return idUrzadzen;
    }

}
