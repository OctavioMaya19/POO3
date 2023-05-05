package Main;

import Servicio.ArregloService;

public class Arreglo_Main {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        ArregloService arreglo = new ArregloService();
        arreglo.inicializarA(arregloA);
        arreglo.mostrar(arregloA);
        arreglo.ordenar(arregloA);
        arreglo.inicializarB(arregloB, arregloA);
        arreglo.mostrar(arregloA);
        arreglo.mostrarB(arregloB);
    }
    
}
