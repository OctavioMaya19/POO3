package Main;

import Entidad.Ahorcado;
import Servicio.AhorcadoService;
import java.util.Scanner;

public class AhorcadoMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AhorcadoService juego1 = new AhorcadoService();
        char salida = 'a';

        do {
            int opcion;
            System.out.println("1_ empezar juego");
            System.out.println("2_salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    juego1.juego();
                case 2:
                    System.out.println("seguro de que deseas salir (s para confirmar)");
                    break;
                default:
                    System.out.println("no se reconoce la opcion ingresada");
            }
            System.out.println("has salido");
        } while (salida != 's');
    }
}
