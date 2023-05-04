package Main;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumeros_Service;

public class ParNum {

    public static void main(String[] args) {
        
        ParDeNumeros_Service num = new ParDeNumeros_Service();
        ParDeNumeros numeros = num.crea();
        num.mostrarValores(numeros);
        num.devolverMayor(numeros);
        num.calcularPotencia(numeros, 0, 0, 0);
        num.calculaRaiz(numeros, 0, 0, 0);
    }
}
