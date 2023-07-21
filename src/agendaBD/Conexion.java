/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vvvvr
 */
public class Conexion {
    
    private static Connection con = null;
    private static String login = "system";
    private static String clave = "123456";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection() throws SQLException{
        try
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection(url,login,clave);
        con.setAutoCommit(false);
                    if (con != null) {
                        System.out.println("Conexion exitosa");
                    }else {
                        System.out.println("Conexion fallida");
                    }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Conexion fallida\n" + e.getMessage());
        }
        return con;
    }
    public void desconexion(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar" + e.getMessage());
        }
    }
    public static void main(String [] args) throws SQLException{
    Conexion c = new Conexion();
    c.getConnection();
    }
}
