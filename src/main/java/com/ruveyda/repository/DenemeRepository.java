package com.ruveyda.repository;

import com.ruveyda.entity.Deneme;

public class DenemeRepository extends RepositoryManager<Deneme,Long>{
    public  DenemeRepository(){ //varlık sınıfımın constructorunu oluşturuyoruz
        super(new Deneme());
    }

}
