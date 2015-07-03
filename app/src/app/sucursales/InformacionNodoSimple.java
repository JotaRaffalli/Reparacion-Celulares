/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import java.io.Serializable;

/**
 * Nodo simple de informacion de sucursal
 * 
 * @author Ricardo
 */
public class InformacionNodoSimple implements Serializable {
    private Cliente cliente;
    private InformacionNodoSimple proximo;

    public InformacionNodoSimple(Cliente cliente) {
        this.cliente = cliente;
        this.proximo = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public InformacionNodoSimple getProximo() {
        return proximo;
    }

    public void setProximo(InformacionNodoSimple proximo) {
        this.proximo = proximo;
    }
}
