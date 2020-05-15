/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.controlador;

import Modelo.Telefono;
import Modelo.Usuario;
import Modelo.idao.ITelefono;
import Modelo.idao.IUsuario;
import Modelo.vista.VistaTelefono;
import Modelo.vista.VistaUsuario;
import java.util.List;

/**
 *
 * @author Dennis Rivera
 */
public class ControladorUsuario {
    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;
    private Usuario usuario;
    private Telefono telefono;
    private IUsuario usuarioDAO;
    private ITelefono telefonoDAO;

    public ControladorUsuario(VistaUsuario vistaUsuario, VistaTelefono vistaTelefono, IUsuario usuarioDAO, ITelefono telefonoDAO) {
        this.vistaUsuario = vistaUsuario;
        this.vistaTelefono = vistaTelefono;
        this.usuarioDAO = usuarioDAO;
        this.telefonoDAO = telefonoDAO;
    }
    
    public void registrar() {
        usuario = vistaUsuario.ingresarUsuario();
        usuarioDAO.create(usuario);
    }

    
    public void verUsuario() {
        int cedula= vistaUsuario.buscarUsuario();
        usuario = usuarioDAO.read(cedula);
        vistaUsuario.verUsuario(usuario);
    }

    
    public void actualizar() {
        usuario = vistaUsuario.actualizarUsuario();
        usuarioDAO.update(usuario);
    }

    
    public void eliminar() {
        usuario= vistaUsuario.eliminarUsuario();
        usuarioDAO.delete(usuario);
    }

    
    public void verUsuarios() {
        List<Usuario> usuarios;
        usuarios = usuarioDAO.findAll();
       vistaUsuario.verUsuarios(usuarios);
    }
    public void agregarTelefono(){
         int cedula = vistaTelefono.buscarTelefono();
        telefono = telefonoDAO.read(cedula);
        usuario.agregarTelefono(telefono);
        usuarioDAO.update(usuario);        
    }
    
}
