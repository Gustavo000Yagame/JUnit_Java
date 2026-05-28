package org.example.aulatest;

public class ControleDeAcesso {

    public String acesso(int idade, boolean autorizacaoDoPai) {
        if (idade >= 18 || autorizacaoDoPai == true) {
            return "Acesso Permitido " + idade + autorizacaoDoPai;

        } else if (idade < 18) {
            return "Acesso negado " + idade;
        }
        return "Acesso negado";
    }
}
