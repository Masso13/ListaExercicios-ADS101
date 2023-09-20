package exercicio;

public class Util {
    public static void alinharEsquerda(boolean ordem, int valor_maximo) {
        if (ordem) {
            for (int y = 1; y < valor_maximo; y++) {
                imprimirCaracter(y);
            }
        } else {
            for (int y = valor_maximo; y > 1; y--) {
                imprimirCaracter(y);
            }
        }
    }

    public static void alinharDireita(boolean ordem, int valor_maximo) {
        if (ordem) {
            for (int y = 10; y > 1; y--) {
                imprimirEspacos(y, valor_maximo);
                imprimirCaracter(y);
            }
        } else {
            for (int y = 1; y < 10; y++) {
                imprimirEspacos(y, valor_maximo);
                imprimirCaracter(y);
            }
        }
    }

    public static void imprimirCaracter(int y) {
        for (int x = 1; x < y; x++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void imprimirEspacos(int y, int valor_maximo) {
        for (int espacos = 0; espacos < valor_maximo - y; espacos++) {
            System.out.print(" ");
        }
    }
}
