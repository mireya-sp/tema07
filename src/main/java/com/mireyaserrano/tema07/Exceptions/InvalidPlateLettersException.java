package com.mireyaserrano.tema07.Exceptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateLettersException extends InvalidPropertiesFormatException {
    public InvalidPlateLettersException(String mensaje){
        super(mensaje);
    }
}
