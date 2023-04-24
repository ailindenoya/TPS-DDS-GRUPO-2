public class Libro{
    private String nombre;
    private String anio;
    private Int valor;
    private String categoria;
    private String editorial;
    private Int identificador;
    private Int cantidad;

    public void ActualizarStock(Int unNumero){
        cantidad = this.cantidad + unNumero;
    }

}