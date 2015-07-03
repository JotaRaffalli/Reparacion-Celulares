/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import java.io.Serializable;

/**
 * Cola de clientes
 * 
 * @author Ricardo
 */
public class ClientesCola extends ClientesListaSimple implements Serializable {
    
    public ClientesCola(ClienteNodoSimple cabeza) {
        super(cabeza);
    }
    
    public void encolar(ClienteNodoSimple nuevo) {
        insertaFinal(nuevo);
    }
    
    public ClienteNodoSimple desencolar() {
        return eliminaPrimero();
    }
    
    public ClienteNodoSimple primeroCola() {
        return getCabeza();
    }
}
