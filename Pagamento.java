package sistemabancario;

import java.util.UUID;

public abstract class Pagamento {
    protected String idTransacao;
    protected double valor;
    protected String status;

    public Pagamento(double valor) {
        this.idTransacao = "TRX-" + UUID.randomUUID();
        this.valor = valor;
        this.status = "PENDENTE";
    }

    public void imprimirRecibo() {
        System.out.println("ID da Transação: " + idTransacao);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
    }

    public abstract boolean processar();
}
