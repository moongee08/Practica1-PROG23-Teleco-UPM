# Práctica 1 - PROGRAMACIÓN (PROG23)

Este repositorio contiene la primera práctica de la asignatura de Programación (PROG23) del primer curso (2º Cuatrimestre) del Grado en Ingeniería de Tecnologías y Servicios de Telecomunicación de la Universidad Politécnica de Madrid (UPM).

## Descripción del Proyecto

El proyecto consiste en una simulación básica orientada a objetos en Java que modela satélites y sus posiciones en el espacio tridimensional. El código está organizado en el paquete `es.upm.dit.prog.practica1`.

### Clases Principales

- **`Posicion.java`**: Modela una posición geográfica utilizando coordenadas esféricas (`latitud`, `longitud`, `altura`). Incluye:
  - Métodos para convertir la posición a coordenadas cartesianas (X, Y, Z).
  - Cálculo de la distancia euclídea entre dos posiciones en el espacio.
  - Sobrecarga de métodos `equals`, `hashCode` y `toString`.

- **`Satelite.java`**: Representa un satélite en una posición determinada en un tiempo dado. Sus atributos principales son:
  - `id`: Identificador del satélite.
  - `pos` y `t`: Posición actual y el tiempo correspondiente.
  - `pos0` y `t0`: Posición en un instante de tiempo inicial.
  - Constructor con comprobación de nulos y sus correspondientes _getters_, _setters_, y sobrecarga de objetos (`equals`, `toString`, `hashCode`).

### Clases de Prueba

El repositorio incluye clases proporcionadas para validar el correcto funcionamiento de la lógica de posicionamiento y gestión de los satélites:
- `Prueba1.java`
- `PruebaInteractiva1.java`

## Estructura del Proyecto

```text
PROG23-practica1/
├── bin/            # Archivos binarios compilados (.class)
└── src/            # Código fuente (.java)
    └── es/upm/dit/prog/practica1/
        ├── Posicion.java
        ├── Satelite.java
        ├── Prueba1.java
        ├── PruebaInteractiva1.java
        └── ejemplos.txt
```

## Requisitos y Configuración

- **Lenguaje**: Java (JDK 8 o superior).
- **IDE Recomendado**: Eclipse (ya que el proyecto incluye los archivos `.project` y `.classpath` de Eclipse).

## Cómo ejecutar

1. Clona el repositorio en tu máquina local.
2. Abre tu IDE (por ejemplo, Eclipse) y selecciona *Import -> Existing Projects into Workspace* señalando a la carpeta de este repositorio.
3. Ejecuta las clases `Prueba1.java` o `PruebaInteractiva1.java` como aplicación Java (Click derecho -> *Run As -> Java Application*).
