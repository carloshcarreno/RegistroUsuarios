/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.registrousuarios.controlador;

import edu.upb.registrousuarios.modelo.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author CharliePC
 */
@Named(value = "usuarioController")
@SessionScoped
public class UsuarioController implements Serializable {

    private Usuario user;
    private List<Usuario> userList;
    
    /**
     * Creates a new instance of UsuarioController
     */
    public UsuarioController() {
        user = new Usuario();
        userList = new ArrayList<>();
    }
    
    public String registrar(){
        userList.add(this.user);
        this.user = new Usuario();
        return "list?faces-redirect=true";
    }
    
    public String vaciarLista(){
        userList.clear();
        return "list?faces-redirect=true";
    }
    
    public boolean isListEmpty(){
        return userList != null && userList.size()>0;
    }
    

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Usuario> getUserList() {
        return userList;
    }

    public void setUserList(List<Usuario> userList) {
        this.userList = userList;
    }
    
    
    
    
    
}
