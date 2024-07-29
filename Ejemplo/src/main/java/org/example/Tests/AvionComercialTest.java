package org.example.Tests;

import org.example.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {
    AvionComercial avionComercial = new AvionComercial(2000,15);

    @Test
    public void testVolar() {
        Assertions.assertEquals(450, avionComercial.volar(30));
    }
    @Test
    public void getCapacidadCombustible(){
        int capacidad = avionComercial.getCapacidadCombustible();
        Assertions.assertEquals(2000, capacidad);
    }
    @Test
    public void getConsumoCombustible(){
        int consumo = avionComercial.getConsumoCombustible();
        Assertions.assertEquals(15, consumo);
    }
}
