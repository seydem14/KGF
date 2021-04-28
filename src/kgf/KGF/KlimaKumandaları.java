/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgf.KGF;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author ASUS
 */
  //ŞEYMANUR DEMİRBAŞ 180205006
public class KlimaKumandaları extends Kumandalar implements Turbo {
    Random rnd=new Random();
    private final String firmaAdi;
    private int mevcutSicaklik;
    private String id="Kl-";
    private Pil pil=new Pil();    
    private static int klKumandaAdet=0;

    public KlimaKumandaları() {
        this.firmaAdi = null;
    }

    public KlimaKumandaları(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public KlimaKumandaları(String firmaAdi, int mevcutSicaklik) {
        this.firmaAdi = firmaAdi;
        this.mevcutSicaklik = mevcutSicaklik;
        //this.pilTür = pilTür;
    }

    public KlimaKumandaları(String firmaAdi, int tusSayisi, int pilSayisi, Date uretimTarihi, boolean cihazDurum) {
        super(tusSayisi, pilSayisi, uretimTarihi, cihazDurum);
        this.firmaAdi = firmaAdi;
    }

    public KlimaKumandaları(String firmaAdi, int mevcutSicaklik, int tusSayisi, int pilSayisi, Date uretimTarihi,
            boolean cihazDurum,String tür,int voltaj) {
        super(tusSayisi, pilSayisi, uretimTarihi, cihazDurum);
        
        klKumandaAdet+=1;
        this.firmaAdi = firmaAdi;
        this.mevcutSicaklik = mevcutSicaklik;
        id+=Math.abs(rnd.nextLong());
        
        pil.setKlimaPilTürü(tür);
        pil.setKlimaVoltaj(voltaj);
    }

    public int getMevcutSicaklik() {
        return mevcutSicaklik;
    }

    public void setMevcutSicaklik(int mevcutSicaklik) {
        this.mevcutSicaklik = mevcutSicaklik;
    }


    
       
    public void sicaklikArtir()
    {
        if(isCihazDurum()==true)
        {
            if(mevcutSicaklik>=10 && mevcutSicaklik<43)
            {
                this.mevcutSicaklik++;
            }
        }
        
        
    }
    
    
    public void sicaklikAzalt()
    {
         if(isCihazDurum()==true)
         {
             if(mevcutSicaklik>10 && mevcutSicaklik<=43)
             {
                 this.mevcutSicaklik--;
             }
         }
        
        
    }
    
    public void istenilenSicakliğaGit(int sicaklik)
    {
        if(isCihazDurum()==true)
        {
            if(mevcutSicaklik>=10&& mevcutSicaklik<=43)
          {
              this.setMevcutSicaklik(sicaklik);
              System.out.println("Klima:"+ this.getMevcutSicaklik());
                                    
          }
            
        }     
        
    }
    
     
    @Override
    public void cihazAc() {
        if(isCihazDurum()==false)
       {
           setCihazDurum(true);
           System.out.println("Cihaz açık ! ! !");
       }
    }

    @Override
    public void cihazKapat() {
        if(isCihazDurum()==true)
        {
         setCihazDurum(false);
         System.out.println("Cihaz Kapandı ! ! !"); 
        }
              
    }

    @Override
    public void pilBitiyor() {
        System.out.println("piliniz bitmektedir");
        
    }
    
    
    
    

    @Override
    public void turboİsitma() {
        System.out.println("Turbo ısınma mevcuttur");
    }

    @Override
    public void turboSoğutma() {
        System.out.println("Turbo soğutma mevcuttur");
    }
    
    
}
