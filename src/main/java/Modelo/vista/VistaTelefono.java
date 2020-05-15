/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.vista;

import Modelo.Telefono;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dennis Rivera
 */
public class VistaTelefono {

    private Scanner entrada;

    public VistaTelefono() {
        entrada = new Scanner(System.in);
    }

    public Telefono ingresarTelefono() {
        entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el codigo");
        int codigo = entrada.nextInt();
        System.out.println("Ingresa el numero");
        String numero = entrada.next();
        System.out.println("Ingresa el tipo");
        String tipo = entrada.next();
        System.out.println("Ingresa la operadora");
        String operadora = entrada.next();
        return new Telefono(codigo, numero, operadora, tipo);
    }

    public Telefono actualizarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo cual quiere actualizar");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese los nuevos datos");
        System.out.println("Ingrese el nuevo numero");
        String numero = entrada.next();
        System.out.println("Ingresa el nuevo tipo");
        String tipo = entrada.next();
        System.out.println("Ingresa la nueva operadora");
        String operadora = entrada.next();
        return new Telefono(codigo, numero, tipo, operadora);
    }

    public Telefono eliminarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo cual desea elimar");
        int codigo = entrada.nextInt();
        return new Telefono(codigo, null, null, null);
    }

    public int buscarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del cual busca ");
        int codigo = entrada.nextInt();
        return codigo;
    }

    public void verTelefono(Telefono telefono) {
        System.out.println("Datos del Usuario: " + telefono);
    }

    public void verTelefonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("Datos del telefono: " + telefono);

        }

    }
}
