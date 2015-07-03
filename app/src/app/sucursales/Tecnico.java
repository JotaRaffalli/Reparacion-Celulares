/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import java.io.Serializable;

/**
 * Clase tecnico
 * 
 * @author Ricardo
 */
public class Tecnico implements Serializable {
    private int idPais;
    private int idSucursal;
    private int idTecnico;
    private int idTipo;
    private String nombre;
    private String tipo;

    public Tecnico(int idPais, int idSucursal, int idTecnico, int idTipo, String nombre, String tipo) {
        this.idPais = idPais;
        this.idSucursal = idSucursal;
        this.idTecnico = idTecnico;
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
