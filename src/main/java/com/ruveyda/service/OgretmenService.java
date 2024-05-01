package com.ruveyda.service;

import com.ruveyda.entity.Ogrenci;
import com.ruveyda.entity.Ogretmen;
import com.ruveyda.entity.Sinif;
import com.ruveyda.repository.OgrenciRepository;
import com.ruveyda.repository.OgretmenRepository;

import java.util.List;

public class OgretmenService {
    OgretmenRepository ogretmenRepository;

    public OgretmenService() {
        this.ogretmenRepository= new OgretmenRepository();
    }
    public Ogretmen saveOgretmen(Ogretmen ogretmen){
        ogretmen.setIse_Baslama_Tarihi(System.currentTimeMillis());
        return ogretmenRepository.save(ogretmen);
    }
    public List<Sinif> getSiniflarByOgretmenId(Long id){
        if(ogretmenRepository.findById(id).isEmpty()){
            return null;
        } else{
            return ogretmenRepository.getSiniflarByOgretmenId(id);
        }
    }
    public List<Ogretmen> findAll(){
        return ogretmenRepository.findAll();
    }
}
