package co.edu.uniquindio.poo;

import java.time.LocalDateTime;


/**
 *
 * 
 * @author Hector Daniel
 * @author1 Maicol Paez
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public record ClaseCurso(LocalDateTime fechaClase) {

    public ClaseCurso {
        assert fechaClase != null : "El parámetro fecgaClase no puede ser nulo, por favor ingresaro otro parámetro";
    }
}
