package exercicio;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um tempo em segundos: ");
        int segundos = teclado.nextInt();

        int minutos = segundos / 60;
        int horas = minutos / 60;

        System.out.format("%d:%d:%d", horas, minutos % 60, segundos % 60);
    }
}
