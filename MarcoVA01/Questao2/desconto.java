public class Desconto {

    public double calculaDesconto(double preco, double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("O desconto deve ser entre 0 e 100");
        }
        return preco - (preco * (percentualDesconto / 100));
    }
}
