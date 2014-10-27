/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz;

/**
 *
 * @author Moya
 */
public class Juego {

    private String[][] matriz;
//Métoso constructor sin parámetros

    public Juego() {
        this.matriz = new String[6][7];
    }
//Método que permite rellenar las celdas o espacios de la matriz

    public void rellenar() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = "-";
            }
        }
    }
//Método para imprimir la matriz

    public void imprimirMatriz() {
        for (String[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz1[j]);
            }
            System.out.print("\n");
        }
    }
//Método para recorrer las filas en busca de lugares para colocar la ficha

    public void cargarElemento(int columna, String valor) {
        for (int i = matriz.length - 1; i < 0; i--) {
            if (matriz[i][columna].equals("-")) {
                matriz[i][columna] = valor;
                break;
            }
        }
    }
//Método para recorrer las filas en busca de lugares para colocar la ficha

    public boolean validarFilas() {
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 4; i++) {
                if (!(matriz[i][j].equals("-"))) {
                    if ((matriz[i][j].equals(matriz[i][j + 1])) && (matriz[i][j].equals(matriz[i][j + 2]))
                            && (matriz[i][j].equals(matriz[i][j + 3]))) {
                        encontrado = true;
                    }

                }
            }

        }

        return encontrado;
    }
//Método para recorrer las colunmas en busca de lugares para colocar la ficha

    public boolean validarColumnas() {
        boolean encontrado = false;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(matriz[i][j].equals("-"))) {
                    if (matriz[j][i].equals(matriz[j + 1][i]) && (matriz[j][i].equals(matriz[j + 2][i]))
                            && (matriz[j][i].equals(matriz[j + 3][i]))) {
                        encontrado = true;

                    }
                }

            }

        }
        return encontrado;

    }

    // //Método para recorrer en diagonal en busca de lugares para colocar la ficha

    public boolean validarDiagonal() {
        boolean encontrado = false;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int i = 0; i < 3; i++) {
                if (!(matriz[i][i].equals("-"))) {
                    if (matriz[j][i].equals(matriz[j + 1][i]) && (matriz[j][i].equals(matriz[j + 2][i]))
                            && (matriz[j][i].equals(matriz[j + 3][i]))) {
                        encontrado = true;

                    }
                }

            }
        }
        return false;
        
    }
}
