package org.example;

class Item{
    private Number cantidad;
    private Number valor;
    private Producto producto;
    private Carrito carrito;
    /*
    public void agregarItem(){
        carrito.setProductos(carrito.getProductos().add(this));
    }
    public void quitarItem(){
        carrito.setProductos(carrito.getProductos().remove( this));
    }
    */
    public Number getValor(){
        return valor;
    }

    public Number getCantidad() {
        return cantidad;
    }

    public Double valorTotal(){
        Double auxiliar = this.getValor().doubleValue();
        Double auxiliarSegundo = this.getCantidad().doubleValue();
        return auxiliar * auxiliarSegundo;
    }
}