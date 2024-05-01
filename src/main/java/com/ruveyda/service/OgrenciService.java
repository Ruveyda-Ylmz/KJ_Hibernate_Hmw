package com.ruveyda.service;

import com.ruveyda.entity.Ogrenci;
import com.ruveyda.repository.OgrenciRepository;

public class OgrenciService {
    OgrenciRepository ogrenciRepository;

    public OgrenciService() {
        this.ogrenciRepository = new OgrenciRepository();
    }

    public Ogrenci saveOgrenci(Ogrenci ogrenci){
        return ogrenciRepository.save(ogrenci);
    }
}
