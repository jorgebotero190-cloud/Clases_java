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
- `id` - Identificador del producto (int)
- `nombre` - Nombre del producto (String)
- `descripcion` - Descripción del producto (String)
- `precio` - Precio del producto (double)

Métodos implementados:
- Constructores: sin parámetros y con parámetros
- Getters: `getId()`, `getNombre()`, `getDescripcion()`, `getPrecio()`
- Setters: `setId()`, `setNombre()`, `setDescripcion()`, `setPrecio()` (con validaciones que lanzan `IllegalArgumentException`)
- `toString()` para representación en texto

## Compilar y ejecutar

Con Maven desde la raíz del proyecto:

```bash
# Compilar
mvn compile

# Ejecutar
mvn exec:java -Dexec.mainClass="com.example.Main"

# Compilar y ejecutar en un solo paso
mvn compile exec:java -Dexec.mainClass="com.example.Main"
```

## Temas practicados

- Encapsulamiento (atributos privados)
- Constructores
- Métodos getter y setter
- Validaciones en setters con `IllegalArgumentException`
- Sobrescritura de `toString()`
- Instanciación de objetos

## Tecnologías

- Java
- Maven
