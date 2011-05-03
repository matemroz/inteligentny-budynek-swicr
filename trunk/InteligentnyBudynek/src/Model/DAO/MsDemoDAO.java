/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.DAO;

import Model.Utils.DatabaseUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafał
 */
public class MsDemoDAO {

     public List wylistujUrzadzenia(int idPokoju) {
        List<Integer> urzadzenia = new ArrayList<Integer>();

        ResultSet rs = DatabaseUtils.queryCommand("idUrzadzenia", "IBDemo.dbo.PracaUrzadzenia", "idPokoju='" + idPokoju + "'");

        if (rs == null) {
            return null;
        }
        try {
            while (rs.next()) {
                int idUrzadzenia = Integer.parseInt(rs.getString("idUrzadzenia"));
                System.out.println(idUrzadzenia);
                urzadzenia.add(idUrzadzenia);
            }
        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy próbie pobrania poboru pracy urzadzenia!");
        }
        return urzadzenia;
    }

    public String pobierzNazwa(int idUrzadzenia) {
        String nazwa = "";
        ResultSet rs = DatabaseUtils.queryCommand("nazwa", "IBDemo.dbo.Urzadzenia", "idUrzadzenia='" + idUrzadzenia + "'");

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

     public double pobierzMoc(int idUrzadzenia) {
        double moc = 0.0;
        ResultSet rs = DatabaseUtils.queryCommand("moc", "IBDemo.dbo.Urzadzenia", "idUrzadzenia='" + idUrzadzenia + "'");

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

      public double pobierzPoborGazu(int idUrzadzenia) {
        double poborGazu = 0.0;
        try {
            ResultSet rs = DatabaseUtils.queryCommand("poborGazu", "IBDemo.dbo.Urzadzenia", "idUrzadzenia='" + idUrzadzenia + "'");
            if (rs == null || rs.getString("poborGazu").equals("NULL") || rs.getString("poborGazu") == null) {
                System.out.println("poborGazu jest null");
                return 0.0;
            }
            while (rs.next()) {
                poborGazu = Double.parseDouble(rs.getString("poborGazu"));
            }

        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy probie pobrania poborGazu");
            poborGazu = 0.0;
        }
        return poborGazu;
    }

      public String pobierzPoczatekPracy( int idUrzadzenia){
          String poczatek = "";
           try {
            ResultSet rs = DatabaseUtils.queryCommand("startPracy", "IBDemo.dbo.PracaUrzadzenia", "idUrzadzenia='" + idUrzadzenia + "'");
            if (rs == null || rs.getString("startPracy").equals("NULL") || rs.getString("startPracy") == null) {
                System.out.println("Urządzenie nie pracuje");
                
                return "Nie pracuje";
            }
            while (rs.next()) {
                poczatek = rs.getString("startPracy");
            }

        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy probie pobrania poborGazu");
            poczatek = "Nie udało sie";
        }
          return poczatek;
      }
      
      public String pobierzKoniecPracy( int idUrzadzenia){
          String koniec = "";
          try {
            ResultSet rs = DatabaseUtils.queryCommand("koniecPracy", "IBDemo.dbo.PracaUrzadzenia", "idUrzadzenia='" + idUrzadzenia + "'");
            if (rs == null || rs.getString("koniecPracy").equals("NULL") || rs.getString("koniecPracy") == null) {
                System.out.println("Urządzenie nie pracuje");

                return "Nie pracuje";
            }
            while (rs.next()) {
                koniec = rs.getString("koniecPracy");
            }

        } catch (SQLException ex) {
            System.err.println("Niepowodzenie przy probie pobrania poborGazu");
            koniec = "Nie udało sie";
        }
          return koniec;
      }
}
