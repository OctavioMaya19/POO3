package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class CursoService {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Curso crearCurso(){
        Curso curso = new Curso();
        
        curso.setAlumnos(cargarAlumnos(curso.getAlumnos().length));
        
        System.out.println("ingrese el nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("ingrese la cantidad de horas cursadas por dia");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("ingrese la cantidad de dias que cursa por semana");
        curso.setCantidadDiaPorSemana(leer.nextInt());
        System.out.println("ingrese a que turno asiste (tarde/noche)");
        curso.setTurno(leer.next());
        System.out.println("ingrese el valor por hora del curso");
        System.out.print("$");
        curso.setPrecioPorHora(leer.nextInt());
        
        return curso;
    }
    
    public String[] cargarAlumnos(int longVec){
       
        String[] alumnos = new String[longVec];
        
        for (int i=0; i<alumnos.length; i++) {
            System.out.println("ingrese el nombre del alumno " +(i+1));
            alumnos[i]=leer.next();
        }
        return alumnos;
    }
    
    public void calcularGananciaSemanal(Curso curso){
        System.out.println("costo del curso $" +curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*curso.getAlumnos().length*curso.getCantidadDiaPorSemana());
    }
}
