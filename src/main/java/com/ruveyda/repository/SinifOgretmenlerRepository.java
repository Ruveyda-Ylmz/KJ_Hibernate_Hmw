package com.ruveyda.repository;

import com.ruveyda.entity.SinifOgretmenler;

public class SinifOgretmenlerRepository extends RepositoryManager<SinifOgretmenler,Long> {
    public SinifOgretmenlerRepository(){
        super(new SinifOgretmenler());
    }
}
