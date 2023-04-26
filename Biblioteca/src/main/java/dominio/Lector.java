package dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Lector {
    private String nombre;
    private String apellido;
    private List<Prestamo> prestamos;
    //private Boolean habilitado; //flag para ver que no tenga dias multado. Lo saque porque termine usando tienePrestamosVencidos()
    private List<Multa> multas;

    public Lector(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestamos = new ArrayList<>();
        this.multas = new ArrayList<>();
    }

    public Integer calcularCantidadLibrosPrestados(){
        return this.prestamos.size();
    }

    public Boolean tienePrestamosVencidos(){
        return this.prestamos.stream().anyMatch(p -> p.estaVencido());
    }

    public Boolean tieneMultasActivas(){
        return this.multas.stream().anyMatch(m -> m.estaActiva());
    }

    public Boolean puedePedirNuevoPrestamo(){
        return this.calcularCantidadLibrosPrestados() < 3 && !this.tienePrestamosVencidos() && !this.tieneMultasActivas();
    }

    public void tomarPrestadoNuevoLibro(Libro libro) throws Exception {
        if (!this.puedePedirNuevoPrestamo() || !libro.tieneCopiasDisponibles()) {
            throw new Exception("No se puede prestar el libro");
        } else {
                Prestamo prestamo = new Prestamo(libro.devolverCopiaDisponible(), this, LocalDate.now(), 30);
                this.prestamos.add(prestamo);
        }
    }
}
