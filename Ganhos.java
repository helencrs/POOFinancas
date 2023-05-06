import java.util.Date;
public class Ganhos {
    private TipoDeGanho TipoGanho;
    private Date Data;
    private double Valor;
    public Gastos(TipoDeGanho TipoGanho, Date Data, double Valor){
        this.TipoGasto = TipoGasto;
        this.Data = Data;
        this.Valor = Valor;
    }
    public TipoDeGanho getTipoGanho(){
        return TipoGanho;
    }
    public Date getData(){
        return Data;
    }
    public double geValor(){
        return Valor;
    }
}
