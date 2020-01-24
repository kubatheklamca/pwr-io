/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5.Katalog;

import java.util.Currency;

/**
 *
 * @author oszust
 */
public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscStan;
    private boolean widocznosc;
    public Produkt(){};
    public Produkt(String nazwa, double cena, int iloscStan) {
        if (cena < 0)
            throw new java.lang.Error("Cena nie może być ujemna!");
        if (iloscStan < 0)
            throw new java.lang.Error("Ilość nie może być ujemna");
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscStan = iloscStan;
        this.widocznosc = true;
    }
    public boolean getWidocznosc(){return this.widocznosc;}
    public void setWidocznosc(boolean widocznosc){this.widocznosc = widocznosc;}
    public String getNazwa(){return this.nazwa;}
    public void setNazwa(String value){this.nazwa = value;}
    public double getCena(){return this.cena;}
    public void setCena(double value){this.cena = value;}
    public int getIloscStan(){return this.iloscStan;}
    public void setIloscStan(int value){this.iloscStan = value;}
    public void wyswietlProdukt() {
        if (this.widocznosc == false)
            return;
        String sformatowanyString = String.format("%s; %s; %s;\n", this.nazwa, this.cena, this.iloscStan);
        System.out.println(sformatowanyString);
    }
    
}
