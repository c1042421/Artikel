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
public class Zuivel extends Artikel {
    private int aantalDagen;
    private char leveranciersCode;

    public Zuivel(int nummer) {
        super(nummer);
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public char getLeveranciersCode() {
        return leveranciersCode;
    }

    public void setLeveranciersCode(char leveranciersCode) {
        this.leveranciersCode = leveranciersCode;
    }
    
    public void verlaagVers() {
        aantalDagen--;
    }
    
    public void snelVerkoop(int minDagen){
        eenheidsprijs = aantalDagen <= minDagen ? eenheidsprijs / 2 : eenheidsprijs;
    }
}
