public class TipoGanhos {
    Salario (1, 'Salário');
    Freelancers (1, 'Freelancers');
    Dividendos (1, 'Dividendos');

    private int Valor;
    private String TipoGan;

    TipoGanhos(int Valor, String TipoGan){
        this.Valor = Valor;
        this.TipoGan = TipoGan;
    }

    public int getValor() {
        return Valor;
    }
    public String getTipoGan(){
        return TipoGan;
    }
}
