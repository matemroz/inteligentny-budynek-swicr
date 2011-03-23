package Model.Utils;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;

public class ConnectionManager {

        private static final ConnectionManager cm = new ConnectionManager();
        private Connection conn;


    /**
          * Class constructor which creates the connection to database.
        */
        private ConnectionManager(){
        }

        /**
         * Method responsible for getting connection to database.
         * @return object Connection type
         * @throws SQLException  If an sql exception occured.
         */
        public static Connection getDatabaseConnection() throws SQLException{
                if(cm.conn == null || cm == null)
                        new ConnectionManager();
                return cm.conn;
        }

        /**
         * Method responsible for closing connection from database.
         * @throws SQLException  If an sql exception occured.
         */
        public void disconnectFromDatabase() throws SQLException{
                conn.close();
        }
}

		