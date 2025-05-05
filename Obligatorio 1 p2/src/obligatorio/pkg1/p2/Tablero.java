package obligatorio.pkg1.p2;

import java.util.*;

public class Tablero {

    public static String[][] imprimirMatriz(String[][] mat) {
        for (int filas = 0; filas < mat.length; filas++) {
            for (int columnas = 0; columnas < mat[filas].length; columnas++) {
                if (filas % 2 == 0 && columnas % 2 == 0) {
                    mat[filas][columnas] = "*";
                } else if (filas % 2 != 0 && columnas % 2 != 0) {
                    mat[filas][columnas] = "*";
                } else {
                    mat[filas][columnas] = " ";
                }
            }
        }
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};

        for (int col = 0; col < letras.length; col++) {
            mat[0][col] = letras[col];
        }

// Parte superior izquierda
        mat[1][1] = " ";
        mat[2][0] = " ";
// Parte superior derecha

        mat[1][mat[0].length - 2] = " ";
        mat[2][mat[0].length - 1] = " ";

// Parte inferior izquierda
        mat[mat.length - 1][1] = " ";
        mat[mat.length - 2][0] = " ";

// Parte inferior derecha
        mat[mat.length - 1][mat[0].length - 2] = " ";
        mat[mat.length - 2][mat[0].length - 1] = " ";

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        return mat;

    }

    public static String pedirJugada(String[][] mat) {
        Scanner in = new Scanner(System.in);
        String jugada = in.nextLine();

        return jugada;
    }

    public static boolean validarJugada(String jugada) {
        boolean esValida = true;
    int[] res = new int[4];

    for (int i = 0; i < jugada.length() && esValida; i++) {
        char c = Character.toUpperCase(jugada.charAt(i));

        if (c >= 'A' && c <= 'M') {
            res[i] = c - 'A'; // esto lo que hace es que si lee A. res[i] = 0, si lee B. res[i] = 1 y asi sucesivamente
        } else if (c >= '0' && c <= '9') {
            res[i] = c - '0'; // logica muy parecida a arriba, si lee 0 manda un 0 a res[i], si lee 1 pone un 1 en res[i]
        } else {
            esValida = false; // si entra a este if se corta el for
        }
    }
        if(jugada.length() != 4){
            esValida = false;
        }
        // lo que queda pendiente aca es validar que la jugada este "dentro" del tablero

    // Mostramos el array resultante:
    for (int i = 0; i < res.length; i++) {
        System.out.println(res[i]);
    }
    
    return esValida;
}

}

//definir clase sistema
//llenarJugada
//validarJugada si no es valida llama al metodo llenarJugada  // verificarSiExiste
// validarSiGanaTriangulo
//deifinir clase Jugador (Nombre {unico} y edad)
// validarJugador
//metodo tirarFuegos
//mostrar  jugadasPrevias
//matarJuego
//mostrar ranking
//rachaGanadoraMasLarga
//

