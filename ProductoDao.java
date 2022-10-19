/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto_vistas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rib
 */
public class ProductoDao 
{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Connect acceso = new Connect(); //objeto de la clase Conexion
    
    //select
    public ArrayList cargar() //Metodo cargar en el load del menu principal la tabla
    {
        String sql = "select *from productos"; //comando a ejecutar
        try {
            //inicializa la base de datos
            con = acceso.Connects();//mandar a llamar el método
            ps = con.prepareStatement(sql); //variable sql (select)
            rs = ps.executeQuery(); //ejecutar el Query
            
            ArrayList<producto> datos = new ArrayList<producto>(); 
                      
            while(rs.next()) //devuelve valor true, y va ir linea en linea (Todos los registros)
            {
                producto al = new producto(); //mando a llamar la clase alumno del paquete Vista
        
                al.setCodigo(rs.getInt(1)); //columna1);
                al.setNombre(rs.getString(2)); //columna2);
                al.setCantidad(rs.getInt(3)); //clumna3
                al.setFabricacion(rs.getString(4)); //columna4
                al.setFecha(rs.getString(5)); //columna5
                datos.add(al);   
                //  System.out.println("Nombres: "+rs.getString(2));
           
            }
            return datos;
        } catch (Exception e) {
           System.out.println(e); 
          
        }
       return null;
    }
    
    
      //Insert a la BD (agregar)
    public void insertar(int codigo, String nombre, int cantidad, String fabricacion, String fecha)
    {
        String sql = "insert into productos (codigo, nombre, cantidad, fabricacion, fecha) values (?, ?, ?, ?, ? ); "; //1era. FOrma
        
        try {
            con = acceso.Connects();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, cantidad);
            ps.setString(4, fabricacion);
             ps.setString(5, fecha);
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }      
    }
    
    //metodo update
    public void actualizar(int codigo, String nombre, int cantidad, String fabricacion, String fecha)
    {
        String sql = "update productos set nombre = ?, cantidad = ?, fabricacion = ?, fecha = ? where codigo = ? ;";
        
        try {
            con = acceso.Connects();
            ps = con.prepareStatement(sql);
               
            ps.setString(1, nombre);
            ps.setInt(2, cantidad);
            ps.setString(3, fabricacion);
            ps.setString(4, fecha);
            ps.setInt(5, codigo);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }      
    }
    
    //Elminar registros a la BD 
    public void eliminar(int codigo )
    {
         String sql = "delete from productos where codigo ="+codigo+";";
         
          try {
            con = acceso.Connects();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }      
    }
    
    //para buscar ID
    public void buscar_producto(int codigo)
    {
        String sql = "select * from productos where codigo ="+codigo;
        try {
                con = acceso.Connects();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    //recibiendo de la vista Actualizar
                    Actualizar act = new Actualizar(); //recibiendo los datos de la tabla del codigo seleccionado
                    act.mostrar(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)); //funcion mostrar de la vista Actualizar de las cajas de texto
                    act.setVisible(true);

                }else
                {
                    System.out.println("Codigo no valido");          
                }
            
            } catch (Exception e) {
            System.out.println(e);
            } 
    }
    
    public void buscar_eliminar(int codigo)
    {
        String sql = "select * from productos where codigo ="+codigo;
        try {
                con = acceso.Connects();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next())
                {
                   Eliminar elim = new Eliminar();
                   elim.txt_Codigo.setText(rs.getInt(1)+"");
                   elim.txt_nombre.setText(rs.getString(2));
                   elim.txt_cantidad.setText(rs.getInt(3)+"");
                   elim.txt_fabricacion.setText(rs.getString(4));
                   elim.txt_fecha.setText(rs.getString(5));
                   elim.setVisible(true);

                }else
                {
                    System.out.println("Codigo no valido");          
                }
            
            } catch (Exception e) {
            System.out.println(e);
            }
    }
    
    
    public static void main(String[] args) 
    {
   ProductoDao p = new ProductoDao();
  //  p.actualizar(2, "Leche Liquido", 12, "Formost", "2022-10-12");
    }  
    
}
