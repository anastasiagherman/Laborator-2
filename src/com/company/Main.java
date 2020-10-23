package com.company;

import com.company.incapsulare.Telefon;
import com.company.incapsulare.Usa;
import com.company.mostenireIerarhica.Caiet;
import com.company.mostenireIerarhica.Produs;
import com.company.mostenireSimpla.Angajat;

public class Main {

    public static void main(String[] args) {
        Usa u1 = new Usa("lemn", "alb", 176, 100);
        System.out.println(u1.print());

        Telefon t1 = new Telefon("Nokia","Gri", 400, 34);
        System.out.println(t1.print());

        Angajat manager = new Angajat("Marcu Ion", "manager", 10000);
        System.out.println(manager.print());

        Produs pix = new Produs("Pix", 10D);
        System.out.println(pix.print());

        Caiet nr1 = new Caiet("Caiet", 15D, 48);
        System.out.println(nr1.print());


    }
}
