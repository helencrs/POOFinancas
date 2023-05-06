import java.util.*;
public class FormaPagamento {
    int Pagamento = 0;
    Valor = false;
        while (!Valor) {
        System.out.println("Qual a forma de pagamento? \n" +
                "1 - Pix\n" +
                "2 - Crédito\n" +
                "3 - Débito");

        if (Scanner.hasNextInt()) {
            Pagamento = Scanner.nextInt();
            Valor = true;
        } else {
            System.out.println("Digite corretamente.");
            Scanner.next();
        }
    }

    private Object valorMetodoPagamento;

    public FormaPagamento(Object valorMetodoPagamento) {
        this.valorMetodoPagamento = valorMetodoPagamento;
    }
}
