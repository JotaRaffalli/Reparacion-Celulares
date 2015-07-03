/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.paises;

import app.sucursales.SucursalListaSimple;
import java.io.Serializable;

/**
 * Nodo del arbol de paises
 * 
 * @author Ricardo
 */
public class PaisNodoABB implements Serializable {
    private int idpais;
    private String pais;
    private boolean eliminado;
    private SucursalListaSimple sucursales;
    private PaisNodoABB hijoIzquierdo;
    private PaisNodoABB hijoDerecho;

    public PaisNodoABB(int idpais, String pais, SucursalListaSimple sucursales) {
        this.idpais = idpais;
        this.pais = pais;
        this.sucursales = sucursales;
        this.eliminado = false;
        hijoIzquierdo = null;
        hijoDerecho = null;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public SucursalListaSimple getSucursales() {
        return sucursales;
    }

    public void setSucursales(SucursalListaSimple sucursales) {
        this.sucursales = sucursales;
    }

    public PaisNodoABB getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(PaisNodoABB hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public PaisNodoABB getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(PaisNodoABB hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    public boolean esHoja() {
        return hijoIzquierdo == null && hijoDerecho == null;
    }
}
