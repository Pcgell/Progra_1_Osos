package edu.ujcv.progra1;

public class Pila<T> {
    DinArray<T> datos;

    public Pila(){
        datos = new DinArray<T>();
    }

    public void push(T element){
       datos.add(element);
    }

    public T pop(){
        return datos.remove();
    }

    public T peek(){
        return datos.get(datos.getSize() - 1);
    }

    public boolean isEmpty(){
        if (datos.getSize() == 0)
            return true;
        return false;
    }
}
