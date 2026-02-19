package com.example;

public class Product {

    private String id;
    private String Nombre;
    private String Descripcion;
    private double Precio;

    public Product() {
    this.id = "";
    this.Nombre = "";
    this.Descripcion = "";
    this.Precio = 0.0;
    }

   public Product(String id, String Nombre, String Descripcion, double Precio) {
    this.id = id;
    this.Nombre = Nombre;
    this.Descripcion = Descripcion;
    this.Precio = Precio;
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public double getPrecio() {
        return Precio;
    }
}