package Model.DAO;

import Model.Utils.DatabaseUtils;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MsGazPradDAO implements IGazPradDAO{

    public double pobierzCenePradu() {
         double cenaPradu = 0.0;
         ResultSet rs = DatabaseUtils.queryCommand("cena", "InteligentnyBudynek.dbo.GazPrad", "nazwa='Prad'");

         if(rs == null)
            return -1;
        try {
            while (rs.next()) {
                cenaPradu = Double.parseDouble(rs.getString("cena"));
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy próbie pobrania ceny prądu!");
            cenaPradu = -1;
        }
        return cenaPradu;
    }

    public boolean ustawCenePradu(double cenaPradu) {
        int result = DatabaseUtils.updateCommand("GazPrad", "cena", Double.toString(cenaPradu), "nazwa='Prad'");
        if (result != 1) {
            System.err.println("Nie dokonano zmiany ceny prądu!");
            return false;
        }
        return true;
    }

    public double pobierzCeneGazu() {
         double cenaGazu = 0.0;
         ResultSet rs = DatabaseUtils.queryCommand("cena", "GazPrad", "nazwa='Gaz'");

         if(rs == null)
            return -1;
        try {
            while (rs.next()) {
                cenaGazu = Double.parseDouble(rs.getString("cena"));
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy próbie pobrania ceny gazu!");
            cenaGazu = -1;
        }
        return cenaGazu;
    }

    public boolean ustawCeneGazu(double cenaGazu) {
        int result = DatabaseUtils.updateCommand("GazPrad", "cena", "'" + Double.toString(cenaGazu) + "'", "nazwa='Gaz'");
        if (result != 1) {
            System.err.println("Nie dokonano zmiany ceny gazu!");
            return false;
        }
        return true;
    }
}
