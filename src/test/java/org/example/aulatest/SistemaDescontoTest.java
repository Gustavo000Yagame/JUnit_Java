package org.example.aulatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaDescontoTest {

    @Test
    @DisplayName("Deve aplicar 10% de desconto")
    void DeveAplicar10PorcentoDeDesconto(){

        SistemaDeDesconto sd = new SistemaDeDesconto();

        double valor = 854;
        double valorDesc = 768.6;

        String expected = "Vc recebeu 10% de desconto " + valorDesc;
        String actual = sd.lojaVirtual(valor);

        assertEquals(expected, actual);
        System.out.println("Simulado desconto LojaVirtual: " + expected);
    }
}