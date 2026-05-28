package org.example.aulatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControleDeAcessoTest {


    @Test
    @DisplayName("Controle de acesso - TEST")
    public void ControleAss(){

        ControleDeAcesso cs = new ControleDeAcesso();

        int idade = 17;
        boolean autorizacaoDoPai = true;

        String expected = "Acesso Permitido " + idade + autorizacaoDoPai;;
        String actual =  cs.acesso(idade, autorizacaoDoPai);

        assertEquals(expected, actual);
        System.out.println("Test Controle de acesso" + expected);
    }
}
