package Entidad;

import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaN;
    private Date fechaA;

    public Persona() {
    }

    public Persona(String nombre, Date fechaN, Date fechaA) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaA = fechaA;
    }

    public Date getFechaA() {
        return fechaA;
    }

    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }
}
