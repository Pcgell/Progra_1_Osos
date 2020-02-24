package edu.ujcv.progra1;

public class Mat2x2 {

   // double m11,m12;
   // double m21,m22;

   // double[][] mat = new double[2][2];

    private VecR2 col1;// i -> m11   j -> m21
    private VecR2 col2;// i -> m12   j -> m22


    public VecR2 getColumna1(){
        return col1;
    }

    public VecR2 getFila1(){
        return new VecR2(col1.getI(),col2.getI());
    }
    public void setCol1(VecR2 b){
        col1 = new VecR2(b);
    }
    public void setFila1(VecR2 fila){
        col1.setI(fila.getI());
        col2.setI(fila.getJ());
    }
    public VecR2 getColumna2(){
        return col2;
    }
    public VecR2 getFila2(){
        return new VecR2(col1.getJ(),col2.getJ());
    }

    public void setCol2(VecR2 col2){

       this.col2 = new VecR2(col2);

    }


    public Mat2x2(VecR2 col1, VecR2 col2) {
        this.col1 = col1;
        this.col2 = col2;
    }

    public Mat2x2() {

    }

    public Mat2x2 negacion(){
        Mat2x2 retval = new Mat2x2();
        retval.col1 = this.col1.negacion();
        retval.col2 = this.col2.negacion();
        return retval;
    }

    public static Mat2x2 getIdentidad(){
        VecR2 col1 = new VecR2(1,0);
        VecR2 col2 = new VecR2(0,1);
        return  new Mat2x2(col1,col2);
    }
}
