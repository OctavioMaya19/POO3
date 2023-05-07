package Entidad;

public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiaPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }
    

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiaPorSemana, String turno, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiaPorSemana = cantidadDiaPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiaPorSemana() {
        return cantidadDiaPorSemana;
    }

    public void setCantidadDiaPorSemana(int cantidadDiaPorSemana) {
        this.cantidadDiaPorSemana = cantidadDiaPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

}
