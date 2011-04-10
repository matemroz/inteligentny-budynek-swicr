package Model.Utils;

import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

        private Statement st;

        /**
          * Konstruktor, który tworzy obiekt klasy Statement
        */
        public DatabaseManager(){
                try {
                        st = ConnectionManager.getDatabaseConnection().createStatement();
                } catch (SQLException e) {
                }
        }

        /**
         * Metoda odpowiedzialna za utworzenie bazy i tabel.
         * @throws SQLException  If an sql exception occured.
         */
        public void createTables() throws SQLException{
            String crDatabase = "DECLARE @db_name varchar(100) "
                                   + "SET @db_name='InteligentnyBudynek' "
                                   + "IF EXISTS(SELECT * FROM sys.sysdatabases where name=@db_name) "
                                            + "PRINT 'Database exists' "
                                   +  "else "
                                    +    "CREATE DATABASE InteligentnyBudynek ";

            String crTableUrzadzenia = "IF NOT EXISTS (SELECT * FROM SYSOBJECTS O "
                                    + "WHERE O.[NAME] = 'Urzadzenia' "
                                    + "AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1) "
                                    + ") "
                                    + " CREATE TABLE Urzadzenia("
                                    + "idUrzadzenia INT IDENTITY NOT NULL PRIMARY KEY, "
                                    + " idPokoju INT "
                                    + "nazwa VARCHAR(255), "
                                    + "moc FLOAT, "
                                    + "poborGazu FLOAT "
                                    + ") ";

            String crTablePracaUrzadzenia = "IF NOT EXISTS (SELECT * FROM SYSOBJECTS O "
                                    + "WHERE O.[NAME] = 'PracaUrzadzenia' "
                                    + "AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1) "
                                    + ") "
                                    + " CREATE TABLE PracaUrzadzenia("
                                    + " idPracaUrzadzenia INT IDENTITY NOT NULL PRIMARY KEY, "
                                    + " idUrzadzenia INT NOT NULL, "
                                    + " startPracy DATETIME, "
                                    + " koniecPracy DATETIME, "
                                    + " czasPracy as convert(int,datediff(s, startPracy, koniecPracy)) "
                                    + " ) ";

            String crTableGazPrad =  " IF NOT EXISTS (SELECT * FROM SYSOBJECTS O "
                                    + " WHERE O.[NAME] = 'GazPrad' "
                                    + " AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1) "
                                    + " ) "
                                    + " CREATE TABLE GazPrad( "
                                    + " gaz FLOAT, "
                                    + " prad FLOAT "
                                    + " ) ";
            
                        st.execute(crDatabase);
                        st.execute(crTableUrzadzenia);
                        st.execute(crTablePracaUrzadzenia);
                        st.execute(crTableGazPrad);

         System.out.println("Created tables and database");
        }
}