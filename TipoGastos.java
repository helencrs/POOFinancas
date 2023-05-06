public class TipoGastos {
    Alimentacao (1, 'Alimentação');
    Saude (1, 'Saúde');
    ContasFixas (1, 'ContasFixas');
    Transporte (1, 'Transporte');
    Lazer (1, 'Lazer');
    private int Valor;
    private String TipoGas;

    TipoGanhos(int Valor, String TipoGas){
        this.Valor = Valor;
        this.TipoGas = TipoGas;
    }

    public int getValor() {
        return Valor;
    }
    public String getTipoGas(){
        return TipoGas;
    }
}