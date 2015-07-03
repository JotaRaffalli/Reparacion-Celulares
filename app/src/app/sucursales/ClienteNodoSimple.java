/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import java.io.Serializable;

/**
 * Nodo de la lista o cola de clientes
 * 
 * @author Ricardo
 */
public class ClienteNodoSimple implements Serializable {
    private Cliente cliente;
    private ClienteNodoSimple proximo;

    public ClienteNodoSimple(Cliente cliente) {
        this.cliente = cliente;
        this.proximo = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteNodoSimple getProximo() {
        return proximo;
    }

    public void setProximo(ClienteNodoSimple proximo) {
        this.proximo = proximo;
    }
}
