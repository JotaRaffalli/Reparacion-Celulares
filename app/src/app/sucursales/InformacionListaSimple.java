/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import java.io.Serializable;

/**
 * Lista simple de informacion de sucursal
 * @author Ricardo
 */
public class InformacionListaSimple implements Serializable {
      
    private InformacionNodoSimple cabeza;
    
    public InformacionListaSimple(InformacionNodoSimple cabeza) {
        this.cabeza = cabeza;
    }
    
    public boolean estaVacio() {
        return cabeza == null;
    }
    
    private String mostrarListaPorNombres() {
        InformacionNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getCliente().getNombre()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
    
    private String mostrarListaPorIds() {
        InformacionNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getCliente().getIdCliente()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
        
    private String mostrarListaPorIdTecnicos() {
        InformacionNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getCliente().getIdTecnico()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
    
    private String mostrarListaPorCedulas() {
        InformacionNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getCliente().getCedula()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
    
    private String mostrarListaPorContacto() {
        InformacionNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getCliente().getTelefonoContacto()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
    
    private String mostrarListaPorProblema() {
        InformacionNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getCliente().getProblema()+"/";
            aux = aux.getProximo();
        }
        return info;
    }
    
    private String mostrarListaPorIngreso() {
        InformacionNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getCliente().getIngreso()+"%";
            aux = aux.getProximo();
        }
        return info;
    }
        
    private String mostrarListaPorEntrega() {
        InformacionNodoSimple aux = cabeza;
        String info = "";
        while (aux != null) {
            info = info + aux.getCliente().getEntrega()+"%";
            aux = aux.getProximo();
        }
        return info;
    }
    
    private boolean[] mostrarListaPorAsignados() {
        boolean[] asignados = new boolean[contar()];
        InformacionNodoSimple aux = cabeza;
        int contador = 0;
        while (aux != null) {
            asignados[contador] = aux.getCliente().isAsignado();
            aux = aux.getProximo();
            contador++;
        }
        return asignados;
    }
        
    private boolean[] mostrarListaPorEntregados() {
        boolean[] entregados = new boolean[contar()];
        InformacionNodoSimple aux = cabeza;
        int contador = 0;
        while (aux != null) {
            entregados[contador] = aux.getCliente().isEntregado();
            aux = aux.getProximo();
            contador++;
        }
        return entregados;
    }
    
    public InformacionNodoSimple eliminaPrimero() {
        InformacionNodoSimple nodoEliminado = null;
        if (!estaVacio()) {
                nodoEliminado = cabeza;
                cabeza = cabeza.getProximo();
                nodoEliminado.setProximo(null);
            }
        return nodoEliminado;
    }
    
    public void insertaPrimero(InformacionNodoSimple nuevo) {
        if (estaVacio()) {
            cabeza = nuevo;
        } else {
            nuevo.setProximo(cabeza);
            cabeza = nuevo;
        }
    }

    public InformacionNodoSimple getCabeza() {
        return cabeza;
    }

    public void setCabeza(InformacionNodoSimple cabeza) {
        this.cabeza = cabeza;
    }
    
    public String[] getNombres() {
        return mostrarListaPorNombres().split("/");
    }
    
    public String[] getIdTecnicos() {
        return mostrarListaPorIdTecnicos().split("/");
    }
    
    public String[] getIds() {
        return mostrarListaPorIds().split("/");
    }
        
    public String[] getCedulas() {
        return mostrarListaPorCedulas().split("/");
    }
    
    public String[] getIngreso() {
        return mostrarListaPorIngreso().split("%");
    }
        
    public String[] getEntrega() {
        return mostrarListaPorEntrega().split("%");
    }
            
    public String[] getProblema() {
        return mostrarListaPorProblema().split("/");
    }
    
    public String[] getContacto() {
        return mostrarListaPorContacto().split("/");
    }
    
    public boolean[] getAsignado() {
        return mostrarListaPorAsignados();
    }
        
    public boolean[] getEntregado() {
        return mostrarListaPorEntregados();
    }
    
    public InformacionNodoSimple buscar(int idCliente) {
        InformacionNodoSimple aux = cabeza;
        if (!estaVacio()) {
            while(aux.getCliente().getIdCliente() != idCliente) {
                aux = aux.getProximo();
            }
        }
        return aux;
    }
    
    public void insertaFinal(InformacionNodoSimple nuevo) {
        if (estaVacio()) {
            cabeza = nuevo;
        } else {
            InformacionNodoSimple aux = cabeza;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nuevo);
        }
    }
    
    public int contar() {
        InformacionNodoSimple aux = cabeza;
        int contador = 0;
        while(aux != null) {
            contador++;
            aux = aux.getProximo();
        }
        return contador;
    }
}
