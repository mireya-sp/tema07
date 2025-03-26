package com.mireyaserrano.tema07.Ejercicio05;

public class Alumno {
    private final String nombre;
    private final int edad;
    private final double altura;

    public Alumno(String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura + "m" +
                '}';
    }
}
