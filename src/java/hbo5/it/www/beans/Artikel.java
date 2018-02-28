/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.beans;

/**
 *
 * @author c1042421
 */
public class Artikel {
    protected int nummer;
    protected String naam;
    protected double eenheidsprijs;

    public Artikel() {
    }

    public Artikel(int nummer) {
        this.nummer = nummer;
    }

    public Artikel(int nummer, String naam, double eenheidsprijs) {
        this.nummer = nummer;
        this.naam = naam;
        this.eenheidsprijs = eenheidsprijs;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getEenheidsprijs() {
        return eenheidsprijs;
    }

    public void setEenheidsprijs(double eenheidsprijs) {
        this.eenheidsprijs = eenheidsprijs;
    }

    @Override
    public String toString() {
        return nummer + " " + naam + ": " + eenheidsprijs;
    }
    
    
}
