package com.ruveyda;

import com.ruveyda.entity.Deneme;
import com.ruveyda.repository.DenemeRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DenemeRepository denemeRepository = new DenemeRepository();
        denemeRepository.save(new Deneme());
    }
}