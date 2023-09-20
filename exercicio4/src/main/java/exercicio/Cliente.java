package exercicio;

public class Cliente {
    private double numero_conta;
    private double saldo_inicial, itens_cobrados, creditos_aplicados, limite_credito;

    public Cliente(int numero_conta, double itens_cobrados, double saldo_inicial, double creditos_aplicados,double limite_credito) {
        this.numero_conta = numero_conta;
        this.itens_cobrados = itens_cobrados;
        this.saldo_inicial = saldo_inicial;
        this.creditos_aplicados = creditos_aplicados;
        this.limite_credito = limite_credito;
    }

    public boolean calculaNovoSaldo() {
        double novo_saldo = this.saldo_inicial + itens_cobrados - this.creditos_aplicados;

        if (novo_saldo > this.limite_credito) {
            return false;
        } else {
            this.saldo_inicial = novo_saldo;
            return true;
        }
    }
}
