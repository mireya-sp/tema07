package com.mireyaserrano.tema07.ejercicio06;

public class Ejercicio06 {

    public static void main(String[] args){
        int num = 2;
        int[] array = {-2, -1, 0, 1, 2};
        dividirEntreArrayReescrito(num, array);
    }

    public static void dividirEntreArray(int num, int[] array){
        for (int i = 0; i < array.length; i++) {
            try {
                int resultado = num / array[i];
                System.out.printf("%d / %d = %d\n", num, array[i], resultado);
            }catch (ArithmeticException ae){
                System.out.println("El cero no es divisible");
            }
        }
    }

    public static void dividirEntreArrayReescrito(int num, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                System.out.printf("%d / %d = %d\n", num, array[i], (num / array[i]));
            }
        }
    }
}
