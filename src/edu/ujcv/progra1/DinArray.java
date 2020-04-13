package edu.ujcv.progra1;

import java.util.Stack;

public class DinArray <T> {

    private T[] datos;

    private int size;


    private void crecer() {
        T[] temp = (T[]) new Object[datos.length * 2];

        for (int i = 0; i <datos.length; i++) {
            temp[i] = datos[i];
        }

        datos = temp;
    }


    DinArray(){
        datos = (T[])new Object[32];
        size = 0;
    }

    public T get(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException(index+" es mayor a la capacidad del arreglo");
        }
        return datos[index];
    }

    public void add(T element){
        if(size >= datos.length){
            crecer();
        }

        datos[size++] = element;
    }

    public void addAtIndex(T element, int index){
        if(index > size){
            throw new IndexOutOfBoundsException(index+" esta fuera de rango del arreglo ");
        }

        size++;
        if(size >= datos.length){
            crecer();
        }

        T temp = datos[index];
        datos[index] = element;
        for (int i = index + 1 ; i <size ; i++) {
            element = datos[i];
            datos[i] = temp;
            temp = element;

        }

    }


    public int getSize(){
        return size;
    }

    public void set(T element,int index){
        if(index >= size){
            throw new IndexOutOfBoundsException(index+" es mayor a la capacidad del arreglo");
        }
        datos[index] = element;
    }


    public T remove(){
        return datos[--size];
    }

}
