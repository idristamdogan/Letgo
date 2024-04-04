package com.idrist.repository;

import com.idrist.entity.Ilan;


public class IlanRepository extends RepositoryManager<Ilan, Long>{

    public IlanRepository() {
        super(Ilan.class);
    }
}
