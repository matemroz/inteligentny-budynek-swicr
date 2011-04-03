package Model.Utils;

import java.sql.*;

public class ConnectionManager {

        private static final ConnectionManager cm = new ConnectionManager();
        private static Connection conn;


    /**
          * Konstruktor umożliwiający połączenie z bazą
        */
        private ConnectionManager(){
            try {
                    java.lang.Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    conn = java.sql.DriverManager.getConnection("jdbc:sqlserver://DON-LAPTOP:1433;DatabaseName=InteligentnyBudynek;user=budynek;password=haslo;SelectMethod=cursor ");
                    System.out.println("Polączono z bazką\n");
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }

        /**
         * Metoda odpowiedzialna za udostępnianie instancji połączenia
         * @return object Connection type
         * @throws SQLException  If an sql exception occured.
         */
        public static Connection getDatabaseConnection() throws SQLException{
                if(cm.conn == null || cm == null)
                        new ConnectionManager();
                return cm.conn;
        }

        /**
         * Metoda odpowiedzialna za kończenie połączenia z bazą
         * @throws SQLException  If an sql exception occured.
         */
        public static void disconnectFromDatabase() throws SQLException{
                conn.close();
        }

}

		