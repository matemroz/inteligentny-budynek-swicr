package Model.DAO;

import Model.Utils.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MsUrzadzenieDAO implements IUrzadzenieDAO {

    public MsUrzadzenieDAO() {
    }

    public int znajdzUrzadzenie(int idUrzadzenia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return zwraca < 0 w wypadku niepowodzenia lub id dodanego urzadzenia
     */
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

        ResultSet rs = DatabaseUtils.insertCommandWithKeyResult("Urzadzenia", columnNames, values);

        if (rs == null) {
            return -2;
        }
        int id = -1;
        try {
            while (rs.next()) {
                id = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.err.println("Nie udało uzyskać się id dodanego urządzenia");
            id = -1;
        }
        return id;
    }

    /**
     * @return zwraca 0 w wypadku niepowodzenia lub liczbę zaktualizowanych wierszy
     */
    public int przenies(int idUrzadzenia, int idPokoju) {
        int result = DatabaseUtils.updateCommand("Urzadzenia", "idPokoju", Integer.toString(idPokoju), "idUrzadzenia = '" + idUrzadzenia + "'");
        if (result != 1) {
            System.err.println("Nie dokonano zmiany miejsca urządzenia!");
            return -1;
        }
        return result;
    }

    public boolean usun(int idUrzadzenia) {
        if (DatabaseUtils.deleteCommand("Urzadzenia", "idUrzadzenia='" + idUrzadzenia + "'") == false) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @return zwraca null w wypadku niepowodzenia
     */
    public String pobierzNazwa(int idUrzadzenia) {
        String nazwa = "";
        ResultSet rs = DatabaseUtils.queryCommand("nazwa", "InteligentnyBudynek.dbo.Urzadzenia", "idUrzadzenia='" + idUrzadzenia + "'");

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

    public boolean ustawNazwa(int idUrzadzenia, String nazwa) {
        int result = DatabaseUtils.updateCommand("Urzadzenia", "nazwa", "'" + nazwa + "'", "idUrzadzenia = '" + idUrzadzenia + "'");
        if (result != 1) {
            System.err.println("Nie dokonano zmiany nazwy urządzenia!");
            return false;
        }
        return true;
    }

    /**
     * @return zwraca < 0 w wypadku niepowodzenia
     */
    public double pobierzMoc(int idUrzadzenia) {
        double moc = 0.0;
        ResultSet rs = DatabaseUtils.queryCommand("moc", "InteligentnyBudynek.dbo.Urzadzenia", "idUrzadzenia='" + idUrzadzenia + "'");

        if (rs == null) {
            return -1;
        }
        try {
            while (rs.next()) {
                moc = Double.parseDouble(rs.getString("moc"));
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy próbie pobrania mocy!");
            moc = -1;
        }
        return moc;
    }

    public boolean ustawMoc(int idUrzadzenia, double moc) {
        int result = DatabaseUtils.updateCommand("Urzadzenia", "moc", Double.toString(moc), "idUrzadzenia = '" + idUrzadzenia + "'");
        if (result != 1) {
            System.err.println("Nie dokonano zmiany mocy urządzenia!");
            return false;
        }
        return true;
    }

    public double pobierzPoborGazu(int idUrzadzenia) {
        double poborGazu = 0.0;
        ResultSet rs = DatabaseUtils.queryCommand("poborGazu", "Urzadzenia", "idUrzadzenia='" + idUrzadzenia + "'");

        if (rs == null) {
            return -1;
        }
        try {
            while (rs.next()) {
                poborGazu = Double.parseDouble(rs.getString("poborGazu"));
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy próbie pobrania poboru gazu!");
            poborGazu = -1;
        }
        return poborGazu;
    }

    public boolean ustawPoborGazu(int idUrzadzenia, double poborGazu) {
        int result = DatabaseUtils.updateCommand("Urzadzenia", "poborGazu", Double.toString(poborGazu), "idUrzadzenia = '" + idUrzadzenia + "'");
        if (result != 1) {
            System.err.println("Nie dokonano zmiany poboru gazu urzadzenia!");
            return false;
        }
        return true;
    }

    public boolean czyPracuje(int idUrzadzenia) {
        int idPracaUrzadzenia = -1;
        String startPracy = "";
        String koniecPracy = "";
        boolean pracuje = false;

        List<String> colNames = new ArrayList<String>();
        List<String> tableNames = new ArrayList<String>();
        List<String> tableRelations = new ArrayList<String>();

        colNames.add("TOP 1 idPracaUrzadzenia AS idPracaUrzadzenia, startPracy, koniecPracy");

        tableNames.add("PracaUrzadzenia");
        tableNames.add("Urzadzenia");

        tableRelations.add("idUrzadzenia");

        ResultSet rs = DatabaseUtils.queryCommand(colNames, tableNames, tableRelations,
                "PracaUrzadzenia.idUrzadzenia='" + idUrzadzenia + "' GROUP BY idPracaUrzadzenia, "
                + "startPracy, koniecPracy ORDER BY idPracaUrzadzenia DESC");

        try {
            while (rs.next()) {
                idPracaUrzadzenia = Integer.parseInt(rs.getString("idPracaUrzadzenia"));
                startPracy = rs.getString("startPracy");
                koniecPracy = rs.getString("koniecPracy");
                System.out.println(idPracaUrzadzenia + " :s " + startPracy + " :k " + koniecPracy);
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy próbie pobrania poboru danych pracy urzadzenia!");
        }

        if (!(startPracy.equals(koniecPracy))) {
            pracuje = true;
        }

        return pracuje;
    }

    public boolean rejestrujWlaczenie(int idUrzadzenia) {
        boolean success = false;

        if (czyPracuje(idUrzadzenia)) {
            return success;
        }

        List<String> columnNames = new ArrayList<String>();
        List<String> values = new ArrayList<String>();

        columnNames.add("idUrzadzenia");
        columnNames.add("startPracy");
        values.add(Integer.toString(idUrzadzenia));
        values.add("getDate()");
        DatabaseUtils.insertCommand("PracaUrzadzenia", columnNames, values);
        success = true;

        return success;
    }

    public boolean rejestrujWylaczenie(int idUrzadzenia) {
        boolean success = false;

        if (!czyPracuje(idUrzadzenia)) {
            return success;
        }

        String tableName = "PracaUrzadzenia";
        String columnName = "koniecPracy";
        String value = "getDate()";
        String condition = "idUrzadzenia = '" + idUrzadzenia + "'";
        DatabaseUtils.updateCommand(tableName, columnName, value, condition);

        success = true;

        return success;
    }

    public int pobierzCzasPracy(int idUrzadzenia) {
        int czasPracy = 0;
        ResultSet rs = DatabaseUtils.queryCommand("czasPracy", "InteligentnyBudynek.dbo.PracaUrzadzenia", "idUrzadzenia='" + idUrzadzenia + "'");

        if (rs == null) {
            return -1;
        }
        try {
            while (rs.next()) {
                czasPracy = Integer.parseInt(rs.getString("czasPracy"));
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy próbie pobrania poboru pracy urzadzenia!");
            czasPracy = -1;
        }
        return czasPracy;
    }
}
