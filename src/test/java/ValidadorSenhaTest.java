import org.example.ValidadorSenha;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidadorSenhaTest {

    @ParameterizedTest(name = "Senha: {0} → resultado esperado: {1}")
    @CsvSource({
            "Senha123, true",
            "Teste2026, true",
            "senha123, false",
            "SENHAAAA, false",
            "Abc1, false",
            "12345678, false",

            // Casos criados por nós
            "Abcdefg, false",
            "abcdefgh1, false",
            "Abcdefgh1, true"
    })
    void deveValidarSenhaCorretamente(
            String senha,
            boolean resultadoEsperado) {

        boolean resultadoAtual = ValidadorSenha.senhaValida(senha);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
}