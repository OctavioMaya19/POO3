package Servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner (System.in);
    
    public Date fechaNacimiento(){
        System.out.println("ingrese las fecha de nacimiento");
        System.out.print("dia: ");
        int dia = leer.nextInt();
        System.out.print("mes: ");
        int mes = leer.nextInt();
        System.out.print("año: ");
        int anio = leer.nextInt();
        
        return new Date(anio-1900, mes-1, dia);
    }
    
    public Date fechaActual(){
        Date fechaAct = new Date();
        return fechaAct;
    }
    
    public int diferencia(Date fecha, Date fechaAct){
        int anios = fechaAct.getYear()- fecha.getYear();
        if (fecha.getMonth() >= fechaAct.getMonth() && fecha.getDay()> fechaAct.getDay()) {
            anios--;
            anios--;
        }else if (fecha.getMonth() > fechaAct.getMonth()){
            anios--;
        }
        return anios;
    }
}
