package dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Multa {
    private Lector lector;
    private Integer diasDeRetraso;
    private LocalDate fechaCreacion;

    public Multa(Lector lector, Integer diasDeRetraso, LocalDate fechaCreacion) {
        this.lector = lector;
        this.diasDeRetraso = diasDeRetraso;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer calcularDiasDeMulta(){
        return this.diasDeRetraso * 2; //creo que seria mas mantenible si este *2 seria configurable desde otro lado
    }
    public Boolean estaActiva(){
        return LocalDate.now().isBefore(this.fechaCreacion.plusDays(calcularDiasDeMulta()));
    }
}
