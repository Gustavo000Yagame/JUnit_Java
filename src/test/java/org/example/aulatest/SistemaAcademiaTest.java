package org.example.aulatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaAcademiaTest {


    @Test
    @DisplayName("Entrada permitida teste")
    void EntradaPermitida(){

        SistemaAcademia sp = new SistemaAcademia();

        boolean mensalidade = false;
        String testDia = "tenho teste";
        double diariaPaga = 15;

        String expected =  "Entrada permitida";
        String actual = sp.Academia(mensalidade, testDia, diariaPaga);

        assertEquals(expected, actual);
        System.out.println("teste academia " + expected);
    }
}
