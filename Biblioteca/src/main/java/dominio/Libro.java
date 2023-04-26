package dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
public class Libro {
    private String nombre;
    private Integer anioPublicacion;
    private Autor autor;
    private Categoria categoria;
    private String editorial;
    private List<Copia> copias;

    public Libro(String nombre, Integer anioPublicacion, Autor autor, Categoria categoria, String editorial, List<Copia> copias) {
        this.nombre = nombre;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
        this.categoria = categoria;
        this.editorial = editorial;
        this.copias = copias;
    }

    public Boolean tieneCopiasDisponibles(){
        return this.copias.stream().anyMatch(c -> c.estaDisponible());
    }
    public Copia devolverCopiaDisponible() throws Exception {
        if (!tieneCopiasDisponibles()) {
            throw new Exception("No hay copias disponibles");
        } else {
            return this.copias.stream().filter(c -> c.estaDisponible()).collect(Collectors.toList()).get(0);
        }
    }
}
