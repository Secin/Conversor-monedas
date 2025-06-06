package com.alura.conversormodenas.principal;

import com.alura.conversormodenas.modelo.Consultaapi;
import com.alura.conversormodenas.modelo.Conversion;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Consultaapi consulta = new Consultaapi();

        int opc = 0;
        while(opc != 9){
            System.out.println("****************************\n"+
                    "Bienvenido: Convierte tu Moneda\n\n"+
                    "Elige la Conversion de moneda a realizar:\n\n"+
                    "1) Dólar ->> Peso Argentino\n"+
                    "2) Peso Argentino ->> Dólar\n"+
                    "3) Dólar ->> Real Brasileño\n"+
                    "4) Real Brasileño ->> Dólar\n"+
                    "5) Dólar ->> Peso Colombiano\n"+
                    "6) Peso Colombiano ->> Dólar\n"+
                    "7) Dolar ->> Soles\n"+
                    "8) Soles ->> Dolar\n"+
                    "9) Salir\n\n"+
                    "Ingrese la opción aquí: "
                    );
            opc = lectura.nextInt();
            lectura.nextLine();

            switch (opc){
                case 1:
                    Conversion.convertir("USD","ARS",consulta,lectura);
                    break;
                case 2:
                    Conversion.convertir("ARS","USD",consulta,lectura);
                    break;
                case 3:
                    Conversion.convertir("USD","BRL",consulta,lectura);
                    break;
                case 4:
                    Conversion.convertir("BRL","USD",consulta,lectura);
                    break;
                case 5:
                    Conversion.convertir("USD","COP",consulta,lectura);
                    break;
                case 6:
                    Conversion.convertir("COP","USD",consulta,lectura);
                    break;
                case 7:
                    Conversion.convertir("USD","PEN",consulta,lectura);
                    break;
                case 8:
                    Conversion.convertir("PEN","USD",consulta,lectura);
                    break;
                case 9:
                    System.out.println("****Saliendo del sistema***");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;

            }

        }


    }
}