/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswabaru;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class databaseConnection {
    public static Connection getKoneksi()
    {
        Connection connect = null;
        String url = "jdbc:mysql://localhost/daftar";
        String user = "root";
        String password = "";
        try {
            connect = DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            System.out.println(e);
        }
        return connect;
    }
    
}
