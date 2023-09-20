package exercicio;

public class App 
{
    public static void main( String[] args )
    {
        Cliente cliente1 = new Cliente(1, 0, 600, 0, 600);

        if (! cliente1.calculaNovoSaldo()) {
            System.out.println("Limite de crédito excedido");
        }
    }
}
