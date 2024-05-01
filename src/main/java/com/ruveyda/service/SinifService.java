package com.ruveyda.service;

import com.ruveyda.entity.Ogrenci;
import com.ruveyda.entity.Sinif;
import com.ruveyda.repository.OgrenciRepository;
import com.ruveyda.repository.SinifRepository;

import java.util.List;

public class SinifService {
    SinifRepository sinifRepository;

    public SinifService() {
        this.sinifRepository = new SinifRepository();
    }

    public Sinif saveSinif(Sinif sinif){
        return sinifRepository.save(sinif);
    }
    public List<Sinif> findAll(){
        return sinifRepository.findAll();
    }
}
