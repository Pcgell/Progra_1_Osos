package edu.ujcv.progra1;

public class DinArray {

    private int[] datos;

    private int size;


    private void crecer() {
        int[] temp = new int[datos.length * 2];
        //int[] temp = new int[datos.length + 1];

        for (int i = 0; i <datos.length; i++) {
            temp[i] = datos[i];
        }

        datos = temp;
    }


    DinArray(){
        datos = new int[32];
        size = 0;
    }

    public int get(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException(index+" es mayor a la capacidad del arreglo");
        }
        return datos[index];
    }

    public void add(int element){
        if(size >= datos.length){
            crecer();
        }

        datos[size++] = element;
    }


    public int getSize(){
        return size;
    }

    public void set(int element,int index){
        if(index >= size){
            throw new IndexOutOfBoundsException(index+" es mayor a la capacidad del arreglo");
        }
        datos[index] = element;
    }


    public int remove(){
        return datos[--size];
    }

}
