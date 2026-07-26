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

### Cadenas de texto
Las cadenas de texto tambien llamadas String las cadenas permiten represnetar y manipular texto lo cual es fundamental en casi cualquier aplicacion desde mostrar mensajes hasta procesar datso introducidos por el usuarios.

Las cadena de texto estan en todas partes:mensajes de pantallas, nombres, correos, contraseñas, etc textos que se guardan datos que se reciben desde formularios o APIs entre muchos otros casos.

Entender como funciona el string es esencial para:
+ Capturar y mostara informacion
+ Manipular texto (cortar, unir, buscar) 
+ Interactuar con el usuario o con otros sistemas
  
Ademas los String son objetos en java.

### Métodos y Operaciones con Strings
A continuación se muestran las operaciones y métodos más comunes al trabajar con Cadenas de Texto (basado en nuestros apuntes):

#### 1. Creación y el "String Pool"
```java
String name = "oziel"; // Forma recomendada. Se guarda en el "String Pool" para ahorrar memoria.
var surname = new String("Perez"); // Fuerza la creación de un nuevo objeto en memoria (Heap).
```

#### 2. Concatenación
Se usa el operador `+` para unir dos o más textos.
```java
System.out.println(name + " " + surname); // Une variables y texto literal
```

#### 3. Longitud (`length()`)
Devuelve la cantidad de caracteres que tiene el texto.
```java
System.out.println(name.length());
```

#### 4. Obtener Carácter (`charAt(index)`)
Accede a un carácter específico por su posición (índice). Los índices empiezan en 0.
```java
System.out.println(name.charAt(4)); 
```

#### 5. Subcadenas (`substring()`)
Extrae fragmentos de una cadena de texto.
```java
System.out.println(name.substring(2)); // Desde el índice 2 hasta el final
System.out.println(name.substring(1, 3)); // Desde el índice 1 hasta el 3 (sin incluir el 3)
```

#### 6. Mayúsculas y Minúsculas (`toUpperCase()` y `toLowerCase()`)
```java
System.out.println(name.toUpperCase()); // Convierte todo a MAYÚSCULAS
System.out.println(name.toLowerCase()); // Convierte todo a minúsculas
```

#### 7. Comprobar si contiene (`contains()`)
Verifica si un texto contiene otro texto o fragmento específico. Devuelve `true` o `false`.
```java
System.out.println("Hola oziel".contains("oziel")); // true
```

#### 8. Comparación (`equals()` y `equalsIgnoreCase()`)
**¡Importante!** Para comparar el contenido de dos Strings **SIEMPRE** se debe usar `.equals()`, no `==`.
```java
System.out.println(name.equals("oziel")); // Compara el contenido exacto
System.out.println(name.equalsIgnoreCase("Oziel")); // Compara ignorando mayúsculas/minúsculas
```

#### 9. La diferencia entre `==` y `.equals()`
+ `==` : Compara **referencias de memoria** (¿apuntan al mismo objeto físico?).
+ `.equals()` : Compara el **contenido** (¿el texto es el mismo?).
```java
var a = "oziel";
var c = new String("oziel");
System.out.println(a == c); // false (Son objetos distintos en memoria)
System.out.println(a.equals(c)); // true (Tienen el mismo texto)
```

#### 10. Limpiar espacios (`trim()`)
Elimina los espacios en blanco sobrantes al principio y al final del texto (no en el medio).
```java
System.out.println(" Hola ".trim()); // Resultado: "Hola"
```

#### 11. Reemplazar (`replace()`)
Cambia todas las apariciones de un carácter o texto por otro nuevo.
```java
System.out.println("Hola mundo".replace("mundo", "java")); // Resultado: "Hola java"
```

#### 12. Formateo de Strings (`String.format()`)
Sirve para insertar variables dentro de un texto de forma ordenada y controlada, usando comodines como `%s` (String) y `%d` (Enteros).
```java
var age = 19;
System.out.println(String.format("Hola soy %s y tengo %d años", name, age));
```

---

## Estructuras de Control (Condicionales)

Las estructuras de control nos permiten tomar decisiones en el código, ejecutando diferentes bloques dependiendo de ciertas condiciones o valores.

### 1. Condicionales (`if` / `else if` / `else`)
Se utilizan cuando tienes **condiciones complejas**, rangos numéricos o necesitas combinar operadores lógicos (`&&`, `||`).

+ **`if`**: Es la condición inicial.
+ **`else if`**: Evalúa una nueva condición si la anterior no se cumplió. Siempre va entre el `if` y el `else`.
+ **`else`**: Es el bloque por defecto que se ejecuta cuando ninguna condición anterior fue verdadera.

**Ejemplo en Java:**
```java
var age = 15;

// Esto se ejecuta de manera secuencial
if (age > 18) {
    System.out.println("Eres mayor de edad");
} else if (age == 18) {
    System.out.println("Felicidades por cumplir tus 18 años");
} else {
    System.out.println("Eres menor de edad");
}
```

### 2. Condicional `switch`
El `switch` está diseñado específicamente para evaluar **una sola variable** contra muchos **valores exactos y concretos** (como opciones de un menú, días de la semana, etc.). Hace que el código sea mucho más limpio que usar muchos `if / else if` anidados.

+ **`case`**: Representa cada valor exacto posible de la variable.
+ **`break`**: Es fundamental para salir del `switch` una vez que un caso se cumple. Si lo olvidas, el código seguirá ejecutando los casos de abajo.
+ **`default`**: (Opcional) Funciona como el `else`; se ejecuta si ninguno de los casos coincidió.

**Ejemplo en Java:**
```java
var day = 3;

switch (day) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    case 4:
        System.out.println("Jueves");
        break;
    case 5:
        System.out.println("Viernes");
        break;
    default:
        System.out.println("No es lunes, martes, miércoles, jueves o viernes");
}
```

---

## Estructuras de Datos: Arreglos (Arrays)

Un arreglo (o *array*) es una estructura de datos que nos permite almacenar **múltiples valores del mismo tipo** bajo un mismo nombre de variable. Piensa en un arreglo como una caja grande con muchos compartimentos numerados, donde en cada compartimento puedes guardar un dato.

### Características principales de los Arrays en Java:
1. **Tamaño fijo:** Una vez que creas un arreglo con un tamaño específico (ej. 20 espacios), ese tamaño **no puede cambiar**. No puedes agregar un espacio 21 más tarde ni quitarle espacios.
2. **Índices basados en cero (0):** El primer elemento siempre se guarda en la posición `0`, el segundo en la `1`, y así sucesivamente. El último elemento siempre está en la posición `tamaño - 1`.
3. **Tipado estricto:** Un arreglo de enteros (`int[]`) solo puede guardar números. No puedes mezclar textos (`String`) con números en el mismo arreglo.

### 1. Declaración y Creación

Puedes crear un arreglo especificando la cantidad de espacios que necesitas, o dándole los valores directamente si ya los conoces.

```java
// Forma 1: Especificando el tamaño (se llena con valores por defecto, ej. 0 para int)
int[] numbers = new int[20]; 
// Esto crea un arreglo con 20 espacios libres (del índice 0 al 19)

// Forma 2: Asignando los valores directamente desde el inicio
String[] names = {"oziel", "perez", "valente"}; 
// Java cuenta los elementos y crea automáticamente un arreglo de 3 espacios
```

### 2. Acceso a los datos
Para leer el valor que hay dentro de un compartimento, usas el nombre de la variable seguido de corchetes `[ ]` con el número de índice que quieres revisar.

```java
System.out.println(names[0]); // Imprime "oziel" (el primer elemento)
System.out.println(numbers[3]); // Imprime 0 (el valor por defecto al crear el arreglo int)
```

### 3. Modificar datos
Para cambiar o actualizar el dato que hay guardado en una posición, accedes a esa posición con los corchetes y le asignas un nuevo valor usando el signo `=`.

```java
numbers[0] = 12; // Guarda el número 12 en el primer compartimento
numbers[19] = 19; // Guarda el número 19 en el último compartimento (20 - 1)

names[2] = "weekend"; // Cambia el texto "valente" por "weekend"
```

> Ten mucho cuidado con no salirte de los límites del arreglo. Si tu arreglo tiene 20 espacios (índices 0 al 19) e intentas hacer `numbers[20] = 5;`, Java lanzará un error crítico llamado `ArrayIndexOutOfBoundsException` y tu programa se detendrá.

### 4. Tamaño del arreglo (`length`)
Si en algún momento necesitas saber cuántos espacios tiene en total un arreglo, puedes usar su propiedad `.length` (¡Ojo! a diferencia de los Strings, este `length` no lleva paréntesis al final).

```java
System.out.println(names.length); // Imprime 3
```

### 5. "Eliminar" datos (Vaciar un espacio)
Como el tamaño es fijo, no puedes destruir un compartimento para hacer el arreglo más pequeño. Lo que sí puedes hacer es "vaciarlo" asignándole `null` (si es un objeto o texto) o `0` (si es un número).

```java
names[2] = null; // El espacio 2 (el tercero) ahora está vacío
System.out.println(names.length); // Sigue imprimiendo 3, porque el compartimento sigue ahí, solo que vacío.
```

### 6. Arreglos de otros tipos primitivos
Puedes crear arreglos de absolutamente cualquier tipo de dato, incluyendo booleanos. Al crearlos sin valores predefinidos, Java los rellena con sus valores por defecto (como `false` para booleanos, o `0` para números).

```java
boolean[] booleans = new boolean[5];
System.out.println(booleans[2]); // Imprime false
```

---

## Listas Dinámicas: ArrayList

A diferencia de los arreglos (Arrays) tradicionales que tienen un tamaño fijo, un `ArrayList` es una lista dinámica. Esto significa que **puede crecer o encogerse automáticamente** a medida que le agregas o le quitas elementos. Es una de las estructuras de datos más utilizadas y flexibles en Java.

> [!NOTE]
> Para usar un `ArrayList`, primero debes importarlo en la parte superior de tu archivo con: `import java.util.ArrayList;`.
> Además, los ArrayLists solo pueden guardar "Objetos", por lo que para guardar números o datos primitivos debes usar sus Clases Envolventes o *Wrappers* (ej. `Integer` en lugar de `int`, `Boolean` en lugar de `boolean`, `Double` en lugar de `double`).

### 1. Declaración y Creación
Se especifica el tipo de dato que va a guardar entre símbolos de mayor y menor `< >` (Diamante).

```java
// Forma 1: Tradicional
ArrayList<String> names = new ArrayList<String>();

// Forma 2: Usando var (Inferencia de tipos) y Wrapper (Integer)
var numbers = new ArrayList<Integer>();
```

### 2. Conocer su tamaño (`size()`)
A diferencia de los arrays que usan la propiedad `.length`, los ArrayLists usan el método `.size()`.

```java
System.out.println(names.size()); // Imprime 0 al inicio
```

### 3. Añadir elementos (`add()`)
Agrega elementos, por defecto al final de la lista. Su tamaño crecerá automáticamente.

```java
names.add("oziel");
names.add("perez");
names.add("martinez");
System.out.println(names.size()); // Ahora imprime 3
```

### 4. Acceder a los elementos (`get()`)
No se usan corchetes `[]` para leer datos. Se utiliza el método `.get(índice)`.

```java
System.out.println(names.get(0)); // Imprime "oziel" (para acceder a un dato en concreto)
System.out.println(names.get(1)); // Imprime "perez"

// En versiones modernas de Java también puedes usar:
System.out.println(names.getFirst()); // Te da el primer dato de la lista
System.out.println(names.getLast());  // Te da el último dato de la lista
```

### 5. Modificar elementos (`set()`)
Reemplaza el valor que existe en un índice específico por uno nuevo.

```java
names.set(2, "christopher"); // Cambia "martinez" por "christopher" en el índice 2
System.out.println(names.getLast()); // Imprime "christopher"
```

### 6. Eliminar elementos (`remove()`)
Puedes borrar un elemento indicando su índice. **Importante:** Al eliminar un elemento, todos los elementos que estaban a su derecha se recorren automáticamente hacia la izquierda para tapar el hueco, reduciendo el tamaño total.

```java
names.remove(2); // Elimina a "christopher". La lista se encoge.
// System.out.println(names.get(2)); // Esto ahora daría error porque el índice 2 ya no existe.
```

### 7. Buscar elementos (`contains()`)
Verifica si un valor exacto existe dentro de la lista. Devuelve `true` si lo encuentra o `false` si no.

```java
System.out.println(names.contains("oziel")); // true
System.out.println(names.contains("christopher")); // false (porque lo eliminamos arriba)
```

### 8. Vaciar toda la lista (`clear()`)
Elimina todos los elementos del ArrayList de un solo golpe, dejándolo completamente vacío.

```java
names.clear();
System.out.println(names.size()); // Imprime 0
```

---

## Conjuntos: HashSet (Sets)

Un `HashSet` (o simplemente *Set* / Conjunto) es una estructura de datos muy especial en Java. A diferencia de las Listas o los Arreglos, **no tiene un orden específico** y su regla de oro es: **¡No acepta elementos duplicados!**

> [!NOTE]
> Para usarlo, debes importarlo en la parte superior con: `import java.util.HashSet;`.
> Al igual que el `ArrayList`, usa Clases Envolventes (*Wrappers*) como `Integer` en lugar de primitivos como `int`.

### Características Principales:
1. **Sin Duplicados:** Si intentas agregar el mismo dato 10 veces, Java solo guardará uno y descartará silenciosamente el resto (sin lanzar errores).
2. **Sin Orden (Sin Índices):** No hay un elemento `0`, `1` o `2`. Los datos se guardan de manera "desordenada" internamente usando un algoritmo matemático llamado *Hash*.
3. **Súper Rápido:** Buscar un dato en un `HashSet` (usando `contains`) es increíblemente rápido y óptimo, muchísimo más que buscar en un `ArrayList` gigante.

### 1. Declaración y Creación
```java
HashSet<String> names = new HashSet<>();
var numbers = new HashSet<Integer>();
```

### 2. Añadir y Tamaño (`add()` y `size()`)
La forma de añadir elementos y ver el tamaño es idéntica a las Listas.
```java
names.add("oziel");
names.add("Perez");
names.add("Martinez");
System.out.println(names.size()); // Imprime 3

// Si intentamos agregar duplicados:
names.add("oziel");
names.add("oziel");
System.out.println(names.size()); // ¡Sigue imprimiendo 3! Ignoró las repeticiones.
```

### 3. Mostrar los elementos
Como **no hay índices**, no puedes usar un método como `.get(0)`. Para verlos, normalmente imprimes el conjunto completo o usas un bucle para recorrerlos.
```java
System.out.println(names); // Los imprime todos de golpe, pero el orden será aleatorio.
```

### 4. Buscar datos (`contains()`)
Esta es la mayor fortaleza del `HashSet`. Es la estructura ideal cuando necesitas comprobar constantemente si algo existe.
```java
System.out.println(names.contains("oziel")); // Devuelve true casi instantáneamente
```

### 5. Eliminar elementos (`remove()`)
Al no existir índices, para eliminar un elemento tienes que indicarle exactamente **el valor** del dato que quieres borrar.
```java
names.remove("oziel"); // Borra "oziel" del conjunto
```

### 6. Operaciones de Conjuntos (Teoría de Conjuntos Matemática)
Puedes aplicar la lógica de los Diagramas de Venn con múltiples Sets (ej. `names` y `countries`):

```java
var countries = new HashSet<String>();
countries.add("Mexico");
countries.add("Brazil");
countries.add("Argentina");

// UNIÓN (Juntar ambos conjuntos)
names.addAll(countries); 
// Ahora 'names' tiene sus datos originales MÁS todos los países.

// DIFERENCIA (Restar un conjunto)
names.removeAll(countries);
// Elimina de 'names' cualquier dato que pertenezca a 'countries'.

// INTERSECCIÓN (Quedarse solo con lo que tienen en común)
names.retainAll(countries);
// Elimina todo de 'names' EXCEPTO los datos que también existan dentro de 'countries'.
```

---

## Mapas (Diccionarios): HashMap

Un `HashMap` (también conocido como Mapa o Diccionario) es una estructura de datos que **guarda pares de datos**: una **Clave** (*Key*) y un **Valor** (*Value*). Es ideal para cuando necesitas asociar un dato con otro, justo como en un diccionario real donde buscas una palabra (Clave) para encontrar su definición (Valor).

> [!NOTE]
> Para usarlo, debes importarlo con: `import java.util.HashMap;`.
> Como guarda pares de datos, al crearlo **siempre debes especificar dos tipos de datos** (Clave, Valor). Recuerda usar Clases Envolventes (*Wrappers*) como `Integer` en lugar de `int`.

### 1. Declaración y Creación
```java
// Forma 1: Tradicional (Clave: String, Valor: String)
HashMap<String, String> names = new HashMap<>();

// Forma 2: Usando var (Clave: Integer, Valor: String)
var numbers = new HashMap<Integer, String>();
```

### 2. Añadir elementos (`put()`)
A diferencia de las listas y los sets que usan `add()`, los mapas usan el método `.put(clave, valor)`.
**Importante:** Las claves deben ser únicas. Si haces un `put` usando una clave que ya existe, su valor anterior será sobreescrito por el nuevo.

```java
names.put("Oziel", "christopherozielp@gmail.com");
names.put("perez", "christopherozielp@gmail.com");
System.out.println(names.size()); // Imprime 2
```

### 3. Acceder a los elementos (`get()`)
Para obtener un valor, no usas índices (0, 1, 2). En su lugar, le pides al mapa que te devuelva el valor asociado a una **Clave** específica.

```java
System.out.println(names.get("Oziel")); // Devuelve: "christopherozielp@gmail.com"
```

### 4. Verificar elementos (`containsKey()` y `containsValue()`)
Puedes preguntarle al mapa si ya tiene guardada una clave específica, o si tiene guardado un valor específico en algún lado.

```java
// Buscar por Clave (Es súper rápido y eficiente)
System.out.println(names.containsKey("Oziel")); // Devuelve true
System.out.println(names.containsKey("pe"));    // Devuelve false

// Buscar por Valor (Es más lento, ya que tiene que revisar todos los valores uno por uno)
System.out.println(names.containsValue("christopherozielp@gmail.com")); // Devuelve true
```

### 5. Eliminar elementos (`remove()`)
Le indicas al mapa cuál **Clave** quieres borrar, y eliminará el par completo (la clave y su valor asociado).

```java
names.remove("Oziel"); // Elimina por completo el registro de "Oziel"
System.out.println(names.size()); // Ahora será 1
```

### 6. Vaciar todo el Mapa (`clear()`)
Al igual que con las listas, elimina absolutamente todo lo que esté guardado en el mapa, dejándolo vacío y con tamaño 0.

```java
names.clear();
System.out.println(names); // Imprime "{}" que significa mapa vacío
```

### 7. Modificar y Reemplazar elementos (`put()`, `replace()` y `putIfAbsent()`)
Existen distintas maneras de modificar valores según tus necesidades:

+ **Reescribir con `put()`**: Si la clave ya existe, sustituye el valor antiguo. Si no existe, crea la entrada nueva.
+ **Reemplazar solo si existe con `replace()`**: Modifica el valor **únicamente si la clave ya existía** en el mapa.
+ **Insertar solo si no existe con `putIfAbsent()`**: Agrega la clave y su valor **solo si la clave no existía previamente**.

```java
// Sobrescribe el valor guardado para la clave "perez"
names.put("perez", "oziel@gmail.com"); 

// Reemplaza el valor de "perez" solo porque la clave "perez" ya existe
names.replace("perez", "perez@gmail.com"); 

// Agrega "martinez" únicamente si no existía antes en el mapa
names.putIfAbsent("martinez", "perez@gmail.com"); 
```

### 8. Comprobar si el mapa está vacío (`isEmpty()`)
Retorna `true` si el mapa está completamente vacío (tamaño 0) y `false` si tiene al menos un par clave-valor.

```java
// Comprueba si el mapa no tiene elementos
boolean vacio = names.isEmpty(); // Devuelve true o false
System.out.println(vacio);
```

### 9. Obtener la colección de valores (`values()`)
Extrae únicamente los **valores** almacenados en el mapa (descartando las claves), devolviendo una colección (`Collection`).

```java
// Obtiene solo la lista/colección de todos los valores almacenados
var values = names.values();
System.out.println(values); // Imprime la lista de valores
```

---

## Bucles (Ciclos / Loops)

Los bucles son estructuras que nos permiten repetir un bloque de código múltiples veces. Son fundamentales para procesar colecciones de datos (como Arreglos o Listas) o para ejecutar una tarea hasta que se cumpla una condición específica.

### 1. Bucle `for`
El bucle `for` es perfecto para tareas donde **conoces exactamente cuántas veces** quieres que se ejecute la acción. Es ideal para recorrer elementos de un arreglo por sus posiciones.
Se compone de tres partes:
- **Inicialización:** Se declara la variable de control (ej. `int i = 0`).
- **Condición:** Hasta cuándo debe repetirse (ej. `i < 5`).
- **Incremento/Decremento:** Cómo avanza en cada paso (ej. `i++`).

**Ejemplo en Java:**
```java
for (int i = 0; i <= 5; i++) {
    System.out.println("HOLA JAVA");
    /*el bucle for es perfecto para tareas 
    de ejecucion de una accion de un numero exacto de veces
    , recorrer elementos de un array o lista,
    aplicar opreraciones secunciales como contar, imprimir, procesar datos */
}

String[] names = {"oziel", "perez", "martinez", "mario"};
for (int index = 0; index < names.length; index++){
    System.out.println(names[index]);
}
```

### 2. Bucle `for-each`
El `for-each` es una versión simplificada del `for`. Se enfoca en **qué** se quiere recorrer, y no en **cómo** hacerlo. Es la opción perfecta cuando necesitas procesar *todos* los elementos de una colección (como un `HashSet` o un Arreglo) sin preocuparte por los índices o las posiciones.

**Ejemplo en Java:**
```java
// Recorrer un Arreglo
for (String name : names) {
    System.out.println(name);
}

// Recorrer un HashSet
HashSet<Integer> numbers = new HashSet<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
numbers.add(5);

for (Integer number : numbers) {
    System.out.println(number);
}

// Recorrer un HashMap (por pares Clave/Valor)
HashMap<String, String> emails = new HashMap<>();
emails.put("oziel", "chrsitopherozielp@gmail.com");
emails.put("perez", "perez@gmail.com");
emails.put("mario", "mario@gmail.com");

for (Map.Entry<String, String> email : emails.entrySet()) {
    System.out.println(email.getKey());
    System.out.println(email.getValue());
}
```

### 3. Bucle `while`
El bucle `while` se utiliza cuando **no sabes cuántas veces** se va a repetir el ciclo, pero sabes **bajo qué condición** debe seguir funcionando. Primero verifica la condición, y si es verdadera, ejecuta el código. (Por lo tanto, podría no ejecutarse ni siquiera una vez si la condición es falsa de inicio).

**Ejemplo en Java:**
```java
int index = 0;
while (index < 5) {
    System.out.println("HOLA OZIEL");
    index++; // ¡Importante avanzar para evitar un bucle infinito!
}

// Usando lógica con múltiples condiciones (ej. detenerse al encontrar un dato o al límite del arreglo)
index = 0;
boolean find = false;
while (!find && index < names.length) {
    System.out.println(names[index]);
    if (names[index].equals("juan")) {
        find = true; // Cuando lo encontramos, cambiamos la condición
    }
    index++;
}
```

### 4. Bucle `do-while`
El `do-while` es único porque **SIEMPRE ejecuta su bloque de código por lo menos una vez**, incluso si la condición es falsa desde el principio. 
*(Analogía: Es como dar el primer bocado a una comida antes de decidir si te gusta y quieres seguir comiendo).*

**Ejemplo en Java:**
```java
// La condición es falsa desde el inicio (0 no es menor que 0), 
// pero imprimirá "HOLA JAVA" una sola vez.
int index = 0;
do {
    System.out.println("HOLA JAVA");
    index++;
} while (index < 0); 
```

### 5. Control de Bucles (`break` y `continue`)
A veces necesitamos alterar el flujo natural de un bucle a la mitad de su ejecución.

#### `break` (Freno de Emergencia)
Al ejecutar el `break`, el bucle se **detiene por completo** e inmediatamente, saliendo de él.
*(Analogía: Es como tirar del freno de emergencia en un tren. No importa cuántas estaciones falten, el viaje se acaba ahí mismo).*

**Ejemplo en Java:**
```java
for (String name : names) {
    if (name.equals("oziel")) {
        break; // Detiene el bucle por completo al instante
    }
    System.out.println(name);
}
```

#### `continue` (Saltar de Canción)
A diferencia del `break`, el `continue` no destruye el bucle. Solo **salta el resto del código de la iteración actual** y pasa inmediatamente a la siguiente vuelta.
*(Analogía: Es como estar escuchando una playlist y darle al botón de "siguiente" cuando suena una canción que no te gusta. La música no se apaga, simplemente saltas a la siguiente pista).*

**Ejemplo en Java:**
```java
for (int i = 0; i < 20; i++) {
    if (i == 8) {
        continue; // Cuando i es 8, se salta la impresión y pasa directamente al 9
    }
    System.out.println(i);
}
```

---

## Funciones (Métodos) y Sobrecarga

Las funciones (o métodos en Java) nos permiten agrupar bloques de código para que realicen una tarea específica. Esto evita tener que escribir el mismo código varias veces y mantiene nuestro programa limpio y organizado, dándole una sola responsabilidad a cada bloque.

### 1. Funciones sin parámetros y sin retorno (`void`)
Son funciones que simplemente ejecutan una acción sin pedirte datos y sin devolverte ningún resultado. Se declaran con la palabra `void` (vacío).

### 2. Funciones con parámetros
Son funciones que necesitan "ingredientes" para trabajar. Le pasamos variables (parámetros) dentro de los paréntesis para que la función pueda operar con ellas.

### 3. Funciones con retorno (`return`)
En lugar de usar `void`, le decimos a Java qué tipo de dato nos va a devolver (ej. `boolean`, `int`, `String`). Esta función procesa información y te devuelve un resultado que puedes guardar en una variable usando la palabra clave `return`. Cuando el programa lee el `return`, sale de la función inmediatamente.

### 4. Sobrecarga de Funciones (Overloading)
La sobrecarga ocurre cuando tenemos **varias funciones con exactamente el mismo nombre**, pero que reciben **diferentes parámetros** (ya sea diferente cantidad o diferente tipo de datos). Java es lo suficientemente inteligente para saber cuál de todas las versiones ejecutar dependiendo de los ingredientes que le pases al llamarla.
*(Ojo: La sobrecarga **no** funciona si solo cambias el tipo de dato de retorno; los parámetros deben ser a fuerza diferentes).*

### Buenas Prácticas
*   **Nombres claros:** Los métodos deben describir exactamente lo que hacen (ej. `sendEmailToUsers` en vez de solo `send`).
*   **Una sola función concreta:** Un método debe hacer una sola cosa específica. Si hace demasiadas cosas, lo mejor es dividirlo en funciones más pequeñas.
*   **Modularidad:** Úsalas para evitar copiar y pegar el mismo código en tu método `main`.

### Ejemplo Completo en Java:

```java
package com.chris.cursos;

public class Funciones {
    public static void main(String[] args){
        // Llamando a una función varias veces dentro de un ciclo
        for (int index = 0; index < 5; index++){
            sendEmail();
        }
        
        // ==========================================
        // Probando la SOBRECARGA de funciones 
        // (Tienen el mismo nombre, pero comportamiento diferente según los parámetros)
        // ==========================================
        sendEmailToUsers("oziel@gmail.com"); 
        sendEmailToUsers("oziel@gmail.com", "Oziel");
        sendEmailToUsers(new String[]{"oziel", "perez"}); // Pasando un arreglo de Strings
        
        // ==========================================
        // Probando funciones con RETORNO
        // ==========================================
        var state = sendEmailWithState("ozielp@gmail.com");
        System.out.println("Estado del envío: " + state);

        System.out.println("Estado del envío vacío: " + sendEmailWithState(""));
    }

    // 1. Funciones sin parámetro ni retorno (void)
    public static void sendEmail(){
        System.out.println("Se envía el gmail");
    }

    // 2. Funciones con parámetros (1 parámetro String)
    public static void sendEmailToUsers(String email){
        System.out.println("Se envió el email a " + email);
    }
    
    // SOBRECARGA: Mismo nombre, pero con 2 parámetros String
    public static void sendEmailToUsers(String email, String name){
        System.out.println("Se envió el email a " + name + " con el correo " + email);
    }

    // SOBRECARGA: Mismo nombre, pero recibe un Arreglo de Strings
    public static void sendEmailToUsers(String[] emails){
        for (String email : emails){
            System.out.println("Se envió el email a " + email);
        }            
    }

    // 3. Funciones con RETORNO (devuelve un boolean en lugar de ser void)
    public static boolean sendEmailWithState(String email){
        // Si el correo está vacío, detiene la función y devuelve falso
        if (email.isEmpty()){
            return false;
        }
        System.out.println("Se ha enviado el gmail a " + email);
        return true; // Si llega hasta aquí, devuelve verdadero
    }
}
```