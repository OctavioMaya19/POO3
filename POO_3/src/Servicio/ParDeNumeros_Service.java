package Servicio;

import Entidad.ParDeNumeros;

public class ParDeNumeros_Service {

    public ParDeNumeros crea() {
        ParDeNumeros numeros = new ParDeNumeros();
        numeros.setNum1(Math.random());
        numeros.setNum2(Math.random());
        return numeros;
    }

    public void mostrarValores(ParDeNumeros numeros) {
        System.out.println("primer numero: " + numeros.getNum1());
        System.out.println("segundo numero: " + numeros.getNum2());
    }

    public void devolverMayor(ParDeNumeros numeros) {
        if (numeros.getNum1() > numeros.getNum2()) {
            System.out.println("el numero " + numeros.getNum1() + " es el mayor");
        } else {
            System.out.println("el numero " + numeros.getNum2() + " es el mayor");
        }
    }

    public void calcularPotencia(ParDeNumeros numeros, double redond1, double redond2, double numR) {
        redond1 = Math.round(numeros.getNum1());
        redond2 = Math.round(numeros.getNum2());
        if (redond1 > redond2) {
            numR = Math.pow(redond1, redond2);
            System.out.println(redond1 + " elevado a " + redond2 + "= " + numR);
        } else {
            numR = Math.pow(redond2, redond1);
            System.out.println(redond2 + " elevado a " + redond1 + "= " + numR);
        }
    }

    public void calculaRaiz(ParDeNumeros numeros, double raiz, double abs1, double abs2) {
        abs1 = Math.abs(numeros.getNum1());
        abs2 = Math.abs(numeros.getNum2());
        if (abs1 < abs2) {
            raiz = Math.sqrt(abs1);
            System.out.println("la raiz cuadrada de " + abs1 + " es: " + raiz);
        } else {
            raiz = Math.sqrt(abs2);
            System.out.println("la raiz cuadrada de " + abs2 + " es: " + raiz);
        }
    }
}
