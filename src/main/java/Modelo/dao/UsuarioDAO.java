/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;

import Modelo.Usuario;
import Modelo.idao.IUsuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dennis Rivera
 */
public class UsuarioDAO implements IUsuario{

    private List<Usuario> listaUsuario;

    public UsuarioDAO() {
        listaUsuario = new ArrayList<>();

    }

    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    @Override
    public Usuario read(int cedula) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getCedula() == cedula) {
                return usuario;
            }
        }
        return null;

    }

    @Override
    public void update(Usuario usuario) {
       for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario c = listaUsuario.get(i);
            if (c.getCedula() == usuario.getCedula()) {
                listaUsuario.set(i, usuario);
                break;
            }
        }
    }

    @Override
    public void delete(Usuario usuario) {
        Iterator<Usuario> it = listaUsuario.iterator();
        while (it.hasNext()) {
            Usuario c = it.next();
            if (c.getCedula()== usuario.getCedula()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Usuario> findAll() {
         return listaUsuario;
    }

}
