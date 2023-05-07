package Main;

import Entidad.Curso;
import Servicio.CursoService;

public class CursoMain {

    public static void main(String[] args) {
        
        CursoService cursos = new CursoService();
        Curso curso = cursos.crearCurso();
        cursos.calcularGananciaSemanal(curso);
        
    }
}
