package com.mireyaserrano.tema07.Exceptions;

import java.util.InvalidPropertiesFormatException;

public class IvalidPlateLengthException extends InvalidPropertiesFormatException {
    public IvalidPlateLengthException(String mensaje){
        super (mensaje);
    }
}
