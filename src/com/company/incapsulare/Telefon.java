package com.company.incapsulare;

public class Telefon {
    private String model;
    private String culoare;
    private double pret;
    private int memorie;

    public Telefon(String model, String culoare, double pret, int memorie){
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
        this.memorie = memorie;
    }
    public String print(){
        return "Model:" + this.model + '\n' +
                "Culoare:" + this.culoare + '\n' +
                "Pret:" + this.pret + '\n' +
                "Memorie:" + this.memorie;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setMemorie(int memorie) {
        this.memorie = memorie;
    }

    public String getModel(){
        return model;
    }

    public String getCuloare(){
        return culoare;
    }

    public double getPret() {
        return pret;
    }

    public int getMemorie() {
        return memorie;
    }
}
