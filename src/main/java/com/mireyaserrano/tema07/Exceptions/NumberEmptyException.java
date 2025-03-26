package com.mireyaserrano.tema07.Exceptions;

public class NumberEmptyException extends NumberFormatException {
    public NumberEmptyException(String message) {
        super(message);
    }
}