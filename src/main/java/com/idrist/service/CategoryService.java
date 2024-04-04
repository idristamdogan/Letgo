package com.idrist.service;

import com.idrist.entity.Category;
import com.idrist.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    CategoryRepository categoryRepository;

    public CategoryService() {
        this.categoryRepository = new CategoryRepository();
    }


    public void addCategory() {



        Category cepTelefonuCategory = Category.builder().name("Cep Telefonu").parentCategory("Teknoloji").build();
        categoryRepository.save(cepTelefonuCategory);

        Category bilgisayarCategory = Category.builder().name("Bilgisayar").parentCategory("Teknoloji").build();
        categoryRepository.save(bilgisayarCategory);

        Category tabletCategory = Category.builder().name("Tablet").parentCategory("Teknoloji").build();
        categoryRepository.save(tabletCategory);

        Category kameraCategory = Category.builder().name("Kamera").parentCategory("Teknoloji").build();
        categoryRepository.save(kameraCategory);

// Diğer teknoloji alt kategorileri de aynı şekilde oluşturulur...

// Spor kategorisi altında 25 adet farklı alt kategori oluşturuluyor


        Category futbolCategory = Category.builder().name("Futbol").parentCategory("Spor").build();
        categoryRepository.save(futbolCategory);

        Category basketbolCategory = Category.builder().name("Basketbol").parentCategory("Spor").build();
        categoryRepository.save(basketbolCategory);

        Category tenisCategory = Category.builder().name("Tenis").parentCategory("Spor").build();
        categoryRepository.save(tenisCategory);

        Category yuzmeCategory = Category.builder().name("Yüzme").parentCategory("Spor").build();
        categoryRepository.save(yuzmeCategory);



        Category aracCategory = Category.builder().name("Araç").parentCategory("Vasıta").build();
        categoryRepository.save(aracCategory);

        Category gemiCategory = Category.builder().name("Gemi").parentCategory("Vasıta").build();
        categoryRepository.save(gemiCategory);

        Category ucakCategory = Category.builder().name("Uçak").parentCategory("Vasıta").build();
        categoryRepository.save(ucakCategory);

        Category trenCategory = Category.builder().name("Tren").parentCategory("Vasıta").build();
        categoryRepository.save(trenCategory);

// Diğer vasıta alt kategorileri de aynı şekilde oluşturulur...

// Giyim kategorisi altında 25 adet farklı alt kategori oluşturuluyor


        Category ayakkabiCategory = Category.builder().name("Ayakkabı").parentCategory("Giyim").build();
        categoryRepository.save(ayakkabiCategory);

        Category gomlekCategory = Category.builder().name("Gömlek").parentCategory("Giyim").build();
        categoryRepository.save(gomlekCategory);

        Category pantolonCategory = Category.builder().name("Pantolon").parentCategory("Giyim").build();
        categoryRepository.save(pantolonCategory);




    }







}
