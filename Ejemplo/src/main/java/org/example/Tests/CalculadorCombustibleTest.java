package org.example.Tests;

import org.example.Avion;
import org.example.AvionComercial;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadorCombustibleTest {
    @Test
    public void testCalcularCombustible() {
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
        Avion avion = mock(Avion.class);
        when(avion.volar(10)).thenReturn(75);
        int resultado = calculadorCombustible.calcularCombustible(avion, 10);
        Assertions.assertEquals(calculadorCombustible.calcularCombustible(avion, 10), resultado);
    }
}
