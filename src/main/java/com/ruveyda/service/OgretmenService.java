package com.ruveyda.service;

import com.ruveyda.entity.Ogrenci;
import com.ruveyda.entity.Ogretmen;
import com.ruveyda.repository.OgrenciRepository;
import com.ruveyda.repository.OgretmenRepository;

public class OgretmenService {
    OgretmenRepository ogretmenRepository;

    public OgretmenService() {

        this.ogretmenRepository= new OgretmenRepository();
    }

    public Ogretmen saveOgretmen(Ogretmen ogretmen){
        return ogretmenRepository.save(ogretmen);
    }
}
