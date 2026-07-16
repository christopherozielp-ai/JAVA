# Java
## Curso de Java
Java es un lenguaje de propósitos generales lo que significa que no está limitado a un solo tipo de aplicación sino que se puede utilizar en una gran variedad de áreas del desarrollo de software desde aplicaciones empresariales hasta sistemas embebidos java ha demostrado ser versátil y seguro.

## Usos principales de java

### Aplicaciones empresariales
java es el lenguaje por excelencia en el desarrollo de software corporativo, Bancos, Gobierno, Salud, grandes empresas lo usan para construir sistemas críticos, gracias a su estabilidad, seguridad, rendimiento y escalabilidad.

Usado en arquitecturas distribuidas como java EE
potenciado gracias a frameworks como spring boot, quarkus y otros que permiten crear aplicaciones web, aplicaciones web enterprise, aplicaciones de escritorio, aplicaciones moviles, microservicios, API REST, y de forma rápida y profesional sin necesidad de conocer todas las complejidades de java

Su ecosistema es inmenso y cuenta con una gran cantidad de librerias y herramientas para cualquier tipo de aplicacion que quiera construir,ademas de que java es un lenguaje con un tipado fuerte lo que ayuda a detectar errores en tiempo de compilacion.

### Desarrollo Backend
java es ampliamente usado en el desarrollo del lado servidor de aplicaciones web
Con frameworks como Spring Boot, Quarkus puedo construir servidores robustos, seguros y altamente configurables, ideales para microservicios, APIs, integracion con bases de datos y sistemas distribuidos

### Big Data y procesos de datos
java es compatible con plataformas de Big Data como Apache Hadoop, Apache Spark, Apache Flink, Apache Storm, Apache Kafka, entre otros esto lo convierte en una opcion muy fiable para sistemas que requieren procesamiento de grandes volumen de datos en tiempo real o por lotes.

### Aplicaciones de escritorio
Aunque hoy en dia no es tan popular como antes para el desarrollo de aplicaciones de escritorio gracias a la popularidad de las aplicaciones web y moviles, java sigue siendo una opcion muy viable para el desarrollo de aplicaciones de escritorio gracias a frameworks como Swing, JavaFX y Qt que permiten crear aplicaciones de escritorio robustas y profesionales

### Desarrollo Android
Aunque Kotlin es el lenguaje recomendado por Google para el desarrollo de aplicaciones Android, Java sigue siendo una opcion muy viable para el desarrollo de aplicaciones Android gracias a la compatibilidad con la JVM y la gran cantidad de librerias y herramientas disponibles para el desarrollo de aplicaciones Android

### loT (internet of Things / internet de las cosas)
Gracias a su portabilidad y bajo consumo de recursos java se utiliza en dispositivos embebidos, sensores inteligentes o sistemas de control en tiempo real plataformas como java ME y Eclipse IoT lo hacen apto par este tipo de soluciones

## Versiones de java
Existen varias versiones de java cada una con sus propias caracteristicas y mejoras
 
#### java SE (Standard Edition)
 Es la mas basica de java con todo lo necesario para crear aplicaciones de escritorio, librerias, logica de negocio, herraminetas de lineas de comandos, etc.

#### java EE (Enterprise Edition)
 Extiende java SE con funcionalidades para el desarrollo empresarial como:

 + servlets
 + EJB (Enterprise JavaBeans)
 + Web Services
 + Seguridad Avanzada
 + Manejo de transacciones
 
 #### JDK (Java Development Kit)
 Es el paquete completo para desarrollo incluye
 + Compilador (javac)
 + La maquina virtual (JVM)
 + Herramienta de desarrollo y depuracion

 #### JRE (Java Runtime Environment)
 Es el paquete que incluye la JVM y las librerias necesarias para ejecutar aplicaciones java

 #### Oracle JDK
 Es la version de java desarrollada por Oracle es la version mas completa y actualizada de java

 #### OpenJDK
 Es una version de java de codigo abierto desarrollada por la comunidad es una version gratuita y de codigo abierto de java



 ## ¿Que es la JVM?
Java es un lenguaje de programacion conocido por su principio de "Escribe una vez, ejecuta en cualquier lugar" (Write once, run anywhere) esto significa que un programa compilado en una plataforma puede ser ejecutado en cualquier otra plataforma que tenga una JVM instalada esto se debe a que java no se compila a codigo maquina sino a bytecode que es un codigo intermedio que puede ser ejecutado por la JVM

La JVM (Java Virtual Machine) es una maquina virtual que se encarga de ejecutar el bytecode de java, la JVM es la encargada de traducir el bytecode a codigo maquina que puede ser ejecutado por la CPU de la computadora

## Lenguaje Orientado a Objetos (OOP/POO)
java esta construido sobre el paradigma de programacion orientado a objetos lo que significa que todo gira en entorno a objetos, clases, herencia, polimorfismo y encapsulamiento esto permite construir programas modulares, reutilizables y faciles de mantener 

## Fuertemente Tipado
En java cada variable y expresion tiene un tipo bien definido y los errores de tipo se detectan en tiempo de compilacion esto reduce muchos errores comunes y mejora la calidadd del codigo

## Lenguaje compilado
Como ya e visto java no es ejecutable directamente desde el codigo fuente primero el compilar javac transforma el codigo .java en bytecode en .class que luego es ejecuta pro la JVM esto combina lo mejor de los dos lengujaes compilados e interpretados lo que permite que java sea un lenguaje con alto rendimiento y con alta portabilidad entre otros lenguajes

## Multiplataforma
La JVM permite que java sea un lenguaje multiplataforma lo que significa que un programa java compilado en una plataforma puede ser ejecutado en cualquier otra plataforma que tenga una JVM instalada

## Gestion automatico de memoria
java incluye un recolector de basura que se encarga de liberar la memoria que ya no se utiliza esto ayuda a evitar fugas de memoriay simplificar el manejo de recursos

## Gran ecosystema y comunidad
como java lleva tanto tiempo en el mercado tiene una cantidad inmensa de librerias, frameworks, herramientas y una comunidad enorme dispuesta a ayudar

### Diferentes tipos de System.xxx.println
+ System.out.println(); -> Para mostrar información normal, resultados y mensajes al usuario.
+ System.err.println(); -> Para mostrar errores, excepciones y advertencias (suele salir en rojo en los IDEs).
+ System.in -> Para leer lo que el usuario escribe con el teclado (usando un Scanner).

### Diferentes tipos de println()
+ System.out.println(); -> Para imprimir texto y saltar a la línea de abajo.
+ System.out.print(); -> Para imprimir y quedarte escribiendo en la misma línea.
+ System.out.printf(); -> Para imprimir texto con formato y variables.
### Que es una variable?
una variable es un espacio reservado en la memoria de la computadora que se utiliza para almacenar datos que pueden cambiar durante la ejecución del programa.

A diferencia de la constantes que son fijas.

### Que es una constante?
una constante es un valor de dato que no se puede modificar una vez que se ha asignado o definido un valor, por lo que su valor se mantiene constante durante toda la ejecución del programa.

### Que es un var?
Var es una palabra reservada que permite la inferencia de tipos de variables locales esto significa que el compilador deduce automaticamente el tipo de dato de la variable basandose en el valor con el que se inicializa evitando tener que escribir el tipo de dato explicitamente.

### Que son los datos primitivos?
en java los datos primitivos son los tipos de datos mas basicos y fundamentales que el lunguaje ofrece no son objetos y no tienen metodos propios alamacenan su valor directamente en la memoria ram lo que los hace muy rapidos e eficientes
en rendimiento y consumo de recursos

#### Tipos de datos enteros
+ byte.- es el mas pequeño ideal para ahorrar memoria en grande arreglos de numeros pequeños
rango.- 128 a 127
+ short.- entero de 16 bits menos que un int
rango.- 32,768 a 32767
+ int.- es el tipo mas utilizado para enteros (32 bits) es el estandar para contadores y calculos matematicos
rango.- aporx 2 millones
+ long.- para numeros enteros muy grandes (64 bits) requieren el sufijo L en su literal (ej. 100L)
rango.- aprox 9 trillones

### Tipos de punto flotante (Decimales)
+ **float**: Para números con decimales de precisión simple (32 bits). Requiere el sufijo `f` (ej. `3.14f`). Útil para ahorrar memoria si no necesitas mucha precisión.
+ **double**: Para números con decimales de precisión doble (64 bits). Es el estándar en Java para números decimales (ej. `3.14159`).

### Tipo Carácter
+ **char**: Almacena un único carácter Unicode (16 bits). Se define entre comillas simples (ej. `'A'`, `'ñ'`, `'$'`). Internamente se comporta como un número entero positivo (de 0 a 65,535), lo que permite hacer operaciones con ellos.

### Tipo Booleano
+ **boolean**: Solo admite dos valores: `true` (verdadero) o `false` (falso). Se usa exclusivamente para lógica condicional y banderas de estados.

---

### Operadores Aritméticos (`+`, `-`, `*`, `/`, `%`)
Estas operaciones son esenciales para cualquier programa que necesite trabajar con números, desde cálculos simples hasta lógicas más complejas.
Se usan en todo tipo de programas:
+ **Cálculos matemáticos**.
+ **Lógica de juegos** (vidas, puntuaciones).
+ **Finanzas** (sumas, descuentos, porcentajes).
+ **Estadísticas**.
*(Nota: El operador módulo `%` es súper útil para saber si un número es par o impar, o para limitar rangos).*

**Ejemplos en Java:**
```java
int suma = 10 + 5;        // 15
int resta = 10 - 5;       // 5
int multi = 10 * 5;       // 50
int div = 10 / 5;         // 2
int modulo = 10 % 3;      // 1 (El residuo de dividir 10 entre 3)
```

### Operadores de Asignación (`=`, `+=`, `-=`, `*=`, `/=`, `%=`)
Son fundamentales para guardar y actualizar valores en variables, permitiéndote escribir código más limpio, claro y eficiente.
Dominarlos desde el principio te permitirá:
+ Escribir código más corto y fácil de entender (ej. `a += 5` en lugar de `a = a + 5`).
+ Actualizar valores de variables de forma clara y directa.
+ Resolver cálculos acumulativos y transformaciones sin repetir variables innecesariamente.

**Ejemplos en Java:**
```java
int vidas = 3;    // Asignación básica
vidas += 1;       // Sube 1 vida (Equivale a vidas = vidas + 1). Ahora es 4
vidas -= 2;       // Pierde 2 vidas. Ahora es 2
```

### Operadores de Comparación (`==`, `!=`, `>`, `<`, `>=`, `<=`)
Estos te permiten comparar valores de un programa. Son fundamentales para tomar decisiones lógicas (ej. ¿es mayor?, ¿es igual?, ¿es diferente?).
Estos operadores no modifican los datos, sino que producen un resultado booleano (`true` o `false`), lo cual es clave para el control del flujo del programa (condicionales `if`, bucles `while`, validaciones, etc.).

**Ejemplos en Java:**
```java
int edad = 18;
boolean esMayor = (edad >= 18);   // true
boolean esNino = (edad < 12);     // false
boolean esIgual = (edad == 20);   // false
boolean esDiferente = (edad != 0);// true
```

### Operadores Lógicos (`&&`, `||`, `!`)
Son esenciales para combinar y evaluar condiciones múltiples dentro de un programa. Permiten que tu código tome decisiones más complejas, comparando no solo un valor, sino varias condiciones al mismo tiempo.
Son muy usados en reglas de negocio. Por ejemplo:
+ **AND (`&&`)**: ¿El usuario es mayor de edad **Y** ha aceptado los términos? (Ambas deben cumplirse).
+ **OR (`||`)**: ¿El pedido es válido **O** el producto está en oferta? (Basta con que se cumpla una).
+ **NOT (`!`)**: ¿**NO** se ha alcanzado el límite de intentos? (Invierte el valor).

Sin estos operadores, un programa solo podría evaluar condiciones simples. Combinarlos te permite crear lógica mucho más rica.

**Ejemplos en Java:**
```java
boolean mayorEdad = true;
boolean aceptoTerminos = false;

boolean puedeEntrar = mayorEdad && aceptoTerminos; // false (faltó aceptar términos)
boolean oUnauOtra = mayorEdad || aceptoTerminos;   // true (cumple al menos una)
boolean negacion = !mayorEdad;                     // false (lo contrario a true)
```

### Operadores Unarios (`++`, `--`, `+`, `-`)
Actúan sobre una sola variable o valor. Tienen un papel muy importante para modificar el valor de una variable, cambiar su signo, o aplicar incrementos/decrementos de forma rápida.
+ **Incremento / Decremento**: `++a` o `a--`.
+ **Signo**: `-a` (vuelve negativo el valor).
> **Importante:** Entender cuándo se evalúa el cambio de valor (antes o después, por ejemplo `++a` vs `a++`) es muy importante para evitar errores sutiles en la lógica del programa.

**Ejemplos en Java:**
```java
int contador = 0;
contador++;           // Ahora es 1 (sufijo: incrementa después)
++contador;           // Ahora es 2 (prefijo: incrementa antes)
int negativo = -contador; // Ahora es -2
```

