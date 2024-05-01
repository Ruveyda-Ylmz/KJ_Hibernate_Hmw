package com.ruveyda.utility;

import com.ruveyda.entity.*;
import com.ruveyda.service.OgrenciService;
import com.ruveyda.service.OgretmenService;
import com.ruveyda.service.SinifOgretmenService;
import com.ruveyda.service.SinifService;
import com.ruveyda.utility.enums.EBrans;

public class DataGenerator {

    //TODO Initialization metot içinde yapıldığında veri üretilmiyor neden?
    SinifService sinifService;
    OgretmenService ogretmenService;
    SinifOgretmenService sinifOgretmenService;
    OgrenciService ogrenciService;

    public DataGenerator() {
        this.sinifService = new SinifService();
        this.ogretmenService = new OgretmenService();
        this.sinifOgretmenService = new SinifOgretmenService();
        this.ogrenciService = new OgrenciService();
    }

    public void dataOlustur() {
        siniflariOlustur();
        ogretmenleriOlustur();
        sinifOgretmenEsle();
        ogrencileriOlustur();
    }

    public void siniflariOlustur() {
//        SinifService sinifService = new SinifService();
        Sinif sinif = Sinif.builder()
                .sinif_Adi("9-A")
                .build();
        sinifService.saveSinif(sinif);
        Sinif sinif2 = Sinif.builder()
                .sinif_Adi("10-A")
                .build();
        sinifService.saveSinif(sinif2);
        Sinif sinif3 = Sinif.builder()
                .sinif_Adi("11-A")
                .build();
        sinifService.saveSinif(sinif3);
    }

    public  void ogretmenleriOlustur() {
//        OgretmenService ogretmenService = new OgretmenService();
        Ogretmen ogretmen1 = Ogretmen.builder()
                .kisisel_Bilgiler(KisiselBilgiler.builder()
                        .isim("Alperen")
                        .soyisim("Ikinci")
                        .tcKimlik("12341234")
                        .build())
                .brands(EBrans.FIZIK)
                .build();
        ogretmenService.saveOgretmen(ogretmen1);

        Ogretmen ogretmen2 = Ogretmen.builder()
                .kisisel_Bilgiler(KisiselBilgiler.builder()
                        .isim("Muhammet Ali")
                        .soyisim("Kaya")
                        .tcKimlik("1234125")
                        .build())
                .brands(EBrans.MATEMATIK)
                .build();
        ogretmenService.saveOgretmen(ogretmen2);

        Ogretmen ogretmen3 = Ogretmen.builder()
                .kisisel_Bilgiler(KisiselBilgiler.builder()
                        .isim("Mehmet")
                        .soyisim("Gocmen")
                        .tcKimlik("124125")
                        .build())
                .brands(EBrans.MATEMATIK)
                .build();
        ogretmenService.saveOgretmen(ogretmen3);
        Ogretmen ogretmen4 = Ogretmen.builder()
                .kisisel_Bilgiler(KisiselBilgiler.builder()
                        .isim("Cagri")
                        .soyisim("Turkmen")
                        .tcKimlik("12124125")
                        .build())
                .brands(EBrans.FIZIK)
                .build();
        ogretmenService.saveOgretmen(ogretmen4);
    }

    public  void sinifOgretmenEsle() {
//        SinifOgretmenService sinifOgretmenService = new SinifOgretmenService();
        SinifOgretmenler sinifOgretmen1 = SinifOgretmenler.builder()
                .Sinif_Id(1L)
                .Ogretmen_Id(1L)
                .build();
        sinifOgretmenService.saveSinifOgretmen(sinifOgretmen1);

        SinifOgretmenler sinifOgretmen2 = SinifOgretmenler.builder()
                .Sinif_Id(1L)
                .Ogretmen_Id(2L)
                .build();
        sinifOgretmenService.saveSinifOgretmen(sinifOgretmen2);

        SinifOgretmenler sinifOgretmen3 = SinifOgretmenler.builder()
                .Sinif_Id(2L)
                .Ogretmen_Id(1L)
                .build();
        sinifOgretmenService.saveSinifOgretmen(sinifOgretmen3);
        SinifOgretmenler sinifOgretmen4 = SinifOgretmenler.builder()
                .Sinif_Id(2L)
                .Ogretmen_Id(3L)
                .build();
        sinifOgretmenService.saveSinifOgretmen(sinifOgretmen4);

        SinifOgretmenler sinifOgretmen5 = SinifOgretmenler.builder()
                .Sinif_Id(3L)
                .Ogretmen_Id(3L)
                .build();
        sinifOgretmenService.saveSinifOgretmen(sinifOgretmen5);
        SinifOgretmenler sinifOgretmen6 = SinifOgretmenler.builder()
                .Sinif_Id(3L)
                .Ogretmen_Id(4L)
                .build();
        sinifOgretmenService.saveSinifOgretmen(sinifOgretmen6);
    }

    public void ogrencileriOlustur() {
//        OgrenciService ogrenciService = new OgrenciService();
        Ogrenci ogrenci1 = Ogrenci.builder()
                .Sinif_Id(1L)
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Yusuf")
                        .soyisim("Akbas")
                        .tcKimlik("12345678910")
                        .build())
                .dogum_Tarihi(123412356L)
                .build();
        ogrenciService.saveOgrenci(ogrenci1);

        Ogrenci ogrenci2 = Ogrenci.builder()
                .Sinif_Id(1L)
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Ruveyda")
                        .soyisim("Yilmaz")
                        .tcKimlik("31265789")
                        .build())
                .dogum_Tarihi(46547489L)
                .build();
        ogrenciService.saveOgrenci(ogrenci2);

        Ogrenci ogrenci3 = Ogrenci.builder()
                .Sinif_Id(1L)
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Aziz")
                        .soyisim("Bilgin")
                        .tcKimlik("123")
                        .build())
                .dogum_Tarihi(4547489L)
                .build();
        ogrenciService.saveOgrenci(ogrenci3);

        // Sınıf 2 için öğrencilerin oluşturulması
        for (int i = 0; i < 3 + (int) (Math.random() * 3); i++) {
            Ogrenci ogrenci = Ogrenci.builder()
                    .Sinif_Id(2L)
                    .kisiselBilgiler(KisiselBilgiler.builder()
                            .isim("Isim" + (i + 1))
                            .soyisim("Soyisim" + (i + 1))
                            .tcKimlik("123456789" + (i + 1))
                            .build())
                    .dogum_Tarihi(123412356L)
                    .build();
            ogrenciService.saveOgrenci(ogrenci);
        }

        // Sınıf 3 için öğrencilerin oluşturulması
        for (int i = 0; i < 3 + (int) (Math.random() * 3); i++) {
            Ogrenci ogrenci = Ogrenci.builder()
                    .Sinif_Id(3L)
                    .kisiselBilgiler(KisiselBilgiler.builder()
                            .isim("Isim" + (i + 1))
                            .soyisim("Soyisim" + (i + 1))
                            .tcKimlik("987654321" + (i + 1))
                            .build())
                    .dogum_Tarihi(123412356L)
                    .build();
            ogrenciService.saveOgrenci(ogrenci);
        }
    }


}
