package org.example.aulatest;

public class SistemaLogin {

    public String login(String email, String senha) {
        if (email.isEmpty() || senha.isEmpty()) {
            return "Erro, o email e senha nao devem ficar vazios!";
        }
        if (email.equals("geraisusos25@gmail.com")
                && senha.equals("ABC2214")) {
            return "Seja bem vindo! " + email;
        }
        return "Acesso negado, tente mais tarde";
    }
}