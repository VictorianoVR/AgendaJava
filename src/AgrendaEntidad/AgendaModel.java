/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgrendaEntidad;

import java.util.Date;

/**
 *
 * @author vvvvr
 */
public class AgendaModel {
    
 String nombre;
 String apellido;
 String celular;
 String direccion;
 String fechaNacimiento;
 int id;

    public AgendaModel() {
    }

    public AgendaModel(String nombre, String apellido, String celular, String direccion, String fechaNacimiento, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.id = id;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getId() {
        return id;
    }
     public void setId(int id) {
        this.id = id;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

    @Override
    public String toString() {
        return "AgendaModel{" + "nombre=" + nombre + ", apellido=" + apellido + ", celular=" + celular + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", id=" + id + '}';
    }

     
 
}
