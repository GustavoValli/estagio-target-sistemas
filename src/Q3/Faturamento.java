package Q3;

public class Faturamento {
    private Integer dia;
    private Float valor;

    public Faturamento() {
    }

    public Faturamento(Integer dia, Float valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
