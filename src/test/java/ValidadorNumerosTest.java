import org.example.ValidadorNumeros;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidadorNumerosTest {

    @ParameterizedTest(name = "O número é par: {0}")
    @ValueSource(ints = {2,4,10,20,100,1000})

    void ConfirmaSeNumeroPar(int numero){

        boolean resultado = ValidadorNumeros.ehPar(numero);

        assertTrue(resultado);
    }
    @ParameterizedTest(name = "O número é impar: {0}")
    @ValueSource(ints = {1,3,7,15,99,101})
    void ConfirmarSeNumeroImpar(int numero){
        boolean resultado = ValidadorNumeros.ehPar(numero);

        assertFalse(resultado);

    }

}
