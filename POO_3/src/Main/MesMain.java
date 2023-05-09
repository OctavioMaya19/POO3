package Main;

import Entidad.Mes;
import Servicio.MesService;

public class MesMain {
    
    public static void main(String[] args) {
        MesService mesJuego = new MesService();
        Mes mess = mesJuego.xxx();
        mesJuego.adivinaMes(mess); 
        
    }
    
}
