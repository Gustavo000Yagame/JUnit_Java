package org.example.aulatest;

public class SistemaAcademia {

    public String Academia(boolean mensalidade, String testDia,double diariaPaga){
        if(mensalidade == true || testDia == "tenho teste" || diariaPaga > 30){
            return "Entrada permitida";
        }
        return "Entrada Negada";
    }
}
