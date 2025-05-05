package obligatorio.pkg1.p2;

public class Obligatorio1P2 {

    public static void main(String[] args) {

        String[][] mat = new String[8][13];

        Tablero.imprimirMatriz(mat);
        Tablero.validarJugada(Tablero.pedirJugada(mat));
    }

}
