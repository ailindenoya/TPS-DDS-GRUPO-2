package org.example;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

class Carrito{
    private List<Item> productos = new ArrayList<Item>();

    private Boolean estaPago = false;
    private Cliente cliente;

    public void setProductos(List<Item> productos) {
        this.productos = productos;
    }

    public void agregarAlCarrito(Item item){
        this.getProductos().add(item);
    }
    public void sacarDelCarrito(Item item){
        this.getProductos().remove(item);
    }
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
        Item[] arrayAuxiliar = this.getProductos().toArray(new Item[0]);
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