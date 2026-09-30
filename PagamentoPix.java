package sistemabancario;

public class PagamentoPix extends Pagamento {
    private String chaveChavePix;

    public PagamentoPix(double valor, String chaveChavePix) {
        super(valor);
        this.chaveChavePix = chaveChavePix;
    }

    @Override
    public boolean processar() {
        System.out.println("Gerando QR Code para o PIX...");
        return true;
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Tipo de pagamento: PIX");
        super.imprimirRecibo();
    }
}
