package org.example.aulatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaLoginTest {

    @Test
    @DisplayName("Nao deve permitir senha vazia")
    public void NaoDevePermitirSenhaVazia(){

        SistemaLogin sg = new SistemaLogin();

        String email = "geraisusos25@gmail.com";
        String senha = "";

        String expected = "Erro, o email e senha nao devem ficar vazios!";
        String actual = sg.login(email, senha);
        assertEquals(expected, actual);
    }
}