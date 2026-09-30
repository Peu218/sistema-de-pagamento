package sistemabancario;

public class PagamentoTransferencia extends Pagamento {
    private String contaDestino;

    public PagamentoTransferencia(double valor, String contaDestino) {
        super(valor);
        this.contaDestino = contaDestino;
    }

    @Override
    public boolean processar() {
        System.out.println("Processando transferência bancária...");
        return true;
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Tipo de pagamento: Transferência Normal");
        super.imprimirRecibo();
    }
}
