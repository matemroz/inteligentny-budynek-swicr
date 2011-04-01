package Model.Utils;

import java.sql.*;
import java.util.*;

public class DatabaseUtils {


    public static boolean executeCommand(String tableName, List<String> columnNames, List<String> values){
        /*StringBuilder sql = new StringBuilder("INSERT INTO ");
        sql.append(tableName).append(" (");
        Iterator itColumnNames = columnNames.iterator();
        while(itColumnNames.hasNext()){
           sql.append(itColumnNames.next()).append(", ");
        }
        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(") VALUES (");
        Iterator itValues = values.iterator();
        while(itValues.hasNext()) {
           sql.append("'");
           sql.append(itValues.next()).append("', ");
        }
        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(")");

        System.out.println(sql.toString());

        Statement st = null;*/
        return true;
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
        while(itTableNames.hasNext()){
            tabName = itTableNames.next().toString();
            tableRelation = "";
            sql.append(tabName);
          
            if( i > 0 && itTableRelations.hasNext()){
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
            System.err.println("SQL error while querying data:\n"
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
            System.err.println("SQL error while querying data:\n"
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
            System.err.println("SQL error while querying data:\n"
                    + ex.getSQLState()
                    + "\n" + ex.getErrorCode());
        }
        return rs;
    }

}
