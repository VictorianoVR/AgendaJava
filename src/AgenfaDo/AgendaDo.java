/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenfaDo;

import AgrendaEntidad.AgendaModel;
import AgendaDBO.AgendaDBO;
import agendaBD.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author vvvvr
 */
public class AgendaDo {
    
    private String mensaje = "";
    private AgendaDBO adao = new AgendaDBO ();
    
    public String agregar(AgendaModel model) throws SQLException{
       Connection con = Conexion.getConnection();
        try {
            
            mensaje = adao.agregar(con, model);
        } catch (Exception e) {
            mensaje = mensaje + ""+e.getMessage();
        }finally{
            try {
                if (con != null) {
                    con.close();
                }
                
            } catch (Exception e) {
                mensaje = mensaje + ""+e.getMessage();
            }
        }
    return mensaje;
    }
    
    public String editar(AgendaModel model) throws SQLException{
         Connection con = Conexion.getConnection();
        try {
            
            mensaje = adao.editar(con, model);
        } catch (Exception e) {
            mensaje = mensaje + ""+e.getMessage();
        }finally{
            try {
                if (con != null) {
                    con.close();
                }
                
            } catch (Exception e) {
                mensaje = mensaje + ""+e.getMessage();
            }
        }
    return mensaje;
    }
    public String eliminar(int id) throws SQLException{
         Connection con = Conexion.getConnection();
        try {
            
            mensaje = adao.eliminar(con, id);
        } catch (Exception e) {
            mensaje = mensaje + ""+e.getMessage();
        }finally{
            try {
                if (con != null) {
                    con.close();
                }
                
            } catch (Exception e) {
                mensaje = mensaje + ""+e.getMessage();
            }
        }
    return mensaje;
    }
    public String mostrar(AgendaModel model){
    return mensaje;
    } 
}
