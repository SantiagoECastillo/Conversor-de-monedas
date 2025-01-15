
import Modelo.ConvertidorMoneda;
import Modelo.Moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ConvertidorMoneda convertidor = new ConvertidorMoneda();
        int opcion = 0;
        while(opcion != 7){
            System.out.println("*********************************");
            System.out.println("""
                    1) Dolar a Peso Argentino
                    2) Peso Argentino a Dolar
                    3) Dolar a Real brasileño
                    4) Real brasileño a Dolar
                    5) Dolar a Peso Colombiano
                    6) Peso Colombiano a Dolar
                    7) Salir
                    """);
            System.out.println("Elija la opcion valida:");
            System.out.println("*********************************");
            opcion = Integer.valueOf(lector.nextLine());

//            System.out.println("Ingrese el valor que deseas convetir:");
//            double valorBase = Double.valueOf(lector.nextLine());

            switch (opcion){
                case 1:
                    convertidor.convertirMoneda("USD", "ARS");
                    break;
                case 2:
                    convertidor.convertirMoneda("ARS", "USD");
                    break;
                case 3:
                    convertidor.convertirMoneda("USD", "BRL");
                    break;
                case 4:
                    convertidor.convertirMoneda("BRL", "USD");
                    break;
                case 5:
                    convertidor.convertirMoneda("USD", "COP");
                    break;
                case 6:
                    convertidor.convertirMoneda("COP", "USD");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese una opcion valida\n");
            }
        }

    }
}