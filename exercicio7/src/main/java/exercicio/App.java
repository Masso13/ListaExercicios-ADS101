package exercicio;

public class App 
{
    public static void main( String[] args )
    {
        Empregado[] empregados = {new Empregado("Cleverson", "da Silva", 2000), new Empregado("Clarice", "Lispector", 1500)};

        for (Empregado empregado : empregados) {
            double salario = empregado.getSalario();
            double novo_salario = salario + (salario * 0.1);

            empregado.setSalario(novo_salario);

            System.out.format("%s salário: R$%.2f  novo salário: R$%.2f\n", empregado.getNome(), salario, novo_salario);
        }
    }
}
