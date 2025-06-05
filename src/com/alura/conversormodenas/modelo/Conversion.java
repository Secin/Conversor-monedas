package com.alura.conversormodenas.modelo;

import java.util.Scanner;

public class Conversion {

    public static void convertir(String monedaBase, String monedaTarget, Consultaapi consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy: \n"+monedaBase+" = "+moneda.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la cantidad de "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println("El resultado de la conversión es: "+cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+moneda.target_code());
    }





}