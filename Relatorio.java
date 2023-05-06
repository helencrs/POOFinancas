import java.util.List;
import java.util.ArrayList;

public class Relatorio {
    private List<Gastos> gastos;
    private List<Ganhos> ganhos;

    public Relatorio(){
        this.gastos = new ArrayList<>();
        this.ganhos = new ArrayList<>();
    }
    public List<Ganhos> getGanhos(){
        return ganhos;
    }
    public void AddGanhos (Ganhos ganhos) {
        ganhos.add(ganhos);
    }

    public List<Gastoss> getGastos(){
        return gastos;
    }
    public void AddGastos (Gastos gastos) {
        gastos.add(gastos);
    }
    public double calculoSaldo(){
        return calculoGanhos() - calculoGastos();
    }
}

