package sistemabancario;

public class Main {
    public static void main(String[] args) {
        GatewayPagamento gateway = new GatewayPagamento();

        PagamentoPix pix = new PagamentoPix(150.00, "chave@email.com");
        PagamentoCartao cartao = new PagamentoCartao(6000.00, "1234567890123456", "Fulano de Tal");
        PagamentoTransferencia transferencia = new PagamentoTransferencia(800.00, "12345-6");
        PagamentoCriptomoeda cripto = new PagamentoCriptomoeda(2000.00, "Bitcoin", 0.0025);

        gateway.realizarCobranca(pix);
        gateway.realizarCobranca(cartao);
        gateway.realizarCobranca(transferencia);
        gateway.realizarCobranca(cripto);
    }
}
