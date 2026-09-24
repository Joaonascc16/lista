import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AutenticadorTest {

    @ParameterizedTest(name = "Usuário: {0}, Senha: {1} → resultado esperado: {2}")
    @CsvSource
}
