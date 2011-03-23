package Model.Utils;

import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

        private Statement st;

        /**
          * DatabaseManager class constructor. Creates an instance of Statement object.
        */
        public DatabaseManager(){
                try {
                        st = ConnectionManager.getDatabaseConnection().createStatement();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        /**
         * Method creates tables in the database if there are no tables with the same name.
         * @throws SQLException  If an sql exception occured.
         */
        public void createTables() throws SQLException{
             String crTab = "DECLARE @db_name varchar(100)"
                                   + "SET @db_name='InteligentnyBudynek'"
                                   + "IF EXISTS(SELECT * FROM sys.sysdatabases where name=@db_name)"
                                            + "PRINT 'Database exists'"
                                   +  "else"
                                    +    "CREATE DATABASE InteligentnyBudynek"
                                    + "GO"
                                    + "USE InteligentnyBudynek"
                                    + "GO"
                                    + "IF NOT EXISTS (SELECT * FROM SYSOBJECTS O"
                                    + "WHERE O.[NAME] = 'Urzadzenia'"
                                    + "AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1)" 
                                    + ")"
                                    + "CREATE TABLE Urzadzenia("
                                    + "idUrzadzenia INT IDENTITY NOT NULL PRIMARY KEY,"
                                    + "nazwa VARCHAR(255),"
                                    + "moc FLOAT,"
                                    + "poborGazu FLOAT"
                                    + ")"
                                    + "GO"
                                    + "IF NOT EXISTS (SELECT * FROM SYSOBJECTS O"
                                    + "WHERE O.[NAME] = 'PracaUrzadzenia'"
                                    + "AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1)" 
                                    + ")"
                                    + "CREATE TABLE PracaUrzadzenia("
                                    + "idPracaUrzadzenia INT IDENTITY NOT NULL PRIMARY KEY,"
                                    + "idUrzadzenia INT NOT NULL,"
                                    + "startPracy DATETIME,"
                                    + "koniecPracy DATETIME,"
                                    + "czasPracy as convert(int,datediff(s, startPracy, koniecPracy))"
                                    + ")"
                                    + "GO"
                                    + "IF NOT EXISTS (SELECT * FROM SYSOBJECTS O"
                                    + "WHERE O.[NAME] = 'GazPrad'"
                                    + "AND (OBJECTPROPERTY(O.[ID],'isUserTable') = 1)" 
                                    + ")"
                                    + "CREATE TABLE GazPrad("   
                                    + "gaz FLOAT,"
                                    + "prad FLOAT"
                                    + ")"
                                    + "GO";


                        st.execute(crTab);
                        System.out.println("Created tables and database");
        }
}