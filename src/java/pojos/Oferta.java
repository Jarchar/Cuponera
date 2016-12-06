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
public class Oferta {

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the idciudad
     */
    public Integer getIdciudad() {
        return idciudad;
    }

    /**
     * @param idciudad the idciudad to set
     */
    public void setIdciudad(Integer idciudad) {
        this.idciudad = idciudad;
    }

    /**
     * @return the idcategoria
     */
    public Integer getIdcategoria() {
        return idcategoria;
    }

    /**
     * @param idcategoria the idcategoria to set
     */
    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Oferta(String descripcion,Double precio, String nombre, Integer idciudad, Integer idcategoria) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio=precio;
        this.idciudad = idciudad;
        this.idcategoria = idcategoria;
    }
    public Oferta(){}
    
    private Integer idOferta;
    private String descripcion;
    private String nombre;
    private Double precio;
    private Integer idciudad;
    private Integer idcategoria;



}
