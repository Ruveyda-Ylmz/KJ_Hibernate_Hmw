package com.ruveyda.repository;

import com.ruveyda.entity.Ogretmen;

public class OgretmenRepository extends RepositoryManager<Ogretmen,Long> {
    public OgretmenRepository(){
        super(new Ogretmen());
    }
}
