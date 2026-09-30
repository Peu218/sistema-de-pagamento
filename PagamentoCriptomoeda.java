package sistemabancario;

public class PagamentoCriptomoeda extends Pagamento {
    private String nomeCripto;
    private double valorCripto;

    public PagamentoCriptomoeda(double valor, String nomeCripto, double valorCripto) {
        super(valor);
        this.nomeCripto = nomeCripto;
        this.valorCripto = valorCripto;
    }

    @Override
    public boolean processar() {
        System.out.println("Processando transferência de criptomoeda...");
        return true;
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Tipo de pagamento: Criptomoeda");
        System.out.println("Criptomoeda transferida: " + nomeCripto);
        System.out.println("Valor em criptomoeda: " + valorCripto + " " + nomeCripto);
        super.imprimirRecibo();
    }
}
