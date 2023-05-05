package Servicio;

import static java.lang.Math.random;
import java.util.Arrays;

public class ArregloService {

    public void inicializarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (int) (Math.random() * 101);
        }
    }

    public void mostrar(double[] arregloA) {
        System.out.println("arreglo A: " +Arrays.toString(arregloA));
    }

    public void ordenar(double[] arregloA) {
        Arrays.sort(arregloA);
        System.out.println("arreglo A ordenado de menor a mayor: " +Arrays.toString(arregloA));
    }

    public void inicializarB(double[] arregloB, double[] arregloA) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        
        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        }
    }
    
    public void mostrarB(double[] arregloB) {
        System.out.println("arreglo B: " +Arrays.toString(arregloB));
    }
}
