package Servicio;

import Entidad.Mes;
import java.util.Scanner;

public class MesService {
    private Scanner leer = new Scanner(System.in).useDelimiter("/n");
    
    public Mes xxx(){
        Mes mess = new Mes();
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mess.setMeses(mes);
        mess.setMesSecreto(mes[9]);
        return mess;
    }
    
    public void adivinaMes(Mes mess){
        while(true){
            System.out.println("adivina el mes secreto");
            String mesAdivinar = leer.nextLine();

            if(mesAdivinar.equalsIgnoreCase(mess.getMesSecreto())){
                System.out.println("exelente, has adivinado el mes");
                break;
            }else{
                System.out.println("vuelve a intentarlo");
            }
        }
    }
}
