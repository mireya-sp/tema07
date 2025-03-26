package com.mireyaserrano.tema07;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args){
        int[] array = new int[5];
        ej4(array);
    }

    public static void ej4(int[] numeros){
        int num;
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < numeros.length; i++) {
                try {
                    System.out.println("Introduce un número");
                    num = Integer.parseInt(scanner.nextLine());
                    numeros[i] = num;
                } catch (NumberFormatException nfe) {
                    System.err.println("Inserta solo números por favor");
                    i--;
                } catch (IndexOutOfBoundsException ioobe) {
                    System.err.println("El array está lleno");
                    break;
                }
            }
        }catch (NullPointerException npe){
            System.err.println("El array no está creado");
        }
        System.out.println(Arrays.toString(numeros));
    }
}
