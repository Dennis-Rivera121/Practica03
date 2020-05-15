/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dennis Rivera
 */
public class Usuario {
    private int cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    
    private List<Telefono> telefonos;
    
     public Usuario() {
        telefonos = new ArrayList<>();
    }

    public Usuario(int cedula, String nombre, String apellido, String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo=correo;
        this.apellido = apellido;
        this.contraseña = contraseña;
        
        telefonos=new ArrayList<>();
    }

    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void agregarTelefono(Telefono telefono) {
        telefonos.add(telefono);
    }

    public void actualizarTelefono(Telefono telefono) {
        if (telefonos.contains(telefono)) {
            int index = telefonos.indexOf(telefono);
            telefonos.set(index,telefono);
        }
    }

    public void eliminarTelefono(Telefono telefono) {
        if (telefonos.contains(telefono)) {
            int index = telefonos.indexOf(telefono);
            telefonos.remove(index);
        }
    }

    public List<Telefono> listar() {
        return telefonos;
    }

    public Telefono buscar(int id) {

        return telefonos.get(id);

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.cedula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}'+"\nTelefonos: " + telefonos.toString();
    }
}
    

