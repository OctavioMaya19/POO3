package Main;

import Entidad.Cadena;
import Servicio.CadenaService;

public class Cadena_Main {

    public static void main(String[] args) {

        CadenaService frase1 = new CadenaService();
        Cadena frs = frase1.ingrsarFrase();
        frase1.mostrarVocales(frs);
        frase1.invertirFrase(frs);
        frase1.vecesRepetido(frs);
        frase1.reemplazar(frs);
        if (frase1.verifica(frs)) {
            System.out.println("correcto,la letra se encuentra en la frase");
        }
    }
}
