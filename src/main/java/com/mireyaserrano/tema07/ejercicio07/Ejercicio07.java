package com.mireyaserrano.tema07.ejercicio07;

public class Ejercicio07 {

    public static void main(String[] args){
        String[] array = {"hola", "perro", null, "gato"};
        mostrarCadenasArray(array);
    }

    public static void mostrarCadenasArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println(array[i].trim().charAt(0));
            }catch (NullPointerException npe){
                System.out.printf("El índice %d es null\n", i);
            }
        }
    }

}
