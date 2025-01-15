package Modelo;

import java.util.Scanner;

public class ConvertidorMoneda {
    public void convertirMoneda(String monedaBase, String monedaDeCambio){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor que deseas convetir:");
        double cantidadACambiar = Double.valueOf(lector.nextLine());

        ConsultarMoneda consultar = new ConsultarMoneda();
        Moneda moneda = consultar.obtenerConversion(monedaBase, monedaDeCambio, cantidadACambiar);
        System.out.println("El valor de " + cantidadACambiar
                + "[" + moneda.base_code() + "] corresponde a valor final de =>> "
                + moneda.conversion_result() + " [" + moneda.target_code() + "] \n"
        );
    }
}
