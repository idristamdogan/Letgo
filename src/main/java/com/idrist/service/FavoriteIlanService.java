package com.idrist.service;

import com.idrist.repository.FavoriteIlanRepository;

public class FavoriteIlanService {
    FavoriteIlanRepository favoriteIlanRepository;

    public FavoriteIlanService() {
        this.favoriteIlanRepository = new FavoriteIlanRepository();
    }
}
