/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import java.io.Serializable;

/**
 * Nodo Simple de la Lista Simple de tecnicos
 * @author Ricardo
 */
public class TecnicoNodoSimple implements Serializable {
    private Tecnico tecnico;
    private ClientesListaSimple asignados;
    private ClientesCola cola;
    private TecnicoNodoSimple proximo;

    public TecnicoNodoSimple(Tecnico tecnico) {
        this.tecnico = tecnico;
        this.asignados = new ClientesListaSimple(null);
        this.cola = new ClientesCola(null);
        this.proximo = null;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public ClientesListaSimple getAsignados() {
        return asignados;
    }

    public void setAsignados(ClientesListaSimple asignados) {
        this.asignados = asignados;
    }

    public ClientesCola getCola() {
        return cola;
    }

    public void setCola(ClientesCola cola) {
        this.cola = cola;
    }

    public TecnicoNodoSimple getProximo() {
        return proximo;
    }

    public void setProximo(TecnicoNodoSimple proximo) {
        this.proximo = proximo;
    }
    
    
}
