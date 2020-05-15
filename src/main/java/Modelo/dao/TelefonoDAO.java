/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;

import Modelo.Telefono;
import Modelo.idao.ITelefono;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dennis Rivera
 */
public class TelefonoDAO implements ITelefono{
    private List<Telefono> listaTelefono;

    public TelefonoDAO() {
        listaTelefono = new ArrayList<>();
    }
    

    @Override
    public void create(Telefono telefono) {
        listaTelefono.add(telefono);
    }

    @Override
    public Telefono read(int cedula) {
         for (Telefono telefono : listaTelefono) {
            if (telefono.getCedula() == cedula) {
                return telefono;
            }
        }
        return null;
    }

    @Override
    public void update(Telefono telefono) {
         for (int i = 0; i < listaTelefono.size(); i++) {
           Telefono c = listaTelefono.get(i);
            if (c.getCedula() == telefono.getCedula()) {
                listaTelefono.set(i,telefono);
                break;
            }
        }
    }

    @Override
    public void delete(Telefono telefono) {
        Iterator<Telefono> it = listaTelefono.iterator();
        while (it.hasNext()) {
            Telefono d = it.next();
            if (d.getCedula() == telefono.getCedula()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Telefono> findAll() {
       return listaTelefono;
    }
    
}