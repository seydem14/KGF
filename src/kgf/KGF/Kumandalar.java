/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgf.KGF;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public abstract class Kumandalar {
    //ŞEYMANUR DEMİRBAŞ 180205006 
    
      private static final String firmaAdi="KGF";
      private int tusSayisi;
      private int pilSayisi;
      private Date uretimTarihi;
      private boolean cihazDurum;

    public Kumandalar() {
    }

    public Kumandalar(int tusSayisi, int pilSayisi, Date uretimTarihi, boolean cihazDurum) {
        this.tusSayisi = tusSayisi;
        this.pilSayisi = pilSayisi;
        this.uretimTarihi = uretimTarihi;
        this.cihazDurum = cihazDurum;
    }

    public int getTusSayisi() {
        return tusSayisi;
    }

    public void setTusSayisi(int tusSayisi) {
        this.tusSayisi = tusSayisi;
    }

    public int getPilSayisi() {
        return pilSayisi;
    }

    public void setPilSayisi(int pilSayisi) {
        this.pilSayisi = pilSayisi;
    }

    public Date getUretimTarihi() {
        return uretimTarihi;
    }

    public void setUretimTarihi(Date uretimTarihi) {
        this.uretimTarihi = uretimTarihi;
    }

    public boolean isCihazDurum() {
        return cihazDurum;
    }

    public void setCihazDurum(boolean cihazDurum) {
        this.cihazDurum = cihazDurum;
    }
        
      
      public abstract void cihazAc();
      public abstract void cihazKapat();
      public abstract void pilBitiyor();
      
              
      
      
      
    
}
