package com.company.mostenireIerarhica;

import com.company.mostenireIerarhica.Produs;

public class Caiet extends Produs {
    private int nrPagini;

    public Caiet(String nume, Double pret, int nrPagini){
        super(nume, pret);
        this.nrPagini = nrPagini;
    }
    @Override
    public String print(){
        return super.print()  + "Numarul de pagini:"
                + this.nrPagini;
    }
}
