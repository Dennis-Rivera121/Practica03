/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.vista;

import Modelo.Usuario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaUsuario {

    private Scanner entrada;

    public VistaUsuario() {
        entrada = new Scanner(System.in);
    }

    public Usuario ingresarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos del usuario");
        System.out.println("Ingresa el numero de cedula");
        int cedula = entrada.nextInt();
        System.out.println("Ingrese el nombre del usuario");
        String nombre = entrada.next();
        System.out.println("Ingresa el numero de apellido del usuario");
        String apellido = entrada.next();
        System.out.println("Ingresa el correo");
        String correo = entrada.next();
        System.out.println("Ingresa la contraseÃ±a del usuario");
        String contraseña = entrada.next();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }

    public Usuario actualizarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa la cedula cual quiere  actualizar");
        int cedula = entrada.nextInt();
        System.out.println("Ingrese los nuevos datos");
        System.out.println("Ingresa el nuevo nombre");
        String nombre = entrada.next();
        System.out.println("Ingresa el nuevo apellido");
        String apellido = entrada.next();
        System.out.println("Ingresa el nuevo correo");
        String correo = entrada.next();
        System.out.println("Ingresa el la nueva contraseña");
        String contraseña = entrada.next();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }

    public Usuario eliminarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa la cedula cual desea eliminar");
        int cedula = entrada.nextInt();
        return new Usuario(cedula, null, null, null, null);
    }

    public int buscarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa la cedula cual busca ");
        int cedula = entrada.nextInt();
        return cedula;
    }

    public void verUsuario(Usuario usuario) {
        System.out.println("Datos del Usuario: " + usuario);
    }

    public void verUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("Datos del telefono: " + usuario);

        }

    }

}
