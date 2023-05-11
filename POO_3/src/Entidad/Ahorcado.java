package Entidad;

public class Ahorcado {
    private char[] palabraBuscar;
    private int cantLetras = 0;
    private int jugadasMax;

    public Ahorcado(char[] palabraBuscar, int cantLetras, int jugadasMax) {
        this.palabraBuscar = palabraBuscar;
        this.cantLetras = cantLetras;
        this.jugadasMax = jugadasMax;
    }

    public Ahorcado() {
    }

    public char[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(char[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    
}
