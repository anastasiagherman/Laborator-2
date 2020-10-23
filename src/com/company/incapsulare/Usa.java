package com.company.incapsulare;

public class Usa {
    private String material;
    private String culoare;
    private float inaltime;
    private float latime;

    public Usa(String material, String culoare, float inaltime, float latime){
        this.material = material;
        this.culoare = culoare;
        this.inaltime = inaltime;
        this.latime = latime;
    }

    public String print(){
        return "Material:" + this.material + '\n' +
                "Culoare:" + this.culoare + '\n' +
                "Inaltime:" + this.inaltime + '\n' +
                "Latime: " + this.latime + '\n';
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setInaltime(float inaltime) {
        this.inaltime = inaltime;
    }

    public void setLatime(float latime) {
        this.latime = latime;
    }

    public String getMaterial(){
        return material;
    }

    public String getCuloare() {
        return culoare;
    }

    public float getInaltime() {
        return inaltime;
    }

    public float getLatime() {
        return latime;
    }
}
