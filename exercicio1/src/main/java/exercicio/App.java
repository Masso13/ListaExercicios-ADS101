package exercicio;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");

        if (teclado.hasNextInt()) {
            int entrada = teclado.nextInt();
            System.out.println(entrada);
        } else {
            System.out.println("Isto não é Inteiro");
        }

        teclado.close();
    }
}
