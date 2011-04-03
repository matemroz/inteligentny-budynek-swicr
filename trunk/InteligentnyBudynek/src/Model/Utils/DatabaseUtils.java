package Model.Utils;

import java.sql.*;
import java.util.*;

public class DatabaseUtils {

    public static boolean executeCommand(String tableName, List<String> columnNames, List<String> values){
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

        boolean resultSuccess = false;

        try {
            Statement st = ConnectionManager.getDatabaseConnection().createStatement();
            resultSuccess = st.execute(sql.toString());
        } catch (SQLException ex) {
            System.err.println("Błąd przy wykonywyniu operacji INSERT w bazie. \n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());

        }
    return resultSuccess;
    }

    public static boolean executeCommandWithOutput(String tableName, List<String> columnNames, List<String> columnTypes, List<String> values) {
        StringBuilder sql = new StringBuilder("DECLARE");
        sql.append(" @").append(tableName).append("Var").append(" table ( ");
        sql.append("new").append("Id").append(tableName).append(" int").append(", ");

        Iterator itColumnNames = columnNames.iterator();
        Iterator itColumnTypes = columnTypes.iterator();

        if (columnNames.size() != columnTypes.size()) {
            System.out.println("Nieodpowiednio przypisane typy pól do nazw!");
            return false;
        }

        while (itColumnNames.hasNext()) {
            sql.append(itColumnNames.next()).append(" ").append(itColumnTypes.next()).append(", ");
        }
        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append("); ");
        itColumnNames = null;

        sql.append("INSERT ").append(tableName);
        sql.append(" OUTPUT ");
        sql.append("INSERTED.id").append(tableName).append(", ");
        itColumnNames = columnNames.iterator();
        while (itColumnNames.hasNext()) {
            sql.append("INSERTED.").append(itColumnNames.next()).append(", ");
        }
        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append("INTO @").append(tableName).append("Var");
        sql.append(" VALUES (");
        Iterator itValues = values.iterator();
        while (itValues.hasNext()) {
            sql.append("'");
            sql.append(itValues.next()).append("', ");
        }
        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(");");

        boolean resultSuccess = false;

        System.out.println(sql.toString());
        try {
            Statement st = ConnectionManager.getDatabaseConnection().createStatement();
            resultSuccess = st.execute(sql.toString());
        } catch (SQLException ex) {
            System.err.println("Błąd przy wykonywyniu operacji INSERT w bazie. \n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());

        }
        return resultSuccess;
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
        sql.append(colName).append(" FROM ").append(tableName).append(" WHERE ").append(condition);
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

    public static void main(String[] args) {
      /*  List<String> columnNames = new ArrayList<String>();
        columnNames.add("idPokoju");
        columnNames.add("nazwa");
        columnNames.add("moc");
        columnNames.add("poborGazu");


        List<String> values = new ArrayList<String>();
        values.add("1");
        values.add("Salon");
        values.add("30");
        values.add("0");*/

        DatabaseUtils.updateCommand("Urzadzenia", "moc", "70", "idUrzadzenia = '1'");
    }
}
