public class Copia{
    private Libro libro;
    private Lector lector;
    private Prestamo prestamo;

    public void PrestarLibro(){
        if(this.lector.multa == 0 && this.lector.libros.length() <= 3){
            this.Lector.Recibe(Libro this.libro);
            this.libro.ActualizarStock(-1);
    }
    }

    public void Devolucion(){
        this.Lector.agregarMulta(Int this.prestamo.diasRetraso() * 2);
        this.libro.ActualizarStock(+1);
    }
}