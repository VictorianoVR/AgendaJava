/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import AgenfaDo.AgendaDo;
import AgrendaEntidad.AgendaModel;
import java.sql.Date;
import java.sql.SQLException;



/**
 *
 * @author vvvvr
 */
public class Pruebas {
    AgendaDo abo = new AgendaDo();
    AgendaModel agen = new AgendaModel();
    String mensaje = "";
    
    public void insert() throws SQLException{
    agen.setNombre("v");
    agen.setApellido("v");
    agen.setCelular("8098457933");
    agen.setFechaNacimiento("1820/5/5");
    agen.setDireccion("jhdbfjbdv");
    mensaje = abo.agregar(agen);
        System.out.println(mensaje);
    }
      public void editar() throws SQLException{
    agen.setNombre("vgbg");
    agen.setApellido("vgfc");
    agen.setCelular("111111");
    agen.setFechaNacimiento("1850/5/9");
    agen.setDireccion("mmmmmm");
    agen.setId(10);
    mensaje = abo.editar(agen);
        System.out.println(mensaje);
    }
    
     public void eliminar() throws SQLException{
         agen.setId(8);
    mensaje = abo.eliminar(agen.getId());
        System.out.println(mensaje);
    }
    public static void main (String[] args) throws SQLException{
    Pruebas pruebas = new Pruebas();
    pruebas.editar();
            
    }
}
