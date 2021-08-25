package jdbc_daniel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {
        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(urlConnection, "rooot", "password");
            System.out.println("Sucesso!");
        }catch(Exception e){
            System.out.println("Falha");
            e.printStackTrace();
        }finally{
            conn.close();
        }
    }



}
