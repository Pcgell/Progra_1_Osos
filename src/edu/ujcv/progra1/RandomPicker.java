package edu.ujcv.progra1;

import java.util.Random;

public class RandomPicker {




    public static final String[] osos = {
            "Kiana C.",
            "Hector T.",
            "Ariel T.",
            "Fernando C.",
            "Jonathan L.",
            "Andrew R.",
            "Josias F.",
            "Renan S.",
            "Ricardo H.",
            "Cristian M.",
            "Yansi F."};


    public static String escogerAlumnoAleatorio(){
        Random r = new Random();

        int index = r.nextInt(osos.length);
        //index =  Math.abs(index) % 11;
        return osos[index] ;
    }

}
