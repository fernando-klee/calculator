import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros() {
        double valor1 = 3;
        double valor2 = 1;
        double resultadoEsperado = 2;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.substituicao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros() {
        //Arrange
        double valor1 = 2;
        double valor2 = 2;
        double resultadoEsperado = 4;
        Calculadora calculadora = new Calculadora();

        double valorCalculado =calculadora.soma(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros() {
        double valor1 = 2;
        double valor2 = 3;
        double resultadoEsperado = 6;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.multiplicacao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes() {
        double valor1 = 7.5;
        double valor2 = 1.5;
        double resultadoEsperado = 5.0;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.divisao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveFazerARaizDoNumero() {
        double valor1 = 49;
        double resultadoEsperado = 7.0;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.raizQuadrada(valor1);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public  void deveFazerAExponenciacaoDoNumero() {
        double valor1 = 3;
        double valor2 = 2;
        double resultadoEsperado = 9;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.exponenciacao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }
}
