package edu.ujcv.progra1;

// @author:  kenneth.vittetoe@ujcv.edu.hn

import java.util.Scanner;

// *asumimos que la arquitectura es de 32 bits.
// tipos de dato primitivos son conjuntos de bits
// P:tipos de dato primitivos en java?
//      R: byte, char, short, boolean, int, float, double,  long     *
//           8     8    16       32     32    32      64      64
// P:para que sirve el depurador?
//      R: depurar paso a paso el programa
// P:que es una prueba de escritorio?
//      R: simular un depurador a mano
// P:cuales son las partes de la memoria ram(en el contexto de un programa)?
//      R: 'stack o pila' y 'heap o cola de prioridad'

// Operadores:
//    ((=)  (- + * / %)  (++ -- += -= *= /=)) '(' ')'  '[]'  == != > < <= >= && ||  !   & | ^ &= |= ^=


//commandos o expresiones.
//  ciclos   for,  while  do while
//  condiciones
// if
// if else
// switch

// Arreglos
// 1. tipo de dato (puede ser primitivo o Objeto)
// 2. abrimos y cerramos corchetes
// 3. un nombre valido
// 4. le asignamos un valor
// null
// lista de asignacion que es representada por llaves con valores separado por coma
// utilizando la palabra clave new para definir un arreglo de 0s de un tamano especifico

//      ejercicio 1
// dado dos arreglos (1,2,3) y (11,22,33) cree un arreglo que contenga los valores intercalados
//        (1,11,2,22,3,33)


// Proyecto 1 Caluladora
// *debe sumar restar multiplicar y dividir
// *debe tener una interface por consola con un menu
// *debe operar con numeros de punto flotante.
// *los resultados deben de tener 2 numeros despues del punto.
// *debe de tener una opcion en el menu pricipal para salir.
// * no debe de dejar de ejecutar repentinamente.

// Proyecto 2 Car Wash
// una empresa de carwash dedesea comisionar la creacion de un sistema de ventas.
// ofrece 3 servicios.
//   1. Lavado sencillo    L.100 exempto de impusetos
//   2. Lavado y aspirado  L.150
//   3. Lavado de motor.   L.300
//   4. salir.

// el cliente va a poder escoger entre una de las primeras dos opciones y la tercera.

// caer en otra pantallan upsale. debe tener 5 productos mas
// 1.aromatizantes
// 2.comida
// 3. ...
// 4.cancelar



// 1.debe de pedir nombre y RTN
// 2.cancelar

// y debe de presentar en la factuara debe de presentar
// *el nombre de el negocio
// *el cai del negocio
// *el numero de factura
// *el nombre de la persona o consumidor final
// *numero de RTN o RTN consumidor final 0000-0000-00000-0
// *lista de los productos y precios
// subtotal
// Impuestos
// Total.
// presione cualquier tecla para continuar..


// Metodos o funciones
// *generalmente retornan un solo valor. pueden retornar void.
//    tipos de dato primitivos, Objetos, o void
// * generalmente tienen Parametros o argumentos
//   tipos de dato primitivos, Objetos
// *Tiene un Nombre valido
//   que significa un nombre valido
//      1. 'nombre' y 'lista de argumenots' unica
//      2.  los nombres no pueden empezar con numeros.
//      3. no pueden empezar con symbolos especiales con excepto por el gion bajo
// *tienen un cuerpo delimitado por llaves  {}
//  --en java deben ir dentro de una clase.


// instanciacion de objetos.
// los objetos se instancian utilizando la palabra clave new
// Integer n = new Integer(5);
// Scanner sc = new Scanner(System.in);


// la palabra clave static
// se puede utilizar en los miembrios de una
// utilizado con metodos los metodos se vuelven metodos de la clase y no de la instancia.
// utilizado con variables. la variable se vuelve una varaible compartida por todas las instancias.




public class Main {
    static double pi = 33;

    public  int suma (int a, int b){

        return a + b;
    }

    public static void metodo(int d){

        Main m = new Main();
        int resultado = m.suma(4,d);
        if(resultado > 6){
            return;
        }
        System.out.println("estamos ejecutando la linea 112!!");
    }


    public static void main(String[] args) {

        Main m  = new Main();

        Integer n = 5;

        int y = n;


        LectorTeclado lt = LectorTeclado.getInstance();

        System.out.println("ingrese un numero entero");
        int x = lt.obtenerEntero(5,"ingreso algo que no es numero se usara 5");

        System.out.println("ingrese otro numero");
        int b = lt.obtenerEntero(5,"ingreso algo que no es numero se usara 5");

        int c = m.suma(b,x);

        metodo(c);

        System.out.println(String.format("la suma de %d y %d es %d",b,x,c));



        String alumno1 = RandomPicker.escogerAlumnoAleatorio();

        String alumno2 = RandomPicker.escogerAlumnoAleatorio();

        while(alumno1.equals(alumno2)){
            alumno2 = RandomPicker.escogerAlumnoAleatorio();
        }


        System.out.print(alumno1);

        System.out.println(" vs "+alumno2);


    }


}
