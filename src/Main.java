import com.alura.modelos.Menus;
import com.alura.modelos.Monedas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int seleccion = 0;
        int opcion = 0;
        int opcion2 = 0;

        double cantidad, resultado, cantidadUSD;
        Monedas monedas = new Monedas();
        double dolarHoy = monedas.getDolarHoy();
        Menus menus = new Menus();
        String menuAmonedas = menus.getMenuAmonedas();
        String menuPrin = menus.getMenu1();
        String menuaDolar = menus.getMenuADolar();
        String respuesta1 = menus.getRespuesta1();
        String respuesta2 = menus.getRespuesta2();

        while (true) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("*****************************\n" +
                    "----Dolar hoy en COP: $" + dolarHoy + "\n" +
                    "-----------MENU------------\n" +
                    "------Elige una Opción-----\n" +
                    1 + menuAmonedas + "\n" +
                    2 + menuaDolar
            );
            System.out.println("Ingresa la opción");
            seleccion = entrada.nextInt();

            if (seleccion != 1 && seleccion != 2) {
                System.out.println("Opción inválida. Saliendo...");
                break;
            }


            switch (seleccion) {
                case 1:

                    System.out.println("------Elige una Opción-----\n" +
                            menuaDolar + "\n" + menuPrin);
                    System.out.println("Ingresa la opción");
                    opcion = entrada.nextInt();
                    System.out.print("Ingresa la cantidad en DÓLARES: ");
                    cantidadUSD = entrada.nextDouble();
                    switch (opcion) {
                        case 1:
                            resultado = cantidadUSD * monedas.getPesoColombiano();
                            System.out.println(respuesta1 + resultado + "COP");
                            break;
                        case 2:
                            resultado = cantidadUSD * monedas.getPesoArgentino();
                            System.out.println(respuesta1 + resultado + "ARS");
                            break;
                        case 3:
                            resultado = cantidadUSD * monedas.getRealBrasileno();
                            System.out.println(respuesta1 + resultado + "BRL");
                            break;
                        case 4:
                            resultado = cantidadUSD * monedas.getBolivarVenezolano();
                            System.out.println(respuesta1 + resultado + "VES");
                            break;
                        case 5:
                            resultado = cantidadUSD * monedas.getPesoMexicano();
                            System.out.println(respuesta1 + resultado + "MXN");
                            break;
                        case 6:
                            resultado = cantidadUSD * monedas.getPesoChileno();
                            System.out.println(respuesta1 + resultado + "CLP");
                            break;
                        case 7:
                            resultado = cantidadUSD * monedas.getPesoUruguayo();
                            System.out.println(respuesta1 + resultado + "UYU");
                            break;
                        case 8:
                            resultado = cantidadUSD * monedas.getGuaraniParaguayo();
                            System.out.println(respuesta1 + resultado + "PYG");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
                case 2:

                    System.out.println("------Elige una Opción-----\n" +
                            menuAmonedas + "\n" + menuPrin);
                    System.out.println("Ingresa la opción");
                    opcion2 = entrada.nextInt();

                    System.out.print("Ingresa la cantidad en TU MONEDA LOCAL: ");
                    cantidad = entrada.nextDouble();

                    switch (opcion2) {
                        case 1:
                            resultado = cantidad / monedas.getPesoColombiano();
                            System.out.println(respuesta2 + resultado + "USD");
                            break;
                        case 2:
                            resultado = cantidad / monedas.getPesoArgentino();
                            System.out.println(respuesta2 + resultado + "USD");
                            break;
                        case 3:
                            resultado = cantidad / monedas.getRealBrasileno();
                            System.out.println(respuesta2 + resultado + "USD");
                            break;
                        case 4:
                            resultado = cantidad / monedas.getBolivarVenezolano();
                            System.out.println(respuesta2 + resultado + "USD");
                            break;
                        case 5:
                            resultado = cantidad / monedas.getPesoMexicano();
                            System.out.println(respuesta2 + resultado + "USD");
                            break;
                        case 6:
                            resultado = cantidad / monedas.getPesoChileno();
                            System.out.println(respuesta2 + resultado + "USD");
                            break;
                        case 7:
                            resultado = cantidad / monedas.getPesoUruguayo();
                            System.out.println(respuesta2 + resultado + "USD");
                            break;
                        case 8:
                            resultado = cantidad / monedas.getGuaraniParaguayo();
                            System.out.println(respuesta2 + resultado + "USD");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
                default:
                    System.out.println("La embarraste vuelve a comenzar");
            }

        }

    }
}