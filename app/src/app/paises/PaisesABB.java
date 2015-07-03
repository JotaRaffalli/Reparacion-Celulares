/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.paises;

import java.io.Serializable;

/**
 * Arbol de paises
 * 
 * @author Ricardo
 */
public class PaisesABB implements Serializable {
    private PaisNodoABB raiz;
    
    public PaisesABB(PaisNodoABB raiz) {
        this.raiz = raiz;
    }
    
    public boolean insertar(PaisNodoABB aux, PaisNodoABB nuevo) {
        boolean error = true;
        if (estaVacio()) {
            raiz = nuevo;
        } else if(nuevo.getIdpais() < aux.getIdpais()) {
            if(aux.getHijoIzquierdo() == null) {
                aux.setHijoIzquierdo(nuevo);
            } else {
                insertar(aux.getHijoIzquierdo(), nuevo);
            }
        } else if(nuevo.getIdpais() > aux.getIdpais()){
            if(aux.getHijoDerecho() == null) {
                aux.setHijoDerecho(nuevo);
            } else {
                insertar(aux.getHijoDerecho(), nuevo);
            }
        } else {
            error = false;
        }
        return error;
    }
    
    public PaisNodoABB buscar(PaisNodoABB aux, int id) {
    while(aux != null) {
        if (aux.getIdpais() == id) {
            return aux;
        } else if(id < aux.getIdpais()){
            aux = aux.getHijoIzquierdo();
        } else {
            aux = aux.getHijoDerecho();
        }
    }
    return null;
    }
    
    private String mostrarNombresEnOrdenPaises(PaisNodoABB aux) {
        return (aux!=null) ? (mostrarNombresEnOrdenPaises(aux.getHijoIzquierdo()) +aux.getPais() + "/" + mostrarNombresEnOrdenPaises(aux.getHijoDerecho())) : "";
    }
    
    private String mostrarEliminadosEnOrdenPaises(PaisNodoABB aux) {
        return (aux!=null) ? (mostrarEliminadosEnOrdenPaises(aux.getHijoIzquierdo()) +aux.isEliminado() + "/" + mostrarEliminadosEnOrdenPaises(aux.getHijoDerecho())) : "";
    }
    
    private String mostrarIdEnOrdenPaises(PaisNodoABB aux) {
        return (aux!=null) ? (mostrarIdEnOrdenPaises(aux.getHijoIzquierdo()) +aux.getIdpais() + "/" + mostrarIdEnOrdenPaises(aux.getHijoDerecho())) : "";
    }
    
    public String[] getNombrePaisesEnOrden(PaisNodoABB aux) {
        return mostrarNombresEnOrdenPaises(aux).split("/");
    }
    
    public String[] getIdPaisesEnOrden(PaisNodoABB aux) {
        return mostrarIdEnOrdenPaises(aux).split("/");
    }
    
    public String[] getEliminadosPaisesEnOrden(PaisNodoABB aux) {
        return mostrarEliminadosEnOrdenPaises(aux).split("/");
    }
    
    public int contarNodos(PaisNodoABB aux) {
        if (aux == null) {
            return 0;
        } else {
            return 1 + contarNodos(aux.getHijoIzquierdo()) + contarNodos(aux.getHijoDerecho());
        }
    }
    
    public int contarHojas(PaisNodoABB aux) {
        if (aux != null) {
            return 0;
        } else {
            return 1 + contarNodos(aux.getHijoIzquierdo()) + contarNodos(aux.getHijoDerecho());
        }
    }
    
    public boolean estaVacio() {
        return raiz == null;
    }
}
