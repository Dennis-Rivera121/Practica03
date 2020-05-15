/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.idao;

import Modelo.Telefono;
import java.util.List;

/**
 *
 * @author Dennis Rivera
 */
public interface ITelefono {
    public void create(Telefono telefono);
    public Telefono read(int cedula);
    public void update(Telefono telefono);
    public void delete(Telefono telefono);   
    public List<Telefono> findAll();
}