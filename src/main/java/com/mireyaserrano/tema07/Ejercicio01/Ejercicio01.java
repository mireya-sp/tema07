package com.mireyaserrano.tema07.Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public double[] solicitarNumeros(){
        Scanner scanner = new Scanner(System.in);
        double[] arrayNumeros;
        double num = 0;
        int cantNum = 0;
        String numeros = "";
        do {
            try {
                System.out.println("Introduce un número");
                num = Double.parseDouble(scanner.nextLine());
                if (num >= 0) {
                    numeros += num + " ";
                    cantNum++;
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Solo número porfa");
            }
        } while (num >= 0);
        arrayNumeros = new double[cantNum];
        String[] numerosSplit = numeros.split(" ");
        for (int i = 0; i < numerosSplit.length; i++) {
            arrayNumeros[i] = Double.parseDouble(numerosSplit[i]);
        }
        return arrayNumeros;
    }
}
