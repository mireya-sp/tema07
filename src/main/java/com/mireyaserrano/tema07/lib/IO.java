package com.mireyaserrano.tema07.lib;

import com.mireyaserrano.tema07.Exceptions.InvalidPlateException;
import com.mireyaserrano.tema07.Exceptions.InvalidPlateLettersException;
import com.mireyaserrano.tema07.Exceptions.InvalidPlateNumberException;
import com.mireyaserrano.tema07.Exceptions.IvalidPlateLengthException;

import java.util.Scanner;

public class IO {
    private static final Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje, int minLength, int maxLength) {
        boolean valido;
        String valor;
        do {
            System.out.println(mensaje);
            valor = scanner.nextLine();
            int length = valor.length();
            valido = length >= minLength && length <= maxLength;
            if (!valido) {
                System.out.printf("La longitud debe de estar entre %d y %d\n", minLength, maxLength);
            }
        } while (!valido);
        return valor;
    }

    /*
    public static void parsearMatricula(String matricula) throws InvalidPlateException {
        if (!validarMatricula(matricula)){
            throw new InvalidPlateException("La matrícula no es válida");
        }
    }
    */


    public static boolean validarMatricula(String matricula) throws IvalidPlateLengthException, InvalidPlateException, InvalidPlateLettersException {
        int i;
        if (matricula.length() != 8) {
            throw new IvalidPlateLengthException("La matrícula debe tener 8 caracteres");
        }
        for (i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                throw new InvalidPlateNumberException("La matrícula debe tener 4 números");
            }
        }
        if (!Character.isWhitespace(matricula.charAt(i++))) {
            throw new InvalidPlateException("La matrícla debe tener un espacio entre los números y las letras");
        }
        for (int j = i; j < matricula.length(); j++) {
            if (!Character.isLetter(matricula.charAt(j))) {
                throw new InvalidPlateLettersException("La matrícula debe tener 3 letras");
            }
        }
        return true;
    }
}