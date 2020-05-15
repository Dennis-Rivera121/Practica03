/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Dennis Rivera
 */
public class Telefono {
    private int cedula;
    private String numero;
    private String tipo;
    private String operadora;
    
    public Telefono(){
        
    }

    public Telefono(int cedula, String numero, String tipo, String operadora) {
        this.cedula = cedula;
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
    }

    
   

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.cedula;
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
        final Telefono other = (Telefono) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefono{" + "cedula=" + cedula + ", numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora + '}';
    }
    
}
