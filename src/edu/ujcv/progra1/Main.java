package edu.ujcv.progra1;

// @author:  kenneth.vittetoe@ujcv.edu.hn

import javax.swing.text.Utilities;
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
        VecR2 a = new VecR2(2,3);


        VecR2 b = new VecR2(-5,7);



        System.out.println(String.format("la magnitude del vector i: %.2f y j:  %.2f es :%.2f",a.getI(),a.getJ(),a.getMagnitude()));
        VecR2 unitario = a.normal();
        System.out.println(String.format("la magnitude del vector i: %.2f y j:  %.2f es :%.2f",unitario.getI(),unitario.getJ(),unitario.getMagnitude()));

        /*
        VecR2 resultado =  VecR2.suma(VecR2.suma(b,a),unitario);
        /*/

         VecR2 resultado =  a.suma(b).suma(unitario);
         //*/

        System.out.println(String.format("el vector i: %.2f y j:  %.2f"
                ,resultado.getI(),resultado.getJ()));



    }

    // defina un metodo que intercambie los valores de dos enteros.


    //public static "tipo retorno"  "nombre valido descriptivo"  "lista de argumentos "

    public static void swap (Integer a, Integer b){

        // a: 5    b:  3
       a = a + b; // a: 8 b: 3
       b = a - b; // a: 8 b: 5
       a = a - b; // a : 3 b: 5

    }

    // defina un metodo que reciba dos arreglos ordenados y devuelva un arreglo ordenado.
    // a :1,3,5,7
    // b :2,4,6

    // c :1,2,3,4,5,6,7

    public static int[] combinarArreglos(int[] a, int[] b){
        /*
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i+ a.length]= b[i];
        }

        for (int i = 0; i <c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if(c[i] < c[j]){
                    swap(c[i],c[j]);
                }
            }
        }
        return c;
        /*/

        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        for (; i < a.length && j < b.length && k < c.length; k++) {
            if (a[i] < b[j]) {
                c[k] = a[i++];
            }else{
                c[k] = b[j++];
            }
        }

        if(i < a.length){
            for (; i < a.length ; i++) {
                c[k++] = a[i];
            }
        }else{
            for (; j < b.length ; j++) {
                c[k++] = b[j];
            }
        }



        return c;
        //*/
    }
}
