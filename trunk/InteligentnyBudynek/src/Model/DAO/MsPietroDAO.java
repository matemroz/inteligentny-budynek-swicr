package Model.DAO;

import Controller.ElementyBudynku.Pokoj;
import Model.Utils.DatabaseUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MsPietroDAO implements IPietroDAO {

    public int dodaj(String nazwa, int idBudynku) {
        List<String> columnNames = new ArrayList<String>();
        columnNames.add("nazwa");
        columnNames.add("idBudynku");

        List<String> columnTypes = new ArrayList<String>();
        columnTypes.add("Varchar(40)");
        columnTypes.add("int");

        List values = new ArrayList();
        values.add(nazwa);
        values.add(idBudynku);

        ResultSet rs = DatabaseUtils.insertCommandWithKeyResult("Pietro", columnNames, values);

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

    @Override
    public List<Integer> wylistujPokoje(int idPietra) {
        // TODO Auto-generated method stub    public List<Integer> pobierzListePieter(int idBudynku) {
        List<Integer> pokoje = new ArrayList<Integer>();
        List<String> colNames = new ArrayList<String>();
        colNames.add("idPokoju");
        List<String> tableNames = new ArrayList<String>();
        tableNames.add("Pokoj");
        tableNames.add("Pietro");
        List<String> tableRelations = new ArrayList<String>();
        tableRelations.add("idPietra");
        String condition="Pokoj.idPietra=" + idPietra;
        ResultSet rs = DatabaseUtils.queryCommand(colNames, tableNames, tableRelations, condition);

        if (rs == null) {
            return null;
        }
        try {
            while (rs.next()) {
                int idPokoju = Integer.parseInt(rs.getString("idPokoju"));
                System.out.println(idPokoju);
                pokoje.add(idPokoju);

            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy probie pobrania id pokoju!");
        }
        return pokoje;
    }

    @Override
    public void ustawNazwe(int idPietra, String nazwa) {
         int result = DatabaseUtils.updateCommand("Pietro", "nazwa", "'" + nazwa + "'", "idPietra = '" + idPietra + "'");
        if (result != 1) {
            System.err.println("Nie dokonano zmiany nazwy budynku!");

        }
        
    }

    @Override
    public String pobierzNazwe(int idPietra) {
        String nazwa = "";
        ResultSet rs = DatabaseUtils.queryCommand("nazwa", "Pietro", "idPietra='" + idPietra + "'");

        if (rs == null) {
            return null;
        }
        try {
            while (rs.next()) {
                nazwa = rs.getString("nazwa");
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy probie pobrania nazwy pietra!");
            nazwa = null;
        }
        return nazwa;
    }

    @Override
    public int pobierzIdBudynku(int idPietra) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void ustawIdBudynku(int idPietra, int idBudynku) {
        // TODO Auto-generated method stub
    }
    /*
    public List<Integer> wylistujPokoje() {
    List<Integer> idPokojow = new ArrayList<Integer>();

    ResultSet rs = DatabaseUtils.queryCommand("idPokoju", "Pokoj", "");

    if (rs == null) {
    return null;
    }
    try {
    while (rs.next()) {
    int idPokoju = Integer.parseInt(rs.getString("idPokoju"));
    System.out.println(idPokoju);
    idPokojow.add(idPokoju);
    }
    } catch (SQLException ex) {
    System.err.println("Niepowodzenie przy próbie pobrania listy pokoi!");
    }
    return idPokojow;
    }*/

    public static void main(String[] args) {
        (new MsPietroDAO()).dodaj("Drugie piętro", 1);
    }
}
