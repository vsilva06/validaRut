import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String rut0;
    String rut1;
    String rut2;
    String rut3;

    @BeforeEach
    void setUp() {
        rut0 = "0000000-0";
        rut1 = "2-7";
        rut2 = "";


    }


    @Test
    void ingresarRut() {
    }

    @Test
    void eliminarelementos() {

    }

    @Test
    void validarRut0() {
        assertEquals(false, Main.validarRut(rut0));
    }

    @Test
    void numeroverificador() {
    }

    @Test
    void modulo11() {
    }
}