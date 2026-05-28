package org.example.aulatest;

public class SistemaDeDesconto {

    public String lojaVirtual(double valor) {

        if (valor > 1000) {
            double valorDesc = valor * 0.8;
            return "Vc recebeu 20% de desconto " + valorDesc;

        } else if (valor > 500) {
            double valorDesc = valor * 0.9;
            return "Vc recebeu 10% de desconto " + valorDesc;
        }
        return "Vc nao obteve desconto";
    }
}