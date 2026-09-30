package sistemabancario;

public class GatewayPagamento {
    public void realizarCobranca(Pagamento pagamento) {
        if (pagamento.processar()) {
            pagamento.status = "APROVADO";
        } else {
            pagamento.status = "RECUSADO";
        }
        pagamento.imprimirRecibo();
    }
}
