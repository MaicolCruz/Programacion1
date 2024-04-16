package co.edu.uniquindio.poo;

/**
 *
 * 
 * @author Hector Daniel
 * @author1 Maicol Paez
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public record Asistencia(ClaseCurso claseCurso, TipoAsistencia tipoAsistencia) {

    public Asistencia {
        assert claseCurso != null : "El  parámetro clase no puede ser nulo, favro ingresar otro parámetro";
    }
}
