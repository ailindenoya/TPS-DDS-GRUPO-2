package org.example;

import java.util.List;

class Carrito{
    private List<Item> listaItem;
    private Cliente cliente;
    public void agregarAlCarrito(Item item){
        //agrega un item
    };
    public void sacarDelCarrito(Item item){
      // quita un item
    };
    public double sacarvalorItems(){
        double valorCarrito =  listaItem.stream().mapToInt().sum();
        if (cliente.getPreferencial()){
            valorCarrito=valorCarrito*0.75;
        }
        return valorCarrito;
    };
}