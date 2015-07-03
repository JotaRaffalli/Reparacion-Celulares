/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import java.io.Serializable;

/**
 * Lista Simple de sucursales
 * 
 * @author Ricardo
 */
public class SucursalListaSimple  implements Serializable {
    private SucursalNodoSimple cabeza;
    
    public SucursalListaSimple(SucursalNodoSimple cabeza) {
        this.cabeza = cabeza;
    }
    
    public boolean estaVacio() {
        return cabeza == null;
    }
    
    private String mostrarListaPorNombres() {
        SucursalNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getNombre()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
    
    private String mostrarListaPorIds() {
        SucursalNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getIdSucursal()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
        
    private String mostrarListaPorEncargados() {
        SucursalNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getEncargado()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
    
    public String[] getNombres() {
        return mostrarListaPorNombres().split("/");
    }
    
    public String[] getIds() {
        return mostrarListaPorIds().split("/");
    }
        
    public String[] getEncargados() {
        return mostrarListaPorEncargados().split("/");
    }
    
    public SucursalNodoSimple buscar(int idSucursal) {
        SucursalNodoSimple aux = cabeza;
        if (!estaVacio()) {
            while(aux.getIdSucursal() != idSucursal) {
                aux = aux.getProximo();
            }
        }
        return aux;
    }
    
    public void insertaFinal(SucursalNodoSimple nuevo) {
        if (estaVacio()) {
            cabeza = nuevo;
        } else {
            SucursalNodoSimple aux = cabeza;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nuevo);
        }
    }
    
    public int contar() {
        SucursalNodoSimple aux = cabeza;
        int contador = 0;
        while(aux != null) {
            contador++;
            aux = aux.getProximo();
        }
        return contador;
    }
}
