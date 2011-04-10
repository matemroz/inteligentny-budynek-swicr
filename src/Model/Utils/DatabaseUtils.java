package Model.Utils;

import java.sql.*;
import java.util.*;

public class DatabaseUtils {

    public static boolean insertCommand(String tableName, List<String> columnNames, List<String> values){
        boolean success = false;
        StringBuilder sql = new StringBuilder("INSERT INTO ");
        sql.append(tableName).append(" (");
        Iterator itColumnNames = columnNames.iterator();

        while(itColumnNames.hasNext()){
            sql.append(itColumnNames.next()).append(", ");
        }

        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(") VALUES (");
        Iterator itValues = values.iterator();
        while(itValues.hasNext()){
            String value = itValues.next().toString();
            if(value.equals("getDate()"))
                sql.append(value).append(", ");
            else
                sql.append("'").append(value).append("'").append(", ");
        }
        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(" );");

        System.out.println(sql.toString());

        try {
            Statement st = ConnectionManager.getDatabaseConnection().createStatement();
            st.execute(sql.toString());
            success = true;
        } catch (SQLException ex) {
            System.err.println("Błąd przy wykonywyniu operacji INSERT w bazie. \n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());
            success = false;
        }

        return success;
    }

    public static ResultSet insertCommandWithKeyResult(String tableName, List<String> columnNames, List<String> values){
        StringBuilder sql = new StringBuilder("INSERT INTO ");
        sql.append(tableName).append(" (");
        Iterator itColumnNames = columnNames.iterator();
        
        while(itColumnNames.hasNext()){
            sql.append(itColumnNames.next()).append(", ");
        }

        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(") VALUES (");
        Iterator itValues = values.iterator();
        while(itValues.hasNext()){
            sql.append("'").append(itValues.next()).append("'").append(", ");
        }
        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(" );");

        System.out.println(sql.toString());

        ResultSet rs = null;
        try {
            Statement st = ConnectionManager.getDatabaseConnection().createStatement();
            st.execute(sql.toString(), st.RETURN_GENERATED_KEYS);
            rs = st.getGeneratedKeys();
        } catch (SQLException ex) {
            System.err.println("Błąd przy wykonywyniu operacji INSERT w bazie. \n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());
        }
    return rs;
    }

    public static int updateCommand(String tableName, String columnName, String value, String condition){

        StringBuilder sql = new StringBuilder("UPDATE ");
        sql.append(tableName).append(" SET ").append(columnName).append(" = ").append(value).append(" ");
        sql.append("WHERE ").append(condition).append(";");
        int resultSuccess = -1;
        System.out.println(sql.toString());
        try {
            Statement st = ConnectionManager.getDatabaseConnection().createStatement();
            resultSuccess = st.executeUpdate(sql.toString());
        } catch (SQLException ex) {
            System.err.println("Błąd przy wykonywyniu operacji INSERT w bazie. \n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());
        }

        return resultSuccess;
    }

    public static ResultSet queryCommand(List<String> colNames, List<String> tableNames, List<String> tableRelations, String condition) {
        ResultSet rs = null;
        Statement st = null;
        StringBuilder sql = new StringBuilder("SELECT ");
        Iterator itColNames = colNames.iterator();

        while (itColNames.hasNext()) {
            sql.append(itColNames.next().toString());
            sql.append(", ");
        }

        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(" FROM ");

        Iterator itTableNames = tableNames.iterator();
        Iterator itTableRelations = tableRelations.iterator();
        String tabName = "", prevTabName = "", tableRelation = "";
        int i = 0;
        while (itTableNames.hasNext()) {
            tabName = itTableNames.next().toString();
            tableRelation = "";
            sql.append(tabName);

            if (i > 0 && itTableRelations.hasNext()) {
                sql.append(" ON ");
                tableRelation = itTableRelations.next().toString();
                sql.append(prevTabName).append(".").append(tableRelation);
                sql.append(" = ");
                sql.append(tabName).append(".").append(tableRelation);
            }
            prevTabName = tabName;
            sql.append(" INNER JOIN ");
            i++;
        }

        sql.delete(sql.toString().length() - " INNER JOIN ".length(), sql.toString().length());
        sql.append(" WHERE ");
        sql.append(condition);

        System.out.println(sql.toString());

        try {
            st = ConnectionManager.getDatabaseConnection().createStatement();
            if ((rs = st.executeQuery(sql.toString())) == null) {
                return null;
            }
        } catch (SQLException ex) {
            System.err.println("Błąd przy wykonywnaniu operacji SELECT w bazie. \n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());
        }
        return rs;
    }

    public static ResultSet queryCommand(List<String> colNames, String tableName, String condition) {
        ResultSet rs = null;
        Statement st = null;

        StringBuilder sql = new StringBuilder("SELECT ");
        Iterator itColNames = colNames.iterator();
        while (itColNames.hasNext()) {
            sql.append(itColNames.next().toString()).append(", ");
        }
        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(" FROM ").append(tableName).append(" WHERE ").append(condition);

        try {
            if ((rs = st.executeQuery(sql.toString())) == null) {
                return null;
            }
        } catch (SQLException ex) {
            System.err.println("Błąd przy wykonywnaniu operacji SELECT w bazie. \n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());
        }
        return rs;
    }

    public static ResultSet queryCommand(String colName, String tableName, String condition) {
        ResultSet rs = null;
        Statement st = null;

        StringBuilder sql = new StringBuilder("SELECT ");
        if(condition.equals("")){
            sql.append(colName).append(" FROM ").append(tableName);
        } else {
            sql.append(colName).append(" FROM ").append(tableName).append(" WHERE ").append(condition);
        }
        System.out.println(sql.toString());

        try {
            st = ConnectionManager.getDatabaseConnection().createStatement();
            rs = st.executeQuery(sql.toString());
        } catch (SQLException ex) {
            System.err.println("Błąd przy wykonywnaniu operacji SELECT w bazie. \n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());
        }
        return rs;
    }

    //Nie ma mozliwosci chyba, zeby sprawdzic return
    public static boolean deleteCommand(String tableName, String condition){
        ResultSet rs = null;
        Statement st = null;

        StringBuilder sql = new StringBuilder("DELETE FROM ");
        sql.append(tableName).append(" WHERE ").append(condition);
        System.out.println(sql.toString());

        try {
            st = ConnectionManager.getDatabaseConnection().createStatement();
            st.execute(sql.toString());
            
        } catch (SQLException ex) {
            System.err.println("Błąd przy wykonywnaniu operacji DELETE w bazie. \n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());
        }
        return true;
    }
}
