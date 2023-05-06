import java.util.Date;
public class Gastos {
    private TipoDeGasto TipoGasto;
    private Date Data;
    private double Valor;
    private FormaPagamento Pagamento;
    public Gastos(TipoDeGasto TipoGasto, Date Data, double Valor, FormaPagamento Pagamento){
        this.TipoGasto = TipoGasto;
        this.Data = Data;
        this.Valor = Valor;
        this.Pagamento = Pagamento;
    }
    public TipoDeGasto getTipoGasto(){
        return TipoGasto;
    }
    public Date getData(){
        return Data;
    }
    public double geValor(){
        return Valor;
    }
    public FormaPagamento getPagamento(){
        return Pagamento;
    }
}