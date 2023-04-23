package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code
public class Cliente{
  private String nombre;
  private String direcciondeenvio;
  private String direcciondecobro;
  private String email;
  private List<Tarjeta> tarjetas;
  private Number dni;
  private List<Carrito> carritos;
  private Boolean preferencial;

  public Boolean getPreferencial() {
    return preferencial;
  }
}
