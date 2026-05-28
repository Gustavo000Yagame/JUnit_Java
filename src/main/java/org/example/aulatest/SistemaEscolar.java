package org.example.aulatest;

public class SistemaEscolar {

    public String escola(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            return "APROVADO " + media;
        } else if (media >= 5) {
            return "RECUPERACAO " + media;
        }
        return "REPROVADO " + media;
    }
}
