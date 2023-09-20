package exercicio;

public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String displayData() {
        String dia_s = Integer.toString(dia);
        if (dia < 10) {
            dia_s = "0"+dia;
        }

        String mes_s = Integer.toString(mes);
        if (mes < 10) {
            mes_s = "0"+mes;
        }

        return dia_s+"/"+mes_s+"/"+ano;
    }
}
