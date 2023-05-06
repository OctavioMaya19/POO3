package Main;

import Entidad.Persona;
import Servicio.PersonaService;

public class Persona_Main {

    public static void main(String[] args) {
        
        PersonaService persona = new PersonaService();
        Persona pers = persona.crearPersona();
        System.out.println(persona.edad(pers)+ " años");
        System.out.println("-----------------------------------------");
        if(persona.menosQue(pers)){
            System.out.println("la primera persona es mayor que la segunda");
        }else{
            System.out.println("la perimera persona es menor que la segunda");
        }
        System.out.println("-----------------------------------------");
        persona.mostrarPersona1(pers);
    }
}
