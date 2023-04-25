package dominio;

import java.util.List;

public class Lector {
    private String nombre;
    private String apellido;
    private Integer cantidadLibros;
    private List<Prestamo> prestamos;
    private Boolean habilitado;
    private List<Multa> multas;

    public Boolean puedePedirNuevoPrestamo(){
        //TODO
        return Boolean.TRUE;
    }

    public void agregarDiasMultado(Integer dias){
        //TODO
    }

    public void tomarPrestadoNuevoLibro(Libro libro){
        //TODO
    }
}
