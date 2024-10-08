import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DescontoServiceTest {

    @Test
    public void testCalculaDesconto_valoresCorretos() {
        DescontoService descontoService = new DescontoService();

        // Teste 1: Preço 150.0 com desconto de 15% 
        double preco1 = 150.0;
        double percentualDesconto1 = 15.0;
        double resultadoEsperado1 = 127.5;
        assertEquals(resultadoEsperado1, descontoService.calculaDesconto(preco1, percentualDesconto1), 0.01);

        // Teste 2: Preço 300.0 com desconto de 30%
        double preco2 = 300.0;
        double percentualDesconto2 = 30.0;
        double resultadoEsperado2 = 210.0;
        assertEquals(resultadoEsperado2, descontoService.calculaDesconto(preco2, percentualDesconto2), 0.01);

        // Teste 3: Preço 50.0 com desconto de 0% 
        double preco3 = 50.0;
        double percentualDesconto3 = 0.0;
        double resultadoEsperado3 = 50.0;
        assertEquals(resultadoEsperado3, descontoService.calculaDesconto(preco3, percentualDesconto3), 0.01);
    }

    @Test
    public void testCalculaDesconto_percentuaisLimites() {
        DescontoService descontoService = new DescontoService();

        // Cenário limite: Desconto de 100% 
        double preco = 100.0;
        double percentualDesconto = 100.0;
        double resultadoEsperado = 0.0;
        assertEquals(resultadoEsperado, descontoService.calculaDesconto(preco, percentualDesconto), 0.01);

        // Cenário limite: Desconto de 0% 
        percentualDesconto = 0.0;
        resultadoEsperado = 100.0;
        assertEquals(resultadoEsperado, descontoService.calculaDesconto(preco, percentualDesconto), 0.01);
    }

    @Test
    public void testCalculaDesconto_parametrosInvalidos() {
        DescontoService descontoService = new DescontoService();

        // Testar preço negativo
        assertThrows(IllegalArgumentException.class, () -> {
            descontoService.calculaDesconto(-10.0, 10.0);
        });

        // Testar preço igual a 0
        assertThrows(IllegalArgumentException.class, () -> {
            descontoService.calculaDesconto(0.0, 10.0);
        });

        // Testar percentual negativo
        assertThrows(IllegalArgumentException.class, () -> {
            descontoService.calculaDesconto(100.0, -5.0);
        });

        // Testar percentual maior que 100
        assertThrows(IllegalArgumentException.class, () -> {
            descontoService.calculaDesconto(100.0, 150.0);
        });
    }
}
