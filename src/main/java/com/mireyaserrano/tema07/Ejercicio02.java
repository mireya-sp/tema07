package com.mireyaserrano.tema07;

import java.util.Scanner;

public class Ejercicio02 {
    public void numMasAlto(){
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        int contador = 0;
        int contadorExcepciones = 0;
        double num;
        do{
            try{
                System.out.printf("Introduce el numero de la posición %d", contador);
                num = Double.parseDouble(scanner.nextLine());
                contador++;
            }catch (NumberFormatException nfe){
                System.out.println("Pon un NÚMERO de nuevo por favor!");
                contadorExcepciones++;
            }
        }while (contador < 10);

        double numMasAlto = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numMasAlto){
                numMasAlto = numeros[i];
            }
        }
        System.out.println("El número más alto es " + numMasAlto);

        System.out.printf("Las excepciones han saltado %d veces", contadorExcepciones);
    }
}
