package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaService {

    Scanner leer = new Scanner(System.in);

    public Cadena ingrsarFrase() {
        Cadena frs = new Cadena();
        System.out.println("ingrese una frase");
        frs.setFrase(leer.nextLine());
        return frs;
    }

    public void mostrarVocales(Cadena frs) {
        int cont = 0;
        for (int i = 0; i < frs.getLongitud(); i++) {
            if (frs.getFrase().charAt(i) == 'a' || frs.getFrase().charAt(i) == 'e' || frs.getFrase().charAt(i) == 'i' || frs.getFrase().charAt(i) == 'o' || frs.getFrase().charAt(i) == 'u') {
                cont++;
            }
        }
        System.out.println("cantidad de vocales en la frase: " + cont);
    }

    public void invertirFrase(Cadena frs) {
        System.out.print("frase invertida: ");
        for (int i = frs.getLongitud() - 1; i >= 0; i--) {
            char inv = frs.getFrase().charAt(i);
            System.out.print(inv);
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena frs) {
        String letra;
        System.out.println("ingrese una letra");
        letra = leer.next();
        int cont = 0;
        for (int i = 0; i < frs.getLongitud(); i++) {
            if (frs.getFrase().charAt(i) == letra.charAt(0)) {
                cont++;
            }
        }
        System.out.println("veces que se repite " + letra + ": " + cont);
    }

    public void compararLongitud(Cadena frs) {
        String frase2;
        System.out.println("ingrese una frase para comparar la longitud de ambas (los espacios se cuentan como caracteres");
        frase2 = leer.nextLine();
        if (frs.getLongitud() == frase2.length()) {
            System.out.println("tienen la misma longitud");
        } else {
            System.out.println("no tienen la misma longitud");
        }
    }

    public void unirFrases(Cadena frs) {
        String frase2;
        System.out.println("ingrese una frase nueva para unir con la primera");
        frase2 = leer.nextLine();
        frs.setFrase(frs.getFrase()+frase2);
        System.out.println(frs.getFrase());
    }
    
    public void reemplazar(Cadena frs){
        String letra;
        System.out.println("ingrese un simbolo o caracter para intercambiar por todas las letras (a) de la frase");
        letra=leer.next();
        frs.setFrase(frs.getFrase().replaceAll("a", letra));
        System.out.println(frs.getFrase());
    }
    
    public boolean verifica(Cadena frs){
        String letra2;
        int cont=0;
        System.out.println("ingrese una letra");
        letra2=leer.next();
        
        for (int i = 0; i < frs.getLongitud(); i++) {
            if (frs.getFrase().charAt(i) == letra2.charAt(0)) {
                cont++;
            }
        }
        return cont>0;
    }
}
