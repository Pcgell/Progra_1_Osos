package edu.ujcv.progra1;

import java.util.Scanner;

public class LectorTeclado {

    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);

        System.out.println("desea sumar?? \n 1. si\n 2.no");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:{
                System.out.println("ingrese el valor del primer entero");

                int x  = sc.nextInt();

                System.out.println("ingrese el valor del segundo entero");

                int y = sc.nextInt();

                int sumaXY =  suma(x,y);

                System.out.println(String.format("suma de %d y %d da %d",x,y,sumaXY));

                System.out.println("precione cualquer Enter para continuar ...");
                sc.next();
            } break;
            case 2:
            default:
        }


    }

    public static int suma (int a, int b){
        int retval;
        retval = a + b;

        return retval;
    }
}
