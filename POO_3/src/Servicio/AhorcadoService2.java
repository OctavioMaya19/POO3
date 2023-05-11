package Servicio;

import Entidad.Ahorcado2;
import java.util.Scanner;

public class AhorcadoService2 {
    Scanner leer = new Scanner(System.in).useDelimiter("n/");
    
    public void creaJuego(){
        Ahorcado2 ahorcado = new Ahorcado2();
        
        
        System.out.println("ingrese la palabra a buscar");
        String palabra = leer.nextLine();
        char[] letras = new char[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }
        ahorcado.setPalabraBuscar(letras);
        
        jugadasMax(ahorcado);
        System.out.println("longitud de la palabra: " +longitud(ahorcado));
        do{
            System.out.println("ingrese una letra");
            char letra = leer.nextLine().charAt(0);
            
            if (buscar(letra, ahorcado)){
                System.out.println("la letra se encuentra en la palabra");
            }else{
                System.out.println("la letra NO se encuentra en la palabra");
            }
            encontradas(letra, ahorcado);
            intentos(letra, ahorcado);
            
            boolean finalJuego = ahorcado.getJugadasMax() > 0;
            boolean juegoGanado = ahorcado.getLetrasEncontradas() == ahorcado.getPalabraBuscar().length;
            
            if (juegoGanado) {
                System.out.println("felicidades, has ganado!!!");
                break;
            }else if (!finalJuego){
                System.out.println("has perdido :(");
                break;
            }
            
        }while(true);
    }
    
    public void jugadasMax(Ahorcado2 ahorcado){
        System.out.println("tenes 5 intentos");
        ahorcado.setJugadasMax(5);
    }
    
    public int longitud(Ahorcado2 ahorcado){
        return ahorcado.getPalabraBuscar().length;
    }
    
    public boolean buscar(char letra, Ahorcado2 ahorcado){
        boolean letraEncontrada = false;
        char[] palabra = ahorcado.getPalabraBuscar();
        for (int i = 0; i < ahorcado.getPalabraBuscar().length; i++) {
            if (letra == palabra[i]){
                letraEncontrada = true;
            }
        }
        return letraEncontrada;
    }
    
    public boolean encontradas(char letra, Ahorcado2 ahorcado){
        boolean letraEncontrada = buscar(letra, ahorcado);
        
        if (letraEncontrada){
            ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas()+1);
        }
        int faltan = ahorcado.getPalabraBuscar().length - ahorcado.getLetrasEncontradas();
        System.out.println("letras (encontradas,faltentes): (" +ahorcado.getLetrasEncontradas()+ ", " +faltan+ ")");
        
        return letraEncontrada;
    }
    
    public void intentos(char letra, Ahorcado2 ahorcado){
        boolean letraEncontrada = buscar(letra, ahorcado);
        if (letraEncontrada){
            ahorcado.setJugadasMax(ahorcado.getJugadasMax());
        }else{
            ahorcado.setJugadasMax(ahorcado.getJugadasMax()-1);
        }
        System.out.println("intentos restantes: " +ahorcado.getJugadasMax());
    }
    
    public void juego(){
        creaJuego();
    }
}
