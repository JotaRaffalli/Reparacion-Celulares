/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import java.io.Serializable;

/**
 * Nodo de la lista simple de la sucurusal
 * 
 * @author Ricardo
 */
public class SucursalNodoSimple implements Serializable {
    private String nombre;
    private int idPais;
    private int idSucursal;
    private String encargado;
    private TecnicoListaSimple tecnicos;
    private InformacionListaSimple informacion;
    private SucursalNodoSimple proximo;

    public SucursalNodoSimple(int idPais, int idSucursal, String nombre, String encargado) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.idSucursal = idSucursal;
        this.encargado = encargado;
        this.tecnicos = new TecnicoListaSimple(null);
        this.informacion = new InformacionListaSimple(null);
        proximo = null;
    }

    public InformacionListaSimple getInformacion() {
        return informacion;
    }

    public void setInformacion(InformacionListaSimple informacion) {
        this.informacion = informacion;
    }
    
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getEncargador() {
        return encargado;
    }

    public void setEncargador(String encargador) {
        this.encargado = encargador;
    }

    public SucursalNodoSimple getProximo() {
        return proximo;
    }

    public void setProximo(SucursalNodoSimple proximo) {
        this.proximo = proximo;
    }

    public TecnicoListaSimple getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(TecnicoListaSimple tecnicos) {
        this.tecnicos = tecnicos;
    }
}
