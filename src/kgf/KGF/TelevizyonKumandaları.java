/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgf.KGF;

import java.util.Date;
import java.util.Random;
//import java.util.Scanner;

/**
 *
 * @author ASUS
 */
   //ŞEYMANUR DEMİRBAŞ 180205006
public class TelevizyonKumandaları extends Kumandalar implements AkıllıTelevizyon{
    Random rnd=new Random();
    private final String markaAdi;
    private Pil pil= new Pil();
    private int ses;
    private int kanal;
    private String id="Tv-";
    private static int TvKumandaAdet=0;

    public TelevizyonKumandaları() {
        this.markaAdi = null;
    }

    public TelevizyonKumandaları(String markaAdi) {
        this.markaAdi = markaAdi;
    }

    public TelevizyonKumandaları(String markaAdi, int ses, int kanal) {
        this.markaAdi = markaAdi;      
        this.ses = ses;
        this.kanal = kanal;
    }

    public TelevizyonKumandaları(String markaAdi, int tusSayisi, int pilSayisi, Date uretimTarihi, boolean cihazDurum) {
        super(tusSayisi, pilSayisi, uretimTarihi, cihazDurum);
        this.markaAdi = markaAdi;
    }

    public TelevizyonKumandaları(String markaAdi, int ses, int kanal, int tusSayisi, int pilSayisi, Date uretimTarihi,
            boolean cihazDurum,String tür,int voltaj) {
        super(tusSayisi, pilSayisi, uretimTarihi, cihazDurum);
        
        TvKumandaAdet+=1;
        this.markaAdi = markaAdi;        
        this.ses = ses;
        this.kanal = kanal;
        id+=Math.abs(rnd.nextLong());
       
        pil.setTvPilTürü(tür);
        pil.setTvVoltaj(voltaj);
    }

 
    public int getSes() {
        return ses;
    }

    public void setSes(int ses) {
        this.ses = ses;
    }

    public int getKanal() {
        return kanal;
    }

    public void setKanal(int kanal) {
        this.kanal = kanal;
    }
    
    
    public void sesArtır()
   {
       if(isCihazDurum()==true)
       {
          if(ses>=0&& ses<30)          
          this.ses++;  
       }
            
       
   }
   public void sesAzalt()
   {
       if(isCihazDurum()==true)
       {
        if(ses>0&& ses<=30)
         this.ses--;
       }
       
       
   }
   
   public void kanalİleri()
   {
       if(isCihazDurum()==true)
       {
           if(kanal>=0 && kanal<500)      
           this.kanal++;
       }
       
              
       
   }
   
   public void kanalGeri()
   {
       if(isCihazDurum()==true)
       {
           if(kanal>0 && kanal<=500)      
           this.kanal--;
       }
       
       
            
   }
   
   public void istenilenKanalaGit(int kanal)
   {
        if(isCihazDurum()==true)
        {
            if(kanal>0&& kanal<=500)
          {
              this.setKanal(kanal);
              System.out.println("Kanal:"+ this.getKanal());
                                    
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
            setCihazDurum(false);
        System.out.println("Cihaz Kapandı ! ! !");
        
    }

    @Override
    public void pilBitiyor() {
        System.out.println("Piliniz bitmektedir !!!!");
    }

    @Override
    public void interneteGir() {
        System.out.println("İnternetten televizyona girebilirsiniz");
        
    }

    @Override
    public void uygulamaYukle() {
        System.out.println("Televizyonunuza uygulama yükleyebilirsiniz");
        
        
    }

    @Override
    public void wifiBaglan() {
        System.out.println("Televizyondan kablosuz ağa bağlanabilirsiniz.");
        
    }
    
    
    
    
    
}
