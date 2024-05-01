package com.ruveyda.repository;

import com.ruveyda.entity.Sinif;

public class SinifRepository extends RepositoryManager<Sinif,Long>{
    public SinifRepository(){
        super(new Sinif());
    }

}
