import java.sql.*;
import java.util.Properties;
import java.sql.SQLException;
public class ConnectDB {

    public Connection con;
    private ResultSet rs;
    private Statement stmt = null;


    public ResultSet getResultSet() {
        return rs;
    }

    public void setResultSet(ResultSet rs) {
        this.rs = rs;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }


    // The JDBC Connector Class.
    private static final String dbClassName = "com.mysql.jdbc.Driver";

    private static final String CONNECTION =
            "jdbc:mysql://127.0.0.1/baseITG";

    public void connect() throws
            ClassNotFoundException,SQLException {
        try{
            System.out.println(dbClassName);
            // Class.forName(xxx) loads the jdbc classes and
            // creates a drivermanager class factory
            Class.forName(dbClassName);

            // Properties for user and password.
            Properties p = new Properties();
            p.put("user","root");
            p.put("password","456852");

            // Now try to connect

            final Connection c = DriverManager.getConnection(CONNECTION,p);
            this.setCon(c);
            System.out.println(c + "It works !");
            System.out.println("Creating statement...");
            String sql = "SELECT * FROM orders;";
            this.getDataFromBase(sql);



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    public void getDataFromBase(String sql){
        try {
            stmt = this.getCon().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            this.setResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
