package edu.ujcv.progra1;

import java.util.Random;

public class RandomPicker {




    public static final String[] voluntarios = {
            "Kiana C.",
            "Hector T.",
            "Ariel T.",
            "Fernando C.",
            "Jonathan L.",
            "Allison P.",
            "Andrew R.",
            "Josias F.",
            "Renan S.",
            "Ricardo H.",
            "Cristian M.",
            "Kathya M.",
            "Lizzy L",
            "Yansi F."};


    public static String escogerAlumnoAleatorio(){
        Random r = new Random();

        int index = r.nextInt(voluntarios.length);
        //index =  Math.abs(index) % 11;
        return voluntarios[index] ;
    }

}
