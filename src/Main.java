import Modelo.ConsultarMoneda;
import Modelo.ConvertidorMoneda;
import Modelo.Moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ConvertidorMoneda convertidor = new ConvertidorMoneda();
        String monedaBase;
        String monedaCambio;

        int opcion = 0;
        while(opcion != 7){
            System.out.println("*********************************");
            System.out.println("1) Dolar a Peso Argentino\n" +
                    "2) Peso Argentino a Dolar\n" +
                    "3) Dolar a Real brasileño\n" +
                    "4) Real brasileño a Dolar\n" +
                    "5) Dolar a Peso Colombiano\n" +
                    "6) Peso Colombiano a Dolar\n" +
                    "7) Salir\n");
            System.out.println("Elija la opcion valida:");
            System.out.println("*********************************");
            opcion = Integer.valueOf(lector.nextLine());

            System.out.println("Ingrese el valor que deseas convetir:");
            double valorBase = Double.valueOf(lector.nextLine());

            switch (opcion){
                case 1:
                    monedaBase = "USD";
                    monedaCambio = "ARS";
                    break;
                case 2:
                    monedaBase = "ARS";
                    monedaCambio = "USD";
                case 3:

            }

//            Moneda convertidorMoneda = convertidor.obtenerConversion(monedaBase, monedaCambio, valorBase);
//            System.out.println("El valor " + valorBase + "[USD] corresponde al valor final de =>>" + convertidorMoneda.conversion_result());

        }

    }
}