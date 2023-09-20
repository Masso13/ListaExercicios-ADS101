package exercicio;

public class App 
{
    public static void main( String[] args )
    {
        Person[] pessoas = {new Person("Luiz", 18), new Person("Miguel", 19)};

        for (Person pessoa : pessoas) {
            System.out.format("%s - %d anos\n", pessoa.getNome(), pessoa.getIdade());
        }
    }
}
