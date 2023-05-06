package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    private Scanner leer = new Scanner (System.in);
    
    public Persona crearPersona(){
        Persona pers = new Persona();
        
        System.out.println("ingrese el nombre de la persona");
        pers.setNombre(leer.nextLine());
        System.out.println("ingrese la fecha de nacimiento");
        System.out.print("dia: ");
        int dia = leer.nextInt();
        System.out.print("mes: ");
        int mes = leer.nextInt();
        System.out.print("año: ");
        int anio = leer.nextInt();
        pers.setFechaN(new Date(anio-1900, mes-1, dia));
        
        return pers;
    }
    
    public int edad(Persona pers){
        pers.setFechaA(new Date());
        
        int anios = pers.getFechaA().getYear() - pers.getFechaN().getYear();
        if (pers.getFechaN().getMonth() >= pers.getFechaA().getMonth() && pers.getFechaN().getDay()> pers.getFechaA().getDay()) {
            anios--;
        }else if (pers.getFechaN().getMonth() > pers.getFechaA().getMonth()){
            anios--;
        }
        return anios;
    }
    
    public boolean menosQue(Persona pers){
        System.out.println("ingrese el nombre de la nueva persona");
        String nombre2 = leer.nextLine();
        System.out.println("ingrese la fecha de nacimiento");
        System.out.print("dia: ");
        int dia = leer.nextInt();
        System.out.print("mes: ");
        int mes = leer.nextInt();
        System.out.print("año: ");
        int anio = leer.nextInt();
        Date fechaN2 = new Date(anio-1900, mes-1, dia);
        int anios2 = fechaN2.getYear() - pers.getFechaA().getYear();
        
        return this.edad(pers) > anios2;
    }
    
    public void mostrarPersona1(Persona pers){
        System.out.println("perimera persona ingresada");
        System.out.println("nombre: " +pers.getNombre());
        System.out.println("fecha de nacimiento: " +pers.getFechaN());
        System.out.println("años: " +this.edad(pers));
    }
}
