package com.mireyaserrano.tema07.ejercicio05;

import com.mireyaserrano.tema07.lib.IO;

import java.util.Arrays;

public class Ejercicio05 {

    private static Alumno[] alumnos = new Alumno[2];

    public static void main(String[] args){
        alumnos[0] = crearAlumno();
        alumnos [1] = crearAlumno();
        System.out.println(Arrays.toString(alumnos));
        int edadMayor = 0;
        Alumno alumnoMayor = null;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getEdad() > edadMayor){
                alumnoMayor = alumnos[i];
            }
        }
        System.out.println(alumnoMayor);
    }

    public static Alumno crearAlumno(){
        String nombre = IO.leerString("Introduce el nombre del alumno",2, 20);
        int edad = IO.leerEntero("Introduce la edad del alumno", 0, 99);
        double altura = IO.leerDoubles("Introduce la altura del alumno", 0, 300);
        return new Alumno(nombre, edad, altura);
    }
}
