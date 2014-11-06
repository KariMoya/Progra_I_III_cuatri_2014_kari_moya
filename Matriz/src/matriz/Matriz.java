/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz;

import java.util.Scanner;

/**
 *
 * @author Moya
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Aqui se guarda el juego actual
    public static Juego juegoActual = new clsJuego();

    //En la posicion 1 se guardan las partidas ganadas del jugador 1
    //En la posicion 2 se guadan las partidas ganadas del jugador 2
    //En la posicion 3 se guardan los empates
    //En la posicion 4 se guardan el total de partidas
    public static int[] estadisticas = new int[4];

    //Jugadores
    public static String jugador1 = "";
    public static String jugador2 = "";

  
        // TODO code application logic here
        //instancia de la clase
        mainMenu();
    }

    public static void mainMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite una opción: ");
        System.out.println("1.Seleccionar el nombre del jugador número 1. (X)");
        System.out.println("2.Seleccionar el nombre del jugador número 2. (0)");
        System.out.println("3.Iniciar juego");
        System.out.println("4.Salir");

        opcion = teclado.nextInt();

        if (opcion == 1) {
            String nombre;
            nombre = teclado.nextLine();
            jugador1 = nombre;
            mainMenu();
        } else if (opcion == 2) {
            String nombre;
            nombre = teclado.nextLine();
            jugador2 = nombre;
            mainMenu();
        } else if (opcion == 3) {
            if ((jugador1.equals("")) || (jugador2.equals(""))) {
                System.out.println("Aun no ha ingresado el nombre de los jugadores");
                mainMenu();
            } else {
                juegoActual.rellenar();
                menuJuego();
            }
        } else if (opcion == 4) {
            System.out.println("Gracias por jugar!!");
        } else {
            System.out.println("Opcion invalida");
            mainMenu();
        }

    }

    public static void menuJuego() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("1.Empezar juego");
        System.out.println("2.Estadísticas");
        System.out.println("3.Salir");

        opcion = teclado.nextInt();

        if (opcion == 1) {
            juegoActual.rellenar();
            juegoAct();
        } else if (opcion == 2) {
            System.out.println("La cantidad de partidas ganadas por " + jugador1 + "es de: " + estadisticas[0]);
            System.out.println("La cantidad de partidas ganadas por " + jugador2 + "es de: " + estadisticas[1]);
            System.out.println("La cantidad de empates es: " + estadisticas[2]);
            System.out.println("El total de partidas jugadas es de: " + estadisticas[3]);
        } else if (opcion == 3) {
            System.out.println("Juego terminado");
            mainMenu();
        } else {
            System.out.println("Opcion invalida");
            menuJuego();
        }
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void juegoAct() {
        Scanner teclado = new Scanner(System.in);
        int turno = 3;
        String entrada = "";
        int col = 0;

        while (!(juegoActual.ganador())) {
            if ((turno % 2) == 0) {
                System.out.println("Jugador 1: ");
                entrada = teclado.nextLine();
                if (entrada.equals("#")) {
                    System.out.println("El jugador " + jugador1 + "se ha rendido");
                    estadisticas[1] += 1;
                    menuJuego();
                } else {
                    if (isNumeric(entrada)) {
                        col = Integer.parseInt(entrada);
                        juegoActual.cargarElemento(col, "X");
                        turno += 1;
                    } else {
                        System.out.println("Tiene que ingresar un valor numerico");
                        juegoAct();
                    }
                }
            } else {
                System.out.println("Jugador 2: ");
                entrada = teclado.nextLine();
                if (entrada.equals("#")) {
                    System.out.println("El jugador " + jugador2 + "se ha rendido");
                    estadisticas[0] += 1;
                    menuJuego();
                } else {
                    if (isNumeric(entrada)) {
                        col = Integer.parseInt(entrada);
                        juegoActual.cargarElemento(col, "0");
                        turno += 1;
                    } else {
                        System.out.println("Tiene que ingresar un valor numerico");
                        juegoAct();
                    }
                }
            }
        }
    }
}

        
    }
    
}
