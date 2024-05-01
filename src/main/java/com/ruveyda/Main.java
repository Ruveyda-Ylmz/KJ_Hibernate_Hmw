package com.ruveyda;

import com.ruveyda.entity.*;
import com.ruveyda.repository.DenemeRepository;
import com.ruveyda.service.OgrenciService;
import com.ruveyda.service.OgretmenService;
import com.ruveyda.service.SinifOgretmenService;
import com.ruveyda.service.SinifService;
import com.ruveyda.utility.enums.EBrans;

public class Main {
    static SinifService sinifService = new SinifService();
    static  OgretmenService ogretmenService = new OgretmenService();
    static  OgrenciService ogrenciService= new OgrenciService();
    static   SinifOgretmenService sinifOgretmenService = new SinifOgretmenService();

    public static void main(String[] args) {
//        DenemeRepository denemeRepository = new DenemeRepository();
//        denemeRepository.save(new Deneme()); //tabloyu oluşturacak


        Sinif sinif = Sinif.builder()
                .sinif_Adi("13-A")
                .build();
        sinifService.saveSinif(sinif);

        Ogretmen ogretmen1 = Ogretmen.builder()
                .kisisel_Bilgiler(KisiselBilgiler.builder()
                        .isim("Alperen")
                        .soyisim("İkinci")
                        .tcKimlik("12341234")
                        .build())
                .brands(EBrans.FIZIK)
                .build();
        Ogretmen ogretmen2 = Ogretmen.builder()
                .kisisel_Bilgiler(KisiselBilgiler.builder()
                        .isim("Muhammet Ali")
                        .soyisim("Kaya")
                        .tcKimlik("1234125")
                        .build())
                .brands(EBrans.MATEMATIK)
                .build();
        ogretmenService.saveOgretmen(ogretmen1);
        ogretmenService.saveOgretmen(ogretmen2);

        SinifOgretmenler sinifOgretmen1 = SinifOgretmenler.builder()
                .Sinif_Id(sinif.getId())
                .Ogretmen_Id(ogretmen1.getId())
                .build();
        SinifOgretmenler sinifOgretmen2 = SinifOgretmenler.builder()
                .Sinif_Id(sinif.getId())
                .Ogretmen_Id(ogretmen2.getId())
                .build();
        sinifOgretmenService.saveSinifOgretmen(sinifOgretmen1);
        sinifOgretmenService.saveSinifOgretmen(sinifOgretmen2);


        Ogrenci ogrenci1 = Ogrenci.builder()
                .Sinif_Id(sinif.getId())
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Yusuf")
                        .soyisim("Akbaş")
                        .tcKimlik("12345678910")
                        .build())
                .dogum_Tarihi(123412356L)
                .build();
        Ogrenci ogrenci2 = Ogrenci.builder()
                .Sinif_Id(sinif.getId())
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Rüveyda")
                        .soyisim("Yılmaz")
                        .tcKimlik("31265789")
                        .build())
                .dogum_Tarihi(46547489L)
                .build();
        ogrenciService.saveOgrenci(ogrenci1);
        ogrenciService.saveOgrenci(ogrenci2);





    }
}