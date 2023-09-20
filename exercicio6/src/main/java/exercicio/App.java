package exercicio;

public class App 
{
    public static void main( String[] args )
    {
        Fatura fatura = new Fatura("8645645", "Pacote de milho de pipoca", 2, 4.5);

        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura.getQuantidade());
        System.out.println("Preço por Item: R$" + fatura.getPreco());

        double totalFatura = fatura.getTotalFatura();
        System.out.println("Total da Fatura: R$" + totalFatura);
    }
}
