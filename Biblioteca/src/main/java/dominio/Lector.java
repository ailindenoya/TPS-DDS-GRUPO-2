package dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
public class Lector {
    private String nombre;
    private String apellido;
    private List<Prestamo> prestamos;
    //private Boolean habilitado; //flag para ver que no tenga dias multado
    private List<Multa> multas;

    public Integer calcularCantidadLibrosPrestados(){
        return prestamos.size();
    }

    public Boolean estaHabilitado(){
        //se fija que ningun prestamo este vencido
        return !prestamos.stream().anyMatch(p -> p.estaVencido());
    }
    public Boolean puedePedirNuevoPrestamo(){
        return this.calcularCantidadLibrosPrestados() < 3 && this.estaHabilitado();
    }

    public void tomarPrestadoNuevoLibro(Libro libro){
        if (!puedePedirNuevoPrestamo()) {
            //TODO tirar una excepcion?
        } else {
            Prestamo prestamo = new Prestamo(libro, this, LocalDate.now(), 30);
            prestamos.add(prestamo);
        }
    }
}
