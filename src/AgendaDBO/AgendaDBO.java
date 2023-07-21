/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaDBO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import AgrendaEntidad.AgendaModel;

import javax.swing.JTable;



public class AgendaDBO {
    private String mensaje = "";
    
    public String agregar(Connection con, AgendaModel model){
    PreparedStatement pst = null;
    String sql = "INSERT INTO agenda (nombre,apellido, celular, fecha_nacimiento,direccion,id)"
            + "VALUES (?,?,?,TO_DATE(?, 'yyyy/mm/dd'),?,AgendaSEQ.NextVal)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, model.getNombre());
            pst.setString(2, model.getApellido());
            pst.setString(3, model.getCelular());
            pst.setString(4,  model.getFechaNacimiento());
            pst.setString(5, model.getDireccion());
            mensaje = "Guradado correctamente";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No fue guradado correctamente \n" + e.getMessage();
        }
    return mensaje;
    }
    public String editar(Connection con, AgendaModel model){
        PreparedStatement pst = null;
    String sql = "UPDATE agenda SET nombre = ?, apellido = ?,celular = ?, fecha_nacimiento = TO_DATE(?, 'yyyy/mm/dd'), direccion = ?"
            + "WHERE id = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, model.getNombre());
            pst.setString(2, model.getApellido());
            pst.setString(3, model.getCelular());
            pst.setString(4,  model.getFechaNacimiento());
            pst.setString(5, model.getDireccion());
            pst.setInt(6, model.getId());
            
            mensaje = "Editado correctamente";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No fue editado correctamente \n" + e.getMessage();
        }
    return mensaje;
    }
    public String eliminar(Connection con, int id){
               PreparedStatement pst = null;
    String sql = "DELETE agenda WHERE id = ?";
    
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
         
            mensaje = "Eliminado correctamente";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No fue eliminado correctamente \n" + e.getMessage();
        }
    return mensaje;
    }
    public String mostrar(Connection con, JTable table ){
    return mensaje;
    }
}
