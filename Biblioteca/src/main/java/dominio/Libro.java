package dominio;

import java.util.List;

public class Libro {
    private String nombre;
    private Integer anioPublicacion;
    private Autor autor;
    private Categoria categoria;
    private String editorial;
    private List<Copia> copias;
}
