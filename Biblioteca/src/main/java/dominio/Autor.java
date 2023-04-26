package dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Autor {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String nacionalidad; //tambien podria ser enum para mas consistencia?

    public Autor(String nombre, LocalDate fechaNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }
}
