# Clases Java - Práctica de POO

Proyecto educativo en Java para practicar los fundamentos de la **Programación Orientada a Objetos (POO)**.

## Descripción

Este proyecto implementa una clase `Product` con sus atributos, constructores, métodos `get`, `set` y `toString`, aplicando los conceptos básicos de encapsulamiento en Java.

## Estructura del proyecto

```
src/
└── main/
    └── java/
        └── com/
            └── example/
                ├── Main.java       # Clase principal con ejemplos de uso
                └── Product.java    # Clase Product con atributos y métodos
```

## Clase Product

Atributos:
- `Id` - Identificador del producto (String)
- `Nombre` - Nombre del producto (String)
- `Descripcion` - Descripción del producto (String)
- `Precio` - Precio del producto (double)

Métodos implementados:
- Constructores: sin parámetros y con parámetros
- Getters: `getId()`, `getNombre()`, `getDescripcion()`, `getPrecio()`
- Setters: `setId()`, `setNombre()`, `setDescripcion()`, `setPrecio()` (con validaciones)
- `toString()` para representación en texto

## Temas practicados

- Encapsulamiento (atributos privados)
- Constructores
- Métodos getter y setter
- Validaciones en setters
- Sobrescritura de `toString()`
- Instanciación de objetos

## Tecnologías

- Java
- Maven
