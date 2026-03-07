# Semana 1 - Bitácora Tecnica

> **Objetivo:** Practicar operaciones con Streams y afianzar GitFlow en el flujo de trabajo.

## Ejercicio 1
- Filtrar pares > 10: `src/main/java/dosw/bitacora/Semana1/Streams/StreamsEjercicio1.java`
    
![captura](Imagenes/Ejercicio1Cod.png)

![captura](Imagenes/Ejercicio1.png)


## Ejercicio 2 
- Palabras (>4), MAYUS, sort, count: `src/main/java/dosw/bitacora/Semana1/Streams/StreamsEjercicio2.java`

![captura](Imagenes/Ejercicio2Cod.png)

![captura](Imagenes/Ejercicio2.png)


## Ejercicio 3
- Usuarios activos → nombres MAYUS sorted: `src/main/java/dosw/bitacora/Semana1/Streams/StreamsEjercicio3.java`

![captura](Imagenes/Ejercicio3Cod.png)

![captura](Imagenes/Ejercicio3.png)

## Ejercicio 4
- Usuarios mayores de edad → nombres: `src/main/java/dosw/bitacora/Semana1/Streams/StreamsEjercicio3.java`

![captura](Imagenes/Ejercicio4Cod.png)

![captura](Imagenes/Ejercicio4.png)

## Ejercicio 5
- Transacciones: `src/main/java/dosw/bitacora/Semana1/Streams/StreamsEjercicio5.java`

![captura](Imagenes/Ejercicio5Cod.png)

![captura](Imagenes/Ejercicio5_true.png)

![captura](Imagenes/Ejercicio5_false.png)


## Autoevaluación
**¿Qué entendía mal antes?**
- Pensaba que los Streams eran solo una forma más corta o “bonita” de hacer ciclos for.
- Creía que la mayoría de operaciones como filter, map, anyMatch o allMatch hacían cosas muy similares y no entendía 
claramente cuándo usar cada una.
- No tenía claro que algunas operaciones como anyMatch son de corto circuito y no recorren toda la colección.
- Me confundía al trabajar con negaciones booleanas, especialmente cuando debía validar condiciones generales como 
“todas las transacciones deben estar aprobadas”.
- Veía las clases más como contenedores de datos que como representaciones del dominio del problema.
  
**¿Qué entiendo ahora?**
- Entiendo que los Streams permiten trabajar de manera declarativa, enfocándome en qué resultado quiero obtener en
  lugar de cómo recorrer la colección paso a paso.
- Comprendí la diferencia entre operaciones intermedias y terminales, y cómo se construye un pipeline de procesamiento.
- Entiendo que filter sirve para seleccionar elementos, map para transformar datos y anyMatch/allMatch para realizar
  validaciones lógicas.
- Aprendí que la lógica de validación muchas veces funciona mejor pensando en la condición contraria (por ejemplo,
  validar que no exista ninguna transacción inválida).
- Mejoré mi capacidad para modelar clases simples que representen entidades reales (como una transacción) y usarlas
  dentro de un flujo de procesamiento.
- Comencé a pensar más en estructura de proyecto y organización del código dentro de la bitácora.

**¿Qué me falta reforzar?**
- Necesito practicar más la construcción de streams encadenados sin guía, especialmente combinando varias operaciones 
en un mismo flujo.
- Quiero mejorar mi comprensión y fluidez escribiendo lambdas sin depender tanto de ejemplos previos.
- Debo reforzar mi lógica al empezar un ejercicio desde cero, especialmente en la etapa de análisis antes de codificar.
- Quiero ganar más confianza entendiendo por qué una solución funciona y no solo que compile correctamente.
- Necesito practicar más ejercicios reales para automatizar la forma en que traduzco un problema a código.


