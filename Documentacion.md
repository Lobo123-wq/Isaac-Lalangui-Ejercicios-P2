# FUNDAMENTOS DE PROGRAMACIÓN

En el siguiente apartado se van a mostrar los fundamentos principales de programación en JAVA.

# 1. Java Home

Java es un lenguaje de programación muy popular que permite crear diferentes tipos de aplicaciones, como programas de escritorio, aplicaciones móviles y páginas web. Se caracteriza por funcionar en distintos sistemas operativos, como Windows, Mac y Linux.

Ejemplo:

public class JavaHome {
    public static void main(String[] args) {
        System.out.println("Bienvenido al lenguaje Java");
        System.out.println("Java permite desarrollar diferentes aplicaciones.");
    }
}

# 2. Java Intro

Java es un lenguaje de programación creado en 1995 y desarrollado para crear diferentes aplicaciones tecnológicas. Se utiliza en dispositivos móviles, programas de escritorio, páginas web, videojuegos y servidores. Es multiplataforma, gratuito y permite desarrollar programas seguros y eficientes.

Ejemplo:

public class JavaIntro {
    public static void main(String[] args) {
        String lenguaje = "Java";
        String uso = "desarrollo de aplicaciones";
        System.out.println(lenguaje + " se utiliza para el " + uso + ".");
    }
}

# 3. Java Get Started 

Para comenzar a programar en Java, es necesario instalar Java en el computador o utilizar el editor en línea de W3Schools. Después, se crea un archivo con extensión .java, se escribe el código y se compila para comprobar que no tenga errores. Finalmente, se ejecuta el programa para visualizar el resultado.

Ejemplo:

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

# 4. Java Syntax 

# 4.1 Syntax 
La sintaxis de Java comprende las reglas que permiten escribir correctamente un programa. Todo código debe estar dentro de una clase, utilizar el método main() para iniciar la ejecución y respetar el uso de llaves { } y punto y coma (;). Java también diferencia entre letras mayúsculas y minúsculas.

Ejemplo:

public class JavaSyntax {
    public static void main(String[] args) {
        int edad = 18;
        System.out.println("Edad: " + edad);
    }
}
# 4.2 Statements
Los statements son instrucciones que indican a la computadora qué acciones debe realizar dentro de un programa. Permiten mostrar información, realizar operaciones y ejecutar diferentes tareas. Generalmente, cada instrucción termina con punto y coma (;) y se ejecuta en el orden en que está escrita.

Ejemplo:

public class Statements {
    public static void main(String[] args) {
        int subtotal = 20;
        int iva = 3;
        int total = subtotal + iva;
        System.out.println("Total: " + total);
    }
}

# 5. Java Output

# 5.1 Print Text
Java permite mostrar mensajes, palabras y oraciones en la pantalla mediante el método System.out.println(). El texto debe escribirse entre comillas dobles y puede contener letras, números y símbolos. Cada vez que se utiliza este método, el mensaje aparece en una nueva línea.

Ejemplo:

public class PrintText {
    public static void main(String[] args) {
        System.out.println("Aprendiendo Java");
        System.out.print("Segunda línea sin salto automático");
    }
}

# 5.2 Print Numbers
Java también permite mostrar números enteros y realizar operaciones matemáticas directamente en la pantalla utilizando System.out.println(). A diferencia del texto, los números no necesitan escribirse entre comillas dobles. Esto facilita presentar resultados de sumas, multiplicaciones y otras operaciones.

Ejemplo:

public class PrintNumbers {
    public static void main(String[] args) {
        int a = 15, b = 5;
        System.out.println(a);
        System.out.println(a + b);
        System.out.printf("Promedio: %.1f%n", (a + b) / 2.0);
    }
}

# 6. Java Comments

Los comentarios son anotaciones que se escriben dentro del código para explicar su propósito o funcionamiento. El compilador los ignora, por lo que no afectan la ejecución del programa. Java permite escribir comentarios de una sola línea con `//` y comentarios de varias líneas entre `/*` y `*/`. Se recomienda utilizarlos para aclarar partes importantes del código.

Ejemplo:

public class JavaComments {
    public static void main(String[] args) {
        // Declaración del precio
        int precio = 12;

        /*
         * Se muestra el precio
         * en la consola.
         */
        System.out.println("Precio: $" + precio);
    }
}

# 7. Java Variables

# 7.1 Variables
Las variables permiten almacenar información dentro de un programa para utilizarla cuando sea necesario. Para declararlas, se debe indicar el tipo de dato, asignar un nombre y, opcionalmente, establecer un valor inicial. Su contenido también puede modificarse durante la ejecución del programa.

Ejemplo:

public class JavaVariables {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 20, semestre = 2;
        double promedio = 9.25;
        final double IVA = 0.15;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("IVA: " + IVA);
    }
}

# 7.2 Print Variables 
Java permite mostrar el contenido de las variables en la pantalla mediante el método System.out.println(). Esta instrucción facilita visualizar los datos almacenados y comprobar sus valores. También se puede utilizar el signo + para combinar un texto con el contenido de una variable.

Ejemplo:

public class PrintVariables {
    public static void main(String[] args) {
        String curso = "Programación";
        int nivel = 1;
        System.out.println(curso);
        System.out.println(nivel);
    }
}

# 7.3 Multiple Variables 
Java permite declarar varias variables del mismo tipo en una sola línea, separando sus nombres y valores mediante comas. También es posible asignar un mismo valor a diferentes variables. Esto ayuda a organizar la información y facilita la escritura del código cuando se necesitan almacenar varios datos relacionados.

Ejemplo:

public class MultipleVariables {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        System.out.println(x + y + z);
    }
}

# 7.4 Identifiers 
Los identificadores son los nombres que se utilizan para reconocer las variables dentro de un programa. Pueden contener letras, números, guiones bajos y signos de dólar, pero no deben comenzar con un número ni utilizar palabras reservadas de Java. Es recomendable utilizar nombres claros que permitan identificar fácilmente la información que almacena cada variable.

Ejemplo:

public class Identifiers {
    public static void main(String[] args) {
        int notaFinal = 9;
        String nombre_estudiante = "Luis";
        System.out.println(nombre_estudiante + ": " + notaFinal);
    }
}

# 7.5 Constants 
Las constantes son variables cuyos valores no pueden modificarse después de ser asignados. En Java se utiliza la palabra clave final para declarar una variable constante. Esto permite conservar un valor fijo durante la ejecución del programa y evitar modificaciones accidentales.

Ejemplo:

public class ConstantsFinal {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radio = 2;
        System.out.println("Área: " + (PI * radio * radio));
    }
}

# 7.6 Real-Life Examples
Las variables también se utilizan para almacenar información de situaciones reales, como los datos de un estudiante. Cada variable puede guardar información diferente, por ejemplo, su nombre, edad, identificación, calificación y valor de matrícula. De esta manera, Java permite organizar y mostrar distintos tipos de datos dentro de un mismo programa.

# 8. Java Data Types

# 8.1 Data Types 
Los tipos de datos indican qué clase de información puede almacenar una variable en Java. Entre ellos se encuentran los números enteros, números decimales, caracteres, valores booleanos y cadenas de texto. Cada tipo permite guardar información de acuerdo con sus características.

Ejemplo:

public class JavaDataTypes {
    public static void main(String[] args) {
        byte nivel = 1;
        short anio = 2026;
        int estudiantes = 35;
        long poblacion = 17000000L;
        float temperatura = 25.5f;
        double promedio = 9.75;
        boolean aprobado = true;
        char inicial = 'T';
        String nombre = "Tatiana";
        var ciudad = "Santo Domingo";

        System.out.println(nivel);
        System.out.println(anio);
        System.out.println(estudiantes);
        System.out.println(poblacion);
        System.out.println(temperatura);
        System.out.println(promedio);
        System.out.println(aprobado);
        System.out.println(inicial);
        System.out.println(nombre);
        System.out.println(ciudad);
    }
}

# 8.2 Numbers 
Java cuenta con diferentes tipos de datos numéricos que permiten almacenar cantidades y realizar operaciones matemáticas. Se dividen en dos grupos principales: los tipos enteros, que almacenan números sin decimales, y los tipos de punto flotante, que permiten guardar números con decimales.

# 8.2.1 Integer Types
Los tipos enteros se utilizan para almacenar números positivos y negativos sin decimales. Java dispone de cuatro tipos principales: byte, short, int y long, que se diferencian por la cantidad de valores que pueden almacenar. El tipo int es uno de los más utilizados para trabajar con números enteros.

Ejemplos:

public class IntegerTypes {
    public static void main(String[] args) {
        byte edad = 18;
        short anio = 2026;
        int habitantes = 15000;
        long distancia = 9876543210L;
        System.out.println(edad + " " + anio + " " + habitantes + " " + distancia);
    }
}

# 8.2.2 Floating Point Types
Los tipos de punto flotante permiten almacenar números que contienen decimales, como precios, medidas y cantidades. Java utiliza principalmente los tipos float y double, que se diferencian por su precisión. Para declarar un valor float se coloca la letra f al final del número.

Ejemplos:

public class FloatingPointTypes {
    public static void main(String[] args) {
        float temperatura = 25.5f;
        double promedio = 9.75;
        System.out.println(temperatura);
        System.out.println(promedio);
    }
}


# 8.3 Booleans (Valores booleanos)
Los valores booleanos permiten representar información que solamente puede tener dos resultados: verdadero (true) o falso (false). En Java se utiliza el tipo de dato boolean para almacenar estos valores. Son importantes porque permiten comprobar condiciones, comparar información y determinar si una situación se cumple o no dentro de un programa.

Ejemplo:

public class BooleanDataType {
    public static void main(String[] args) {
        boolean tieneCuenta = true;
        System.out.println(tieneCuenta);
    }
}


# 8.4 Characters (Caracteres)
El tipo de dato char se utiliza para almacenar un solo carácter, que puede ser una letra, un número o un símbolo. Para declarar este tipo de dato, el carácter debe escribirse entre comillas simples. También es posible utilizar valores ASCII para representar determinados caracteres dentro del programa.

Ejemplo:

public class CharacterDataType {
    public static void main(String[] args) {
        char inicial = 'A';
        System.out.println(inicial);
    }
}

# 8.5 Real-Life Example (Ejemplo de la vida real)
Los tipos de datos de Java pueden aplicarse a situaciones cotidianas que requieren almacenar información y realizar cálculos. Por ejemplo, en una compra se pueden registrar la cantidad de productos, el precio de cada artículo y el costo total. Para ello, se utilizan diferentes variables según el tipo de información que se necesita guardar.

# 8.6 Non-primitive Types (Tipos no primitivos)
Los tipos de datos no primitivos también se conocen como tipos de referencia porque hacen referencia a objetos dentro de Java. A diferencia de los tipos primitivos, permiten trabajar con información más compleja y utilizar métodos para realizar diferentes operaciones. Algunos ejemplos son String, los arreglos (Arrays) y las clases.

Ejemplos:

public class NonPrimitiveTypes {
    public static void main(String[] args) {
        String[] materias = {"Java", "Matemática", "Inglés"};
        System.out.println(materias[0]);
    }
}

# 8.7 The var Keyword
La palabra clave var permite declarar variables sin escribir directamente su tipo de dato, ya que el compilador lo identifica automáticamente según el valor asignado. Fue incorporada en Java 10 y ayuda a simplificar la escritura del código. Sin embargo, es necesario asignar un valor al momento de declarar la variable para que Java pueda reconocer su tipo.

Ejemplo:

public class VarKeyword {
    public static void main(String[] args) {
        var mensaje = "Hola desde Java";
        var cantidad = 12;
        System.out.println(mensaje);
        System.out.println(cantidad);
    }
}

# 9. Java Type Casting

# 9.1 Widening Casting 
La conversión automática permite transformar un tipo de dato pequeño en otro de mayor capacidad sin necesidad de escribir instrucciones adicionales. Java realiza este proceso automáticamente porque, generalmente, no se pierde información al pasar de un tipo de dato más pequeño a uno más grande. Por ejemplo, convertir un int en un double.

Ejemplo:

public class WideningCasting {
    public static void main(String[] args) {
        int numero = 25;
        double convertido = numero;
        System.out.println(convertido);
    }
}

# 9.2 Narrowing Casting 
La conversión manual permite transformar un tipo de dato de mayor capacidad en otro más pequeño. Para realizarla, se debe escribir el tipo de dato entre paréntesis antes del valor que se desea convertir. Este proceso puede provocar pérdida de información, especialmente cuando se convierten números decimales a enteros.

Ejemplo:

public class NarrowingCasting {
    public static void main(String[] args) {
        double precio = 15.89;
        int entero = (int) precio;
        System.out.println(entero);
    }
}

# 9.3 Type Conversion 
La conversión entre tipos de datos consiste en transformar un valor de un tipo a otro para poder utilizarlo correctamente en diferentes operaciones. En Java, este proceso permite trabajar con distintos tipos de números y obtener resultados más precisos cuando se realizan cálculos matemáticos. 

Ejemplos:

public class JavaTypeCasting {
    public static void main(String[] args) {
        int numeroEntero = 10;
        double conversionAmplia = numeroEntero;

        double precio = 19.95;
        int conversionReducida = (int) precio;

        System.out.println("Widening: " + conversionAmplia);
        System.out.println("Narrowing: " + conversionReducida);
    }
}

# 10. Java Operators 

# 10.1 Operators 
Los operadores en Java son símbolos que permiten realizar diferentes acciones con los valores y las variables de un programa. Se utilizan para efectuar cálculos matemáticos, asignar valores, comparar datos y combinar condiciones. Son fundamentales para realizar operaciones y desarrollar instrucciones dentro del código

Ejemplo:

public class JavaOperators {
    public static void main(String[] args) {
        int a = 12, b = 5;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División entera: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        boolean comparacion = a > b;
        boolean logica = (a > 10) && (b < 10);
        System.out.println("a es mayor que b: " + comparacion);
        System.out.println("Condición lógica: " + logica);
    }
}

# 10.2 Arithmetic 
Los operadores aritméticos permiten realizar operaciones matemáticas con números, como sumar, restar, multiplicar y dividir. También incluyen el operador módulo (%), que obtiene el residuo de una división, y los operadores de incremento (++) y decremento (--), que aumentan o disminuyen el valor de una variable en una unidad.

Ejemplos:

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        a++;
        System.out.println(a);
    }
}

# 10.3 Assignment
Los operadores de asignación se utilizan para asignar valores a las variables y modificar su contenido durante la ejecución del programa. El operador = permite establecer un valor inicial, mientras que otros como +=, -=, *= y /= permiten realizar una operación y guardar directamente el nuevo resultado en la misma variable.

Ejemplos:

public class AssignmentOperators {
    public static void main(String[] args) {
        int puntos = 10;
        puntos += 5;
        puntos *= 2;
        System.out.println(puntos);
    }
}

# 10.4 Comparison 
Los operadores de comparación permiten comparar dos valores o variables para determinar si existe una igualdad o diferencia entre ellos. Se utilizan para comprobar condiciones mediante símbolos como ==, !=, >, <, >= y <=. El resultado de estas comparaciones siempre es un valor booleano: true o false.

Ejemplos:

public class ComparisonOperators {
    public static void main(String[] args) {
        int a = 7, b = 10;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a >= b);
    }
}

# 10.5 Logical 
Los operadores lógicos permiten combinar o invertir varias condiciones dentro de un programa. Java utiliza principalmente tres operadores: && (AND), que requiere que ambas condiciones sean verdaderas; || (OR), que necesita que al menos una sea verdadera; y ! (NOT), que invierte el resultado de una condición.

Ejemplos:

public class LogicalOperators {
    public static void main(String[] args) {
        int edad = 22;
        boolean puede = edad >= 18 && edad <= 65;
        boolean especial = edad < 18 || edad > 65;
        System.out.println(puede);
        System.out.println(!especial);
    }
}

# 10.6 Precedence
La precedencia de operadores establece el orden en que Java realiza las operaciones cuando una expresión contiene varios operadores. Por ejemplo, las multiplicaciones y divisiones se realizan antes que las sumas y restas. Los paréntesis permiten modificar este orden y determinar qué operación debe ejecutarse primero.

Ejemplos:

public class OperatorPrecedence {
    public static void main(String[] args) {
        int resultado1 = 2 + 3 * 4;
        int resultado2 = (2 + 3) * 4;
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}

# 11. Java Strings

# 11.1 Strings 
Las cadenas de texto permiten almacenar palabras, nombres, oraciones y otros contenidos formados por caracteres. En Java se utiliza el tipo de dato String para declararlas y guardar información textual dentro de una variable. 

Ejemplo:

public class JavaStrings {
    public static void main(String[] args) {
        String nombre = "Carlos";
        String saludo = "Hola, " + nombre;
        int edad = 21;

        System.out.println(saludo);
        System.out.println("En dos años tendrá " + (edad + 2));
        System.out.println("Primera línea\\nSegunda línea");
        System.out.println("Nombre:\\t" + nombre);
    }
}

# 11.2 Concatenation 
La concatenación consiste en unir dos o más cadenas de texto para formar un solo mensaje. En Java se utiliza principalmente el operador +, que permite combinar palabras, espacios y variables para crear oraciones completas. 

Ejemplos:

public class StringConcatenation {
    public static void main(String[] args) {
        String nombre = "Ana";
        String apellido = "Lopez";
        System.out.println(nombre + " " + apellido);
    }
}

# 11.3 Numbers and Strings 
Java permite combinar números y cadenas de texto utilizando el operador +. Sin embargo, su comportamiento depende del tipo de dato: cuando se suman dos números, se realiza una operación matemática; cuando se combinan cadenas de texto o un número con una cadena, se produce una concatenación. 

Ejemplos:

public class NumbersAndStrings {
    public static void main(String[] args) {
        System.out.println("Suma: " + (10 + 5));
        System.out.println("Unión: " + 10 + 5);
    }
}

# 11.4 Special Characters 
Los caracteres especiales permiten incluir símbolos dentro de las cadenas de texto que normalmente podrían causar errores o tener un significado especial. Para utilizarlos, Java emplea la barra invertida (\), que permite representar comillas simples, comillas dobles, barras invertidas y saltos de línea, entre otros caracteres. 

Ejemplos:

public class SpecialCharacters {
    public static void main(String[] args) {
        System.out.println("Primera línea\nSegunda línea");
        System.out.println("Nombre:\tMaría");
        System.out.println("Ella dijo: \"Hola\"");
    }
}

# 11.5 StringBuilder
StringBuilder es una herramienta de Java que permite crear y modificar cadenas de texto sin tener que generar una nueva cadena cada vez que se realiza un cambio. Ofrece métodos como append() para agregar texto, insert() para insertar contenido y delete() para eliminar partes de una cadena. Es especialmente útil cuando se necesita modificar un texto varias veces. 

Ejemplos:

public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder mensaje = new StringBuilder("Hola");
        mensaje.append(" mundo");
        mensaje.insert(0, "Java: ");
        System.out.println(mensaje);
    }
}

# 12. Java Maht

# 12.1 Java Math
La clase Math proporciona métodos que permiten realizar operaciones matemáticas de manera sencilla. Entre sus funciones principales están Math.max(), que encuentra el número mayor; Math.min(), que encuentra el menor; Math.sqrt(), que calcula la raíz cuadrada; y Math.abs(), que obtiene el valor absoluto de un número.

Ejempos:

public class JavaMath {
    public static void main(String[] args) {
        System.out.println("Mayor: " + Math.max(15, 28));
        System.out.println("Menor: " + Math.min(15, 28));
        System.out.println("Raíz: " + Math.sqrt(81));
        System.out.println("Absoluto: " + Math.abs(-14));
        System.out.println("Potencia: " + Math.pow(2, 3));

        int aleatorio = (int) (Math.random() * 10) + 1;
        System.out.println("Aleatorio del 1 al 10: " + aleatorio);
    }
}

# 12.2 Math Methods
Java dispone de diferentes métodos matemáticos que permiten realizar cálculos más específicos, como elevar números a una potencia, redondear cantidades y trabajar con operaciones trigonométricas. Algunos de estos métodos son Math.pow(), Math.round(), Math.ceil() y Math.floor(). Cada uno cumple una función diferente y facilita la realización de cálculos dentro de un programa.

Ejemplos:

public class MathMethods {
    public static void main(String[] args) {
        System.out.println(Math.max(8, 12));
        System.out.println(Math.min(8, 12));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.abs(-20));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.round(4.6));
    }
}

# 12.3 Random Number
Java permite generar números aleatorios utilizando el método Math.random(), que devuelve un número decimal desde 0.0 (incluido) hasta un valor menor que 1. También se puede utilizar una fórmula para establecer un rango específico y obtener números enteros, por ejemplo, entre 0 y 100.

Ejemplos:

public class RandomNumber {
    public static void main(String[] args) {
        int dado = (int) (Math.random() * 6) + 1;
        System.out.println("Resultado del dado: " + dado);
    }
}

# 13. Java Booleans

# 13.1 Java Booleans
Los valores booleanos en Java permiten representar información que solamente tiene dos posibilidades: verdadero (true) o falso (false). Se utilizan para comprobar situaciones, evaluar condiciones y determinar si una afirmación se cumple o no dentro de un programa. Para trabajar con estos valores se utiliza el tipo de dato boolean.

Ejemplos:

public class JavaBooleans {
    public static void main(String[] args) {
        boolean esMayorDeEdad = true;
        boolean tienePermiso = false;

        int edad = 20;
        boolean edadSuficiente = edad >= 18;
        boolean puedeIngresar = edadSuficiente && tienePermiso;

        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        System.out.println("¿Tiene permiso? " + tienePermiso);
        System.out.println("¿Edad suficiente? " + edadSuficiente);
        System.out.println("¿Puede ingresar? " + puedeIngresar);
        System.out.println("¿10 es mayor que 5? " + (10 > 5));
    }
}

# 13.2 Boolean True/False
En Java, true representa una condición verdadera y false representa una condición falsa. Estos dos valores se utilizan para expresar resultados y comprobar diferentes situaciones dentro de un programa. Se escriben siempre en minúsculas y se asignan a variables de tipo boolean.

Ejemplos:

public class BooleanTrueFalse {
    public static void main(String[] args) {
        boolean encendido = true;
        boolean bloqueado = false;
        System.out.println(encendido);
        System.out.println(bloqueado);
    }
}

# 13.3 Boolean Expressions 
Las expresiones booleanas son operaciones que permiten evaluar condiciones y obtener como resultado true o false. Se utilizan operadores de comparación, como mayor que (>), menor que (<) e igual a (==), para comprobar si dos valores cumplen una determinada condición. También es posible guardar el resultado de una comparación en una variable booleana.

Ejemplos:

public class BooleanExpressions {
    public static void main(String[] args) {
        int nota = 8;
        boolean aprobado = nota >= 7;
        boolean excelente = nota >= 9;
        System.out.println("Aprobado: " + aprobado);
        System.out.println("Excelente: " + excelente);
    }
}

# 13.4 Boolean Real-Life Example 
Descripción: Los valores booleanos pueden aplicarse a situaciones cotidianas, como comprobar si una persona tiene la edad suficiente para votar. Mediante el operador de comparación >=, Java verifica si la edad de una persona es mayor o igual a la edad mínima requerida y devuelve un resultado verdadero o falso.

Ejemplos:

public class BooleanRealLifeExample {
    public static void main(String[] args) {
        int edad = 19;
        boolean tieneEntrada = true;
        boolean puedeEntrar = edad >= 18 && tieneEntrada;
        System.out.println("Puede ingresar: " + puedeEntrar);
    }
}


