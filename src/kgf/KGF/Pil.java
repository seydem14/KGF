/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgf.KGF;

/**
 *
 * @author ASUS
 */
  //ŞEYMANUR DEMİRBAŞ 180205006
public class Pil {
    
    private String klimaPilTürü;
    private String tvPilTürü;
    private int klimaVoltaj;
    private int tvVoltaj;

    public Pil() {
    }

    public Pil(String klimaPilTürü, String tvPilTürü, int klimaVoltaj, int tvVoltaj) {
        this.klimaPilTürü = klimaPilTürü;
        this.tvPilTürü = tvPilTürü;
        this.klimaVoltaj = klimaVoltaj;
        this.tvVoltaj = tvVoltaj;
        
        
    }

    public String getKlimaPilTürü() {
        return klimaPilTürü;
    }

    public void setKlimaPilTürü(String klimaPilTürü) {
        this.klimaPilTürü = klimaPilTürü;
    }

    public String getTvPilTürü() {
        return tvPilTürü;
    }

    public void setTvPilTürü(String tvPilTürü) {
        this.tvPilTürü = tvPilTürü;
    }

    public int getKlimaVoltaj() {
        return klimaVoltaj;
    }

    public void setKlimaVoltaj(int klimaVoltaj) {
        this.klimaVoltaj = klimaVoltaj;
    }

    public int getTvVoltaj() {
        return tvVoltaj;
    }

    public void setTvVoltaj(int tvVoltaj) {
        this.tvVoltaj = tvVoltaj;
    }
    
   
    
    
    
    
}
