package exercicio;

public class App 
{
    public static void main( String[] args )
    {
        int mdc = calcularMDC(20, 24);
        System.out.println(mdc);
    }

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
