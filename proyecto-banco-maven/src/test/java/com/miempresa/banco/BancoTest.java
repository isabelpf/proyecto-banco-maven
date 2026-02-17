
package com.miempresa.banco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {
    @Test
    void ingresarYRetirar() {
        Cuenta c = new Cuenta("Ana", 100);
        c.ingresar(50);
        assertEquals(150, c.getSaldo(), 0.001);
        c.retirar(25);
        assertEquals(125, c.getSaldo(), 0.001);
    }
}
