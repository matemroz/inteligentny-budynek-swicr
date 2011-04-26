package Model.DAO;


import java.sql.*;


public class MsDAO extends DAOFactory {

    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DBURL = "jdbc:sqlserver://DON-LAPTOP:1433;DatabaseName=InteligentnyBudynek;user=budynek;password=haslo;SelectMethod=cursor";
    private static Connection conn;

    public static Connection createConnection() {
        try {
			java.lang.Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			conn = java.sql.DriverManager.getConnection(DBURL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
