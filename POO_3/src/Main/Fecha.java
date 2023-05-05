package Main;

import Servicio.FechaService;
import java.util.Date;

public class Fecha {

    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        
        Date fechaN = fecha.fechaNacimiento();
        System.out.println("fecha actual: " +fecha.fechaActual());
        Date fechaAct = fecha.fechaActual();
        System.out.println("años de la persona: " +fecha.diferencia(fechaN, fechaAct));
    }
}
