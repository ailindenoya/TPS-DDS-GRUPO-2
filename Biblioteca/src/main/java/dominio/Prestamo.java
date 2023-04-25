package dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Prestamo {
    private Libro libro;
    private Lector lector;
    private LocalDate fechaDeRetiro; //fecha que el lector pide el prestamo
    private LocalDate fechaDeVencimiento; //fecha calculada a partir de los dias que le dan de prestamo
    private Integer diasDePrestamo; //en el texto dice 30 dias, pero me parecio mejor tenerlo como un atributo por si llega a cambiar

    //para cuando el lector devuelva el libro
    private LocalDate fechaDeDevolucion;

    public Prestamo(Libro libro, Lector lector, LocalDate fechaDeRetiro, Integer diasDePrestamo) {
        this.libro = libro;
        this.lector = lector;
        this.fechaDeRetiro = fechaDeRetiro;
        this.fechaDeVencimiento = fechaDeRetiro.plusDays(diasDePrestamo); //se setea al crear un nuevo prestamo
        this.diasDePrestamo = diasDePrestamo;
    }

    public Integer calcularDiasDeMulta(){
        //TODO (fechaDevolucion - fechaVencimiento) * 2

        return null;
    }

    public void devolverLibro() {
        this.setFechaDeDevolucion(LocalDate.now());
        if (calcularDiasDeMulta() > 0) {
            //TODO crea una multa y setea al lector como inhabilitado
            new Multa();
        }
    }

    public Boolean estaVencido() {
        //TODO me falta chequear que fecha de devolucion este seteada
        return this.getFechaDeDevolucion().isBefore(LocalDate.now());
    }
}
