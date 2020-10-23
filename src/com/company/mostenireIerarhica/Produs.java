package com.company.mostenireIerarhica;

public class Produs {
    private String nume;
    private Double pret;


    public Produs(String nume, double pret){
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume(){
        return nume;
    }

    public void setNume(String nme) {
        this.nume = nume;
    }

    public double getPret(){
        return pret;
    }

    public void setPret(double pret){
        this.pret = pret;
    }

    public String print(){
        return "Nume produs: " + this.nume + "\n'"+
                "Pret produs: " + this.pret + "\n";
    }
}
