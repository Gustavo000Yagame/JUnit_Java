package org.example.aulatest;

public class FreteGratis {

    public String PlataformaDeVendas(double compra) {
        if (compra > 200) {
            return "Recebeu frete gratis,\n seu valor de compra foi de " + compra;
        } else if (compra <= 200) {
            return "Vai ter q pagar frete Bufa neguin🤧🤧🤧🤧🤧,\n seu valor de compra foi de " + compra;
        }
        return  "Vai ter q pagar frete Bufa neguin🤧🤧🤧🤧🤧,\n seu valor de compra foi de " + compra;
    }
}

