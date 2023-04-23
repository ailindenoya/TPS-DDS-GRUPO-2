package org.example;

import java.util.List;

class Carrito{
    private List<Item> productos;

    private Boolean estaPago = false; //ni idea, me parecia normal
    private Cliente cliente; // es necesario?
    public void agregarAlCarrito(Item item){
        //agrega un item
    };
    public void sacarDelCarrito(Item item){
      // quita un item
    };
    public List<Item> getProductos(){
        return productos;
    }
    /*
    public void setProductos(List<Item> nuevosProductos){
        productos=nuevosProductos;
    }
     */
    public double sacarValorItems(){
        //saca el valor total del carrito
        Double sumatoria = 0.0;
        Item[] arrayAuxiliar = productos.toArray(new Item[0]);
        Integer cantidadProductos = arrayAuxiliar.length;
        for (Integer i=0; i<=cantidadProductos;i++){
            sumatoria= arrayAuxiliar[i].valorTotal();
        }
        return sumatoria;
    }
    public void setEstaPago(){
        estaPago= !estaPago;
    }
}