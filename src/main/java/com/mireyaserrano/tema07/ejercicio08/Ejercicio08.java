package com.mireyaserrano.tema07.ejercicio08;

import java.util.Arrays;

public class Ejercicio08 {
    public static void main(String[] args){
        int[] numeros = null;

        try {
            System.out.println("Divido un entero entre cero (Salta ArithmeticExcetion)");
            System.out.println(5 / 0);
        }catch (ArithmeticException ae){
            System.err.println("ArithmeticException");
        }
        try {
            System.out.println("Intento imprimir un elemento del array null (NullPointerExceptions)");
            System.out.println(numeros[0]);
        }catch (NullPointerException npe){
            System.err.println("NullPointerException");
        }
        numeros = new int[3];
        try {
            System.out.println("numeros[7] = 3  (IndexOutOfBounds)");
            numeros[7] = 3;
        }catch (IndexOutOfBoundsException ioobe){
            System.err.println("IndexOutOfBounds");
        }


    }
}
