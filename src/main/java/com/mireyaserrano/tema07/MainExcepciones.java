package com.mireyaserrano.tema07;

import com.mireyaserrano.tema07.Ejercicio01.Ejercicio01;
import com.mireyaserrano.tema07.Exceptions.InvalidPlateException;
import com.mireyaserrano.tema07.Exceptions.InvalidPlateLettersException;
import com.mireyaserrano.tema07.Exceptions.IvalidPlateLengthException;
import com.mireyaserrano.tema07.lib.IO;

import java.util.Arrays;
import java.util.Scanner;

public class MainExcepciones {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio01 ej1 = new Ejercicio01();
        System.out.println(Arrays.toString(ej1.solicitarNumeros("Introduce un número")));

        /*
        String matricula = IO.leerString("Dime la matrícula", 8, 8);
        try{
            IO.validarMatricula(matricula);
        }catch (InvalidPlateException ipe){
            System.out.println(ipe);
        } catch (InvalidPlateLettersException iple) {
            System.out.println(iple);
        } catch (IvalidPlateLengthException iplne) {
            System.out.println(iplne);
        }
        */

        /*
        int numero = leerEntero("Dime un número", 0, 100);

        try {
            int numero2 = leerEnteroPasandoLaPelota("Dime otro número", 0, 100);
        } catch (NumberFormatException nfe) {
            System.err.println("Sólo números por favor");
        }

        System.out.println(numero);
        */

    }

    /**
     *
     * @param mensaje
     * @param min
     * @param max
     * @return
     * @throws NumberFormatException
     */
    public static int leerEnteroPasandoLaPelota(String mensaje, int min, int max) {
        boolean valido;
        int numero;
        System.out.println(mensaje);
        numero = Integer.parseInt(scanner.nextLine());
        valido = numero >= min && numero <= max;
        if (!valido) {
            System.err.println("El número debe estar entre " + min + " y " + max);
        }
        return numero;
    }


    public static int leerEntero(String mensaje, int min, int max) {
        boolean valido = false;
        int numero = Integer.MIN_VALUE;
        do {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                valido = numero >= min && numero <= max;
                if (!valido) {
                    System.err.println("El número debe estar entre " + min + " y " + max);
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Sólo números por favor");
            }
        } while (!valido);
        return numero;
    }

}