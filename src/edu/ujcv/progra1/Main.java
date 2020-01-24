package edu.ujcv.progra1;

import java.awt.*;

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


public class Main {


    public static void main(String[] args) {
	// write your code here

//        for(int i = 0; i < 3; i++) {
//            System.out.println("Hola osos!!!");
//            System.out.println("hoy es miercoles");
//        }


        int[] arreglo = {9,3,3,4,3,46,52,3,4,3,4};
        int ultimoArreglo = arreglo.length - 1;




        int[] temporal = new int[arreglo.length + 1];
        temporal[temporal.length - 1] = 5;

        for (int i = 0; i < arreglo.length; i++) {
            temporal[i] = arreglo[i];
        }

        arreglo = temporal;
        ultimoArreglo = arreglo.length - 1;



        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[ultimoArreglo - i]);
        }
        boolean esViernes = false;
        int x = 2;

        for (int i = 0 ; i < 3; i++) {
            esViernes = !esViernes;
            x++;
            if (x >= 4) {
                System.out.println("Hola osos!!!");


                if (esViernes) {
                    System.out.println("hoy es viernes!! :)");
                } else {
                    System.out.println("hoy no es viernes D:");
                }
            }
        }



    }
}
