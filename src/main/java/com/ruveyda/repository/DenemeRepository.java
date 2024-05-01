package com.ruveyda.repository;

import com.ruveyda.entity.Deneme;

public class DenemeRepository extends RepositoryManager<Deneme,Long>{
    public  DenemeRepository(){
        super(new Deneme());
    }

}
