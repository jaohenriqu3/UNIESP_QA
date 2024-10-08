public class DescontoService {

    public double calculaDesconto(double preco, double percentualDesconto) {
        validarParametros(preco, percentualDesconto);
        return preco * (1 - percentualDesconto / 100);
    }

    private void validarParametros(double preco, double percentualDesconto) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que 0");
        }
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("O desconto deve ser entre 0 e 100");
        }
    }
}
