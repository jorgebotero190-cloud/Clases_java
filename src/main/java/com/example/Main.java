package com.example;

public class Main {
    public static void main(String[] args) {


              Product product1 = new Product();
              System.out.println("producto1 :");

        product1.setId("P001");
     product1.setNombre("Mouse");
        product1.setPrecio(25.50);
        product1.setDescripcion("Mouse inalámbrico con alta precisión");

        System.out.println("ID: " + product1.getId());
        System.out.println("Nombre: " + product1.getNombre());
        System.out.println("Precio: " + product1.getPrecio());
        System.out.println("Descripción: " + product1.getDescripcion());
        
    }}