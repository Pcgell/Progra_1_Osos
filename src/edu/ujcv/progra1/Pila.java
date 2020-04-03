package edu.ujcv.progra1;

public class Pila<T> {
    DinArray<T> datos;

    public Pila(){
        datos = new DinArray<T>();
    }

    public void push(T element){
        //if ocupa crecer

       datos.add(element);
    }

    public T pop(){
        return datos.remove();
    }

    public T peek(){
        return datos.get(datos.getSize() - 1);
    }
}
