package org.example.aulatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreteGratisTest {

    @Test
    @DisplayName("test frete gratis valor acima de 200")
    public void ValorMaior() {

        FreteGratis ft = new FreteGratis();

        double compra = 6000;

        String expected = "Recebeu frete gratis,\n seu valor de compra foi de " + compra;
        String actual = ft.PlataformaDeVendas(compra);

        assertEquals(expected, actual);
        System.out.println("Test para compra > 200 -> " + expected);
    }

    @Test
    @DisplayName("test frete gratis valor igual ou menor que 200")
    public void ValorMenorOuIgual() {

        FreteGratis ft = new FreteGratis();

        double compra = 200;

        String expected = "Vai ter q pagar frete Bufa neguin🤧🤧🤧🤧🤧,\n seu valor de compra foi de " + compra;
        String actual = ft.PlataformaDeVendas(compra);

        assertEquals(expected, actual);
        System.out.println("Test para compra <= 200 -> " + expected);
    }

    @Test
    @DisplayName("test frete gratis valor menor que 0")
    public void ValorMenorZero() {

        FreteGratis ft = new FreteGratis();

        double compra = -10;

        String expected = "negativo WOW Vai ter q pagar frete Bufa neguin🤧,\n seu valor de compra foi de " + compra;
        String actual = ft.PlataformaDeVendas(compra);

        assertEquals(expected, actual);
        System.out.println("Test para compra < 0 -> " + expected);
    }
}
