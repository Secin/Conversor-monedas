package com.alura.conversormodenas.excepcion;

public class ErrorEnConversionMonedaException extends RuntimeException {

    private String mensaje;

    public ErrorEnConversionMonedaException(String message) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return this.mensaje;
    }
}
