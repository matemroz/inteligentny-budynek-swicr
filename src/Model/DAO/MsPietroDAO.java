
package Model.DAO;

import Controller.ElementyBudynku.Pokoj;
import Model.Utils.DatabaseUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MsPietroDAO implements IPietroDAO{

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
    }
}
