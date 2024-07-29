package org.example.Tests;

import org.example.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionPrivadoTest {
    AvionPrivado avionPrivado = new AvionPrivado(1000,10);

    @Test
    public void testVolar() {
        Assertions.assertEquals(600, avionPrivado.volar(10));
    }

    @Test
    public void getCapacidadCombustible(){
        int capacidad = avionPrivado.getCapacidadCombustible();
        Assertions.assertEquals(1000, capacidad);
    }

    @Test
    public void getConsumoCombustible(){
        int consumo = avionPrivado.getConsumoCombustible();
        Assertions.assertEquals(10, consumo);
    }
}
