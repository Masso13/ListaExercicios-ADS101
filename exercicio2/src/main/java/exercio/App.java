package exercio;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);

        double temperatura;
        double conversao;

        while (true) {
            renderizarCabecalho();
            System.out.println("(1) Celsius para Fahrenheit\n(2) Fahrenheit para Celsius\n");
            System.out.print("> ");
            int escolha = teclado.nextInt();
            renderizarCabecalho();

            switch(escolha) {
                case 1:
                    System.out.print("Digite a temperatura em °C: ");
                    temperatura = teclado.nextDouble();
                    
                    conversao = temperatura * 9/5 + 32;
                    System.out.format("- A conversão de %.2f°C é %.2f°F\n", temperatura, conversao);
                    break;
                case 2:
                    System.out.print("Digite a temperatura em °F: ");
                    temperatura = teclado.nextDouble();

                    conversao = (temperatura - 32) * 5/9;
                    System.out.format("- A conversão de %.2f°F é %.2f°C\n", temperatura, conversao);
                    break;
                default:
                    System.out.println("[ERRO] Essa opção não existe !");
                    break;
            }
            renderizarCabecalho();

            teclado.nextLine();

            System.out.print("Deseja sair ?(S/N) ");
            String escolha_fechar = teclado.nextLine().toUpperCase();

            if (escolha_fechar.equals("S"))
                break;
        }
    }

    public static void renderizarCabecalho() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-");
    }
}
