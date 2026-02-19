package com.example;

public class Product {

    private String Id;
    private String Nombre;
    private String Descripcion;
    private double Precio;

    public Product() {
    this.Id = "";
    this.Nombre = "";
    this.Descripcion = "";
    this.Precio = 0.0;
    }

   public Product(String id, String Nombre, String Descripcion, double Precio) {
    this.Id = Id;
    this.Nombre = Nombre;
    this.Descripcion = Descripcion;
    this.Precio = Precio;
    }

    public String getId() {
        return Id;
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

    
    public void setId(String Id) {
        this.Id = Id;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}