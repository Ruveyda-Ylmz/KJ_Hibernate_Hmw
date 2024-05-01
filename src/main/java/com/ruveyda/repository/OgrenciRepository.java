package com.ruveyda.repository;

import com.ruveyda.entity.Ogrenci;

public class OgrenciRepository extends RepositoryManager<Ogrenci,Long> {
    public OgrenciRepository(){
        super(new Ogrenci());
    }
}
