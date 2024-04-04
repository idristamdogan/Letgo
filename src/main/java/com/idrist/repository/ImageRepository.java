package com.idrist.repository;

import com.idrist.entity.Image;
import com.idrist.entity.User;

public class ImageRepository extends RepositoryManager<Image, Long>{
    public ImageRepository() {
        super(Image.class);
    }
}
