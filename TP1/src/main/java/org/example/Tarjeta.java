package org.example;

import org.example.Cliente;

import java.util.Date;

public class Tarjeta{
    private String nombre;
    private Number numero;
    private Date fecha;
    private String codigo;
    private Boolean verificacion;

    private Double Saldo;
    private Cliente cliente; //es necesario?

    public void serUsada(double valorTotal){
        // es verificada y usada
    }
    public Double getSaldo() {
        return Saldo;
    }
    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }
}