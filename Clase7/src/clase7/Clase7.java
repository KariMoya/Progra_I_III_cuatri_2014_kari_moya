/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Clase7 {

    private static Object oejer2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite la opción del ejercicio a evaluar");
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Ejercicio 3");
            System.out.println("4.Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    eje1 oeje1 = new eje1();

                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println(("Digite el salario del trabajador #") + (i++));
                        oeje1.AgregarSalario(teclado.nextDouble());

                    }

                    System.out.println(oeje1.imprimirSalarios());
                    break;
                case 2:
                    ejer2 oejer2 = new ejer2();
                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println(("Digite la altura de la persona #") + (i++));
                        oejer2.AgregarAltura(teclado.nextFloat());
                    }
                    System.out.println("El promedio es : " + "oejer2.Promedio()");
                    System.out.println(oejer2.ContarPersonas());
                    break;

                case 3:
                    ejer3 oejer3 = new ejer3();
                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println(("Digite el salario del empleado de la mañana #") + (i + 1));
                        oejer3.AgregarSalarioManana(teclado.nextFloat());

                    }

                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println(("Digite el salario del empleado de la tarde #") + (i + 1));
                        oejer3.AgregarSalarioTarde(teclado.nextFloat());
                    }
                    oejer3.ImprimirGastos();

            }

        } while (opcion < 5);

    }
}
