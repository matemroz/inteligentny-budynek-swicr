package Model.DAO;

import java.sql.*;

public class MsDAO extends DAOFactory {

    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DBURL = "jdbc:sqlserver://DON-LAPTOP:1433;DatabaseName=InteligentnyBudynek;user=budynek;password=haslo;SelectMethod=cursor";
    private static Connection conn;

    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        java.lang.Class.forName(DRIVER);
        conn = java.sql.DriverManager.getConnection(DBURL);
        if (conn == null) {
            return null;
        }
        return conn;
    }

    @Override
    public IUrzadzenieDAO getUrzadzenieDAO() {
        return new MsUrzadzenieDAO();
    }

    @Override
    public IPokojDAO getPokojDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IGazPradDAO getGazPradDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
