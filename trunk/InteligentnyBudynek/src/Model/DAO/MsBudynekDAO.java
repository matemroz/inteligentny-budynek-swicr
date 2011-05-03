package Model.DAO;

import Model.Utils.DatabaseUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MsBudynekDAO implements IBudynekDAO {

    public int dodaj(String nazwa) {
        List<String> columnNames = new ArrayList<String>();
        columnNames.add("nazwa");

        List<String> columnTypes = new ArrayList<String>();
        columnTypes.add("Varchar(40)");

        List<String> values = new ArrayList<String>();
        values.add(nazwa);

        ResultSet rs = DatabaseUtils.insertCommandWithKeyResult("Budynek", columnNames, values);

        if (rs == null) {
            return -2;
        }
        int id = -1;
        try {
            while (rs.next()) {
                id = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.err.println("Nie uda�o si� uzyska�i id dodanego budynku!");
            id = -1;
        }
        return id;
    }

    public boolean usun(int idBudynku) {
        if (DatabaseUtils.deleteCommand("Budynek", "idBudynku='" + idBudynku + "'") == false) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean ustawNazwe(int idBudynku, String nazwa) {
        int result = DatabaseUtils.updateCommand("Budynek", "nazwa", "'" + nazwa + "'", "idBudynku = '" + idBudynku + "'");
        if (result != 1) {
            System.err.println("Nie dokonano zmiany nazwy budynku!");
            return false;
        }
        return true;
    }

    @Override
    public String pobierzNazwe(int idBudynku) {
        String nazwa = "";
        ResultSet rs = DatabaseUtils.queryCommand("nazwa", "Budynek", "idBudynku='" + idBudynku + "'");

        if (rs == null) {
            return null;
        }
        try {
            while (rs.next()) {
                nazwa = rs.getString("nazwa");
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy probie pobrania nazwy budynku!");
            nazwa = null;
        }
        return nazwa;
    }

    @Override
    public List<Integer> pobierzListeBudynkow() {
        List<Integer> budynki = new ArrayList<Integer>();

        ResultSet rs = DatabaseUtils.queryCommand("idBudynku, nazwa", "Budynek", "");

        if (rs == null) {
            return null;
        }
        try {
            while (rs.next()) {
                int idBudynku = Integer.parseInt(rs.getString("idBudynku"));
                System.out.println(idBudynku);
                budynki.add(idBudynku);

            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy probie pobrania id budynku!");
        }
        return budynki;
    }

    public List<Integer> pobierzListePieter(int idBudynku) {
        List<Integer> pietra = new ArrayList<Integer>();
        List<String> colNames = new ArrayList<String>();
        colNames.add("idPietra");
        List<String> tableNames = new ArrayList<String>();
        tableNames.add("Pietro");
        tableNames.add("Budynek");
        List<String> tableRelations = new ArrayList<String>();
        tableRelations.add("idBudynku");
        String condition="Pietro.idBudynku=" + idBudynku;
        ResultSet rs = DatabaseUtils.queryCommand(colNames, tableNames, tableRelations, condition);

        if (rs == null) {
            return null;
        }
        try {
            while (rs.next()) {
                int idPietra = Integer.parseInt(rs.getString("idPietra"));
                System.out.println(idPietra);
                pietra.add(idPietra);

            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy probie pobrania id pietra!");
        }
        return pietra;
    }

    public static void main(String[] args){
        (new MsBudynekDAO()).pobierzListePieter(1);
    }
}
