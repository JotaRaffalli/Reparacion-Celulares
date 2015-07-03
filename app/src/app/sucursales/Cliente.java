/*
 * 
 * Reparacion de celulares
 *
 * Creado por Ricardo Rodriguez <ricardo96r@gmail.com>
 */
package app.sucursales;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase cliente
 * 
 * @author Ricardo
 */
public class Cliente implements Serializable {
    private int idPais;
    private int idSucursal;
    private int idTecnico;
    private int idCliente;
    private String nombre;
    private String telefonoContacto;
    private int cedula;
    private boolean asignado;
    private String ingreso;
    private String entrega;
    private boolean entregado;
    private String problema;

    public Cliente(int idPais, int idSucursal, int idTecnico, int idCliente, String nombre, String telefonoContacto, int cedula, String problema, boolean asignado) {
        this.idPais = idPais;
        this.idSucursal = idSucursal;
        this.idTecnico = idTecnico;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefonoContacto = telefonoContacto;
        this.cedula = cedula;
        this.asignado = asignado;
        this.ingreso =  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        this.entrega = sumarDia(ingreso, 1);
        this.entregado = false;
        this.problema = problema;
    }

    public String sumarDia(String dia, int n) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(dia));
        } catch (ParseException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.add(Calendar.DATE, n);
        return sdf.format(c.getTime());
    }
    
    public String getProblema() {
        return problema;
    }
    
    public void setProblema(String problema) {
        this.problema = problema;
    }
    
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(int n) {
        this.entrega = sumarDia(ingreso, n);
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
    
    
}
