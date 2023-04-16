package org.example;

import org.example.Cliente;

import java.util.Date;

public class Tarjeta{
    private String nombre;
    private Number numero;
    private Date fecha;
    private String codigo;
    private Boolean verificacion;
    private Cliente cliente;

    public void serUsada(double valorTotal){
        //verifica y se paga
    };

}