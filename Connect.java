/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto_vistas;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rib
 */
public class Connect 
{
    
      //Datos de conexion
    Connection con;
    String url = "jdbc:mysql://localhost:3306/tiendita"; //datos de mysql
    String user = "root";
    String pass = "";

    //metodo para la conexion
    public Connection Connects() 
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    } 
    //test para probar la ejecion debe de devolver: com.mysql.cj.jdbc.ConnectionImpl@305fd85d
    public static void main(String[] args) 
    {
        Connect sp = new Connect();
        System.out.println(sp.Connects());
    } 
    
}
