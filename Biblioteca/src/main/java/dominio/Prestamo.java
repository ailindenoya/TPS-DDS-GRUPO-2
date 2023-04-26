package dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Getter @Setter
public class Prestamo {
    private Copia libro; //me parece que es mejor tener la copia del libro porque a partir de ella puedo acceder al libro si quiero
    private Lector lector;
    private LocalDate fechaDeRetiro; //fecha que el lector pide el prestamo
    private LocalDate fechaDeVencimiento; //fecha calculada a partir de los dias que le dan de prestamo
    private Integer diasDePrestamo; //en el texto dice 30 dias, pero me parecio mejor tenerlo como un atributo por si llega a cambiar

    private LocalDate fechaDeDevolucion; //se setea cuando el lector devuelva el libro

    public Prestamo(Copia libro, Lector lector, LocalDate fechaDeRetiro, Integer diasDePrestamo) {
        this.libro = libro;
        this.libro.setEstado(Estado.PRESTADO); //apenas se crea un prestamo se setea el estado de la copia en prestado
        this.lector = lector;
        this.fechaDeRetiro = fechaDeRetiro;
        this.fechaDeVencimiento = fechaDeRetiro.plusDays(diasDePrestamo); //se setea al crear un nuevo prestamo
        this.diasDePrestamo = diasDePrestamo;
    }

    public Integer calcularDiasDeRetraso(){
        return Math.toIntExact(ChronoUnit.DAYS.between(this.fechaDeVencimiento, this.fechaDeDevolucion)); //esto lo saque de stackoverflow espero que funcione
    }

    public void devolverLibro() {
        this.setFechaDeDevolucion(LocalDate.now());
        this.libro.setEstado(Estado.DISPONIBLE);
        if (this.estaVencido()) {
            this.lector.getMultas().add(new Multa(this.lector, this.calcularDiasDeRetraso(), LocalDate.now()));
        }
    }

    public Boolean estaVencido() {
        return this.fechaDeVencimiento.isBefore(LocalDate.now());
    }
}
