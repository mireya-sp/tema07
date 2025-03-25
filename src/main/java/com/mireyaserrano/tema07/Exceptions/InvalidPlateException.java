package com.mireyaserrano.tema07.Exceptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateException extends InvalidPropertiesFormatException {
    public InvalidPlateException(String mensaje){
        super(mensaje);
    }
}
