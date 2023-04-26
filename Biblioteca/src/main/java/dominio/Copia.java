package dominio;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Copia {
    private Libro libro;
    private Integer identificador;
    private Estado estado;

    public Copia(Libro libro, Integer identificador, Estado estado) {
        this.libro = libro;
        this.identificador = identificador;
        this.estado = estado;
    }

    public Boolean estaDisponible() {
        return this.estado.equals(Estado.DISPONIBLE);
    }
}
