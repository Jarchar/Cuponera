/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author bruno
 */
public class Usuario {

    /**
     * @return the idusuario
     */
    public Integer getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return telefono;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.telefono = nombre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(Integer idusuario, String nombre, String email, String password) {
        this.idusuario = idusuario;
        this.telefono = nombre;
        this.email = email;
        this.password = password;
    }
    public Usuario(String nombre, String email, String password) {
        this.telefono = nombre;
        this.email = email;
        this.password = password;
    }
    private Integer idusuario;
    private String telefono;
    private String email;
    private String password;
    
}
