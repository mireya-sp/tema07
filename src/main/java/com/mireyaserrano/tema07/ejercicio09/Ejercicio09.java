package com.mireyaserrano.tema07.ejercicio09;

import com.mireyaserrano.tema07.Exceptions.InvalidCeroException;
import com.mireyaserrano.tema07.Exceptions.InvalidIndexArrayException;
import com.mireyaserrano.tema07.Exceptions.InvalidPointnTException;

public class Ejercicio09 {
    public static void main(String[] args){
        int[] numeros = null;

        try {
            System.out.println("Divido un entero entre cero (Salta ArithmeticExcetion)");
            System.out.println(5 / 0);
        }catch (ArithmeticException ae){
            throw new InvalidCeroException("No se puede dividir un entero entre cero");
        }
        try {
            System.out.println("Intento imprimir un elemento del array null (NullPointerExceptions)");
            System.out.println(numeros[0]);
        }catch (NullPointerException npe){
            throw new InvalidPointnTException("Es null Bro");
        }
        numeros = new int[3];
        try {
            System.out.println("numeros[7] = 3  (IndexOutOfBounds)");
            numeros[7] = 3;
        }catch (IndexOutOfBoundsException ioobe){
            throw new InvalidIndexArrayException("No hay tanto en el array bruh");
        }
    }
}
