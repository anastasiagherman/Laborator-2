package com.company.incapsulare;

public class Main {
    public static void main(String args[]) {
        Usa u1 = new Usa("lemn", "alba", 2.0f, 1.3f);
        System.out.println(u1.print());
        Telefon t1 = new Telefon("Nokia", "negru", 1200d, 32);
        System.out.println(t1.print());
    }
}
