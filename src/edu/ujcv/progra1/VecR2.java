package edu.ujcv.progra1;

// public
// package - por defecto.
// protected
// private

// TDA : conjunto de operaciones que afectan un conjunto de datos.
// Algoritmo : serie de pasos que affecta un estado para realizar un determinado problema.

//programacion orientada a objetos.(poo) (oop)

// 1. encapsulacion
// 2. herencia
// 3. polymorfismo

// Objetos: TDA + encapsulacion(estratificacion o contencion). //small talk.
// miembros privados - datos privados
// acceso a los miembros
// mutacion de los miembros
// inicializar el estado del objeto

//VecR2 VecR3 VecR4

public class VecR2 {

    private double i; // x
    private double j; // y

// conveniencia
    public VecR2(double i, double j){
        this.i = i;
        setJ(j);
    }
    // por defecto
    public VecR2(){

    }

    public VecR2(VecR2 b){
        this.i = b.i;
        this.j = b.j;
    }

//accesoras o geters
    public double getI(){
        return i;
    }

    public double getJ(){
        return j;
    }
//mutadoras o seters
    public void setI(double i){
        this.i = i;
    }

    public void setJ(double j){
        this.j = j;
    }


    double getMagnitude(){
        // pitagoras
        // c  = sqrt(a ^2 + b ^2)

        return  Math.sqrt( dotProduct(this));
    }

    VecR2 normal(){
        VecR2 direccion = new VecR2(i,j);
        direccion.i /= getMagnitude();
        direccion.j /= getMagnitude();
        return direccion;
    }

    static VecR2 suma (VecR2 a, VecR2 b){
       return  new VecR2(a.i + b.i, a.j + b.j);

    }

    VecR2 suma ( VecR2 b){
        VecR2 retval = new VecR2(0,0);

        // retval.i = i + b.i;
        retval.setI(this.i + b.i);
        retval.setJ(getJ() + b.getJ());

        return retval ;
    }

    public VecR2 resta(VecR2 b){
        return this.suma(b.negacion());
    }

    public VecR2 negacion(){
        VecR2 retval = new VecR2(-this.i,-this.j);
        return retval;
    }


    public double dotProduct(VecR2 b){


       return this.i * b.i + this.j * b.j;

    }


}
