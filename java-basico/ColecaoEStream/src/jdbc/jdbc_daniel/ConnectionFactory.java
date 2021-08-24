package jdbc.jdbc_daniel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private  ConnectionFactory(){throw new UnsupportedOperationException();}

    public static Connection getConnection() throws SQLException {
        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        Connection conn = null;

        try{
            Connection con = DriverManager.getConnection(urlConnection, "root", "password");
            conn = con;
            System.out.println("Sucesso!");

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
//        } finally {
//            conn.close();
//        }
        return conn;

    }

}
