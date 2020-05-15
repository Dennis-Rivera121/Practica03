/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import Modelo.controlador.ControladorTelefono;
import Modelo.controlador.ControladorUsuario;
import Modelo.dao.TelefonoDAO;
import Modelo.dao.UsuarioDAO;
import Modelo.vista.VistaTelefono;
import Modelo.vista.VistaUsuario;

/**
 *
 * @author Dennis Rivera
 */
public class Inicio {

    public static void main(String[] args) {

        VistaUsuario vistaU = new VistaUsuario();
        VistaTelefono vistaT = new VistaTelefono();

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        TelefonoDAO telefonoDAO = new TelefonoDAO();

        ControladorUsuario controladorUsuario = new ControladorUsuario(vistaU, vistaT, usuarioDAO, telefonoDAO);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaT, telefonoDAO);

        controladorUsuario.registrar();
        controladorUsuario.registrar();

        controladorTelefono.registrar();
        controladorTelefono.registrar();

        controladorUsuario.verUsuarios();
        controladorTelefono.verTelefonos();

        controladorUsuario.actualizar();
        controladorTelefono.actualizar();

        controladorUsuario.verUsuarios();
        controladorTelefono.verTelefonos();

        controladorUsuario.eliminar();
        controladorTelefono.eliminar();

        controladorUsuario.verUsuarios();
        controladorTelefono.verTelefonos();

        controladorUsuario.agregarTelefono();

        controladorUsuario.verUsuarios();
        controladorTelefono.verTelefonos();
    }
}
