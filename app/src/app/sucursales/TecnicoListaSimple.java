/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import java.io.Serializable;

/**
 * Lista simple de tecnicos
 * @author Ricardo
 */
public class TecnicoListaSimple implements Serializable {    
    private TecnicoNodoSimple cabeza;

    public TecnicoListaSimple(TecnicoNodoSimple cabeza) {
        this.cabeza = cabeza;
    }
    
    public boolean estaVacio() {
        return cabeza == null;
    }
    
    public TecnicoNodoSimple buscar(int idTecnico) {
        TecnicoNodoSimple aux = cabeza;
        if (!estaVacio()) {
            while(aux.getTecnico().getIdTecnico() != idTecnico) {
                aux = aux.getProximo();
            }
        }
        return aux;
    }
    
    public void insertaFinal(TecnicoNodoSimple nuevo) {
        if (estaVacio()) {
            cabeza = nuevo;
        } else {
            TecnicoNodoSimple aux = cabeza;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nuevo);
        }
    }
    
    private String mostrarListaPorNombres() {
        TecnicoNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getTecnico().getNombre()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
    
    private String mostrarListaPorIds() {
        TecnicoNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getTecnico().getIdTecnico()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
        
    private String mostrarListaPorTipo() {
        TecnicoNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getTecnico().getTipo()+"/";
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
        
    public String[] getTipos() {
        return mostrarListaPorTipo().split("/");
    }
    
    public int contar() {
        TecnicoNodoSimple aux = cabeza;
        int contador = 0;
        while(aux != null) {
            contador++;
            aux = aux.getProximo();
        }
        return contador;
    }
}
