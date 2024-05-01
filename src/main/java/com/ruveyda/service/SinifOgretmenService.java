package com.ruveyda.service;

import com.ruveyda.entity.SinifOgretmenler;
import com.ruveyda.repository.SinifOgretmenlerRepository;

public class SinifOgretmenService {
    SinifOgretmenlerRepository  sinifOgretmenlerRepository;

    public SinifOgretmenService() {
        this.sinifOgretmenlerRepository = new SinifOgretmenlerRepository();
    }

    public SinifOgretmenler saveSinifOgretmen (SinifOgretmenler sinifOgretmenler){
        return sinifOgretmenlerRepository.save(sinifOgretmenler);
    }

}
