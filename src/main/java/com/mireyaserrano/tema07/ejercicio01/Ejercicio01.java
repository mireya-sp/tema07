package com.mireyaserrano.tema07.ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

    /**
     * Pide números hasta que se introduce un número negativo, si se introducen letras mete excepción
     * @param mensaje El mensaje que muestra para introducir números
     * @return el array con los números que se han introducido
     */
    public double[] solicitarNumeros(String mensaje){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double numero = 0;
        do {
            try {
                System.out.println(mensaje);
                numero = Double.parseDouble(scanner.nextLine());
                if (numero >= 0) {
                    numeros.add(numero);
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Sólo números por favor!");
                numero = 1;
            }
        } while (numero >= 0);
        double[] valores = new double[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            valores[i] = numeros.get(i);
        }
        return valores;
    }
}
