package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("n/");

    public void crearJuego() {
        Ahorcado juego = new Ahorcado();
        System.out.println("ingrese una palabra para comenzar el juego");
        String palabra = leer.nextLine();
        char[] letras = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }
        juego.setPalabraBuscar(letras);

        System.out.println("ingrese la cantidad de jugadas maxima");
        juego.setJugadasMax(3);
        boolean palabraEncontrada;
        boolean finIntentos;
       
        do {
            System.out.println("ingrese una letra");
            char letra = leer.nextLine().charAt(0);
            encontradas(letra, juego);
            finIntentos = juego.getJugadasMax() > 0;
            palabraEncontrada = juego.getCantLetras() == juego.getPalabraBuscar().length;
            if (palabraEncontrada) {
                System.out.println("felicidades, has ganado!!!");
            } else if (!finIntentos) {
                System.out.println("has perdido :(");
            }

        } while (true);
    }

    public int longitud(Ahorcado juego) {
        return juego.getPalabraBuscar().length;
    }

    public boolean buscar(char letra, Ahorcado juego) {
        boolean letraEncontrada = false;
        char[] palabra = juego.getPalabraBuscar();
        for (int i = 0; i < juego.getPalabraBuscar().length; i++) {
            if (letra == palabra[i]) {
                letraEncontrada = true;
                break;
            }
        }
        if (letraEncontrada) {
            System.out.println("la letra pertenece a la palabra");
        } else {
            System.out.println("la letra NO pertenece a la palabra");
        }
        return letraEncontrada;
    }

    public boolean encontradas(char letra, Ahorcado juego) {
        boolean letraEncontrada = buscar(letra, juego);
        char[] palabra = juego.getPalabraBuscar();
        if (letraEncontrada) {
            for (int i = 0; i < juego.getPalabraBuscar().length; i++) {
                if (letra == palabra[i]) {
                    juego.setCantLetras(juego.getCantLetras() + 1);
                    break;
                }
            }
        } else {
            juego.setJugadasMax(juego.getJugadasMax() - 1);
        }
        int faltan = palabra.length - juego.getCantLetras();
        System.out.println("falta encontrar " + faltan + " letras");
        return letraEncontrada;
    }

    public void intentos(Ahorcado juego) {
        System.out.println("te quedan " + juego.getJugadasMax() + " oportunidades");
    }

    public void juego() {
        crearJuego();
    }

}
