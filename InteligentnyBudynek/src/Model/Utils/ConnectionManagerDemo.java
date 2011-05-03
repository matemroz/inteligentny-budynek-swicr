/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Utils;

import java.sql.*;
/**
 *
 * @author Rafał
 */
public class ConnectionManagerDemo {

        private static final ConnectionManagerDemo cmd = new ConnectionManagerDemo();
        private static Connection connd;


    /**
          * Konstruktor umożliwiający połączenie z bazą
        */
        private ConnectionManagerDemo(){
            try {
                    java.lang.Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    connd = java.sql.DriverManager.getConnection("jdbc:sqlserver://192.168.1.101:1433;DatabaseName=IBDemo;user=budynek;password=haslo");
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
                if(cmd.connd == null || cmd == null)
                        new ConnectionManagerDemo();
                return cmd.connd;
        }

        /**
         * Metoda odpowiedzialna za kończenie połączenia z bazą
         * @throws SQLException  If an sql exception occured.
         */
        public static void disconnectFromDatabase() throws SQLException{
                connd.close();
        }

        public static void main(String[] args) throws SQLException{
            getDatabaseConnection();
        }
}
