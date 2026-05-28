package org.example.aulatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaEscolarTest {

    @Test
    @DisplayName("Deve colocar aluno em recuperacao")
    public void DeveColocarAlunoEmRecuperacao(){

        SistemaEscolar sistemaEscolar = new SistemaEscolar();

        double nota1 = 7;
        double nota2 = 6;
        double media = 6.5;

        String expected = "RECUPERACAO " + media;
        String actual = sistemaEscolar.escola(nota1, nota2);

        assertEquals(expected, actual);
        System.out.println("Simulado notas SistemaEscola: " + expected);
    }
}