/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.idao;

import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author Dennis Rivera
 */
public interface IUsuario {
    public void create(Usuario usuario);
    public Usuario read(int cedula);
    public void update(Usuario usuario);
    public void delete(Usuario usuario);   
    public List<Usuario> findAll();    
}
