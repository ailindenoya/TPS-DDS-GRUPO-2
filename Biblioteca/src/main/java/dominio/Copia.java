package dominio;

import lombok.Setter;

public class Copia {
    private Libro libro;
    private Integer identificador;

    @Setter
    private Estado estado;
}
