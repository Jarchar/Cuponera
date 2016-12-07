/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.util.Date;

/**
 *
 * @author bruno
 */
public class Cupon {

    /**
     * @return the idCupon
     */
    public Integer getIdCupon() {
        return idCupon;
    }

    /**
     * @param idCupon the idCupon to set
     */
    public void setIdCupon(Integer idCupon) {
        this.idCupon = idCupon;
    }

    /**
     * @return the idOferta
     */
    public Integer getIdOferta() {
        return idOferta;
    }

    /**
     * @param idOferta the idOferta to set
     */
    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Cupon(Integer idOferta, Date fecha, Integer idUsuario) {
        this.idOferta = idOferta;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
    }

    public Cupon(Integer idCupon, Integer idOferta, Date fecha, Integer idUsuario) {
        this.idCupon = idCupon;
        this.idOferta = idOferta;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
    }
    private Integer idCupon;
    private Integer idOferta;
    private Date fecha;
    private Integer idUsuario;
    
}
