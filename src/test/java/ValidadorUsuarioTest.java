import org.example.ValidadorUsuario;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidadorUsuarioTest {

    @ParameterizedTest(name = "O nome é válido: {0}")
    @ValueSource(strings = {"Ana", "Carlos", "Maria", "Joao123", "usuario"})

    void verificarNomeValido(String nome){

        assertTrue(ValidadorUsuario.nomeValido(nome));
    }
    @ParameterizedTest(name = "O nome é false {0}")
    @ValueSource(strings = )


}
