import org.example.Estacionamento;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EstacionamentoTest {

    @ParameterizedTest(name = "Com {0} hora(s), o valor deve ser R$ {1}")
    @CsvSource({
            "1, 5.0",
            "2, 10.0",
            "3, 10.0",
            "4, 15.0",
            "5, 15.0",
            "6, 15.0",
            "7, 25.0",
            "8, 25.0",
            "10, 25.0",
            "24, 25.0"
    })
    void deveCalcularValorCorreto(int horas, double valorEsperado) {

        double valorAtual = Estacionamento.calcularValor(horas);

        assertEquals(valorEsperado, valorAtual);
    }

    @ParameterizedTest(name = "Com {0} hora(s), deve lançar exceção")
    @ValueSource(ints = {0, -1, -5, -100})
    void deveRejeitarTempoInvalido(int horas) {

        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> Estacionamento.calcularValor(horas)
        );

        assertEquals("Tempo inválido.", excecao.getMessage());
    }
}