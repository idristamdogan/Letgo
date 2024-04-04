package com.idrist.service;

import com.idrist.entity.Ilan;
import com.idrist.entity.Image;
import com.idrist.repository.IlanRepository;
import com.idrist.repository.ImageRepository;

import java.util.List;
import java.util.Scanner;

public class ImageService {
    IlanRepository ilanRepository;
    ImageRepository imageRepository;
    public ImageService() {

        this.imageRepository=new ImageRepository();
        this.ilanRepository = new IlanRepository();
    }


    Scanner scanner=new Scanner(System.in);

    public void adImage(Ilan ilan){
        for (int i = 0; i < 10; i++) {

            System.out.println("İmage url giriniz çıkmak için 0 basınız");
            String image = scanner.nextLine();
            if(!image.equals("0")){

                Image image1 = Image.builder().ilan(ilan).imageurl(image).build();
                imageRepository.save(image1);
                ilan.builder().images(List.of(image1)).build();



            }else {
                i=10;
            }


        }
    }
}
