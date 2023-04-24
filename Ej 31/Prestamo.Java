public class Prestamo{
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Lector lector;
    private Biblioteca biblioteca;

    public void diasRetraso(){
       return  this.fechaDevolucion - this.fechaPrestamo;
    }

}