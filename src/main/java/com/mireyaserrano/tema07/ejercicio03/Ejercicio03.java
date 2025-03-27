package com.mireyaserrano.tema07.ejercicio03;

import com.mireyaserrano.tema07.lib.IO;
import java.util.ArrayList;

public class Ejercicio03 {

    public void ej3(){
        try {
            double num;
            boolean salir = false;
            ArrayList<Double> numeros = new ArrayList<>();
            do {
                try {
                    num = IO.solicitarNumero();
                    numeros.add(num);
                } catch (NumberFormatException nfe) {
                    if (nfe.getMessage().equals("empty String")) {
                        System.err.println("Introduce un número por favor!");
                    } else {
                        salir = true;
                    }
                }
            } while (!salir);
            double numMasAlto = numeros.get(0);
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) > numMasAlto) {
                    numMasAlto = numeros.get(i);
                }
            }

            System.out.println("El número introducido más alto es " + numMasAlto);
        }catch (IndexOutOfBoundsException ioobe){
            System.err.println("No se han introducido números");
        }
    }
}
