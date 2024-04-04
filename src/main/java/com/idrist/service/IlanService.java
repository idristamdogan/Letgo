package com.idrist.service;

import com.idrist.entity.Category;
import com.idrist.entity.Ilan;
import com.idrist.entity.enums.Status;
import com.idrist.repository.CategoryRepository;
import com.idrist.repository.IlanRepository;
import com.idrist.utility.SessionContext;

import java.util.List;
import java.util.Optional;

import static com.idrist.Runner.imageService;
import static com.idrist.Runner.scanner;


public class IlanService {

    CategoryService categoryService=new CategoryService();
    IlanRepository ilanRepository;

    public IlanService() {
        this.categoryService=new CategoryService();
        this.ilanRepository = new IlanRepository();
    }



    public void ilanver() {
        categoryService.categoryRepository.getAllParentCategories().forEach(System.out::println);
        System.out.println("bir kategori seçiniz");
        String ustkategori=scanner.nextLine();
        categoryService.categoryRepository.getCategoriesByParentName(ustkategori).forEach(System.out::println);
        System.out.println("bir kategori seçiniz");
        String altkategori=scanner.nextLine();

        System.out.println("ilan başlık girin");
        String title=scanner.nextLine();
        System.out.println("açıklma giriniz");
        String aciklama=scanner.nextLine();
        System.out.println("lokasyon giriniz");
        String location=scanner.nextLine();
        System.out.println("fiyat giriniz");
        Double fiyat=scanner.nextDouble();

        List<Category> category = categoryService.categoryRepository.findByColumnAndValue("name", altkategori);


        Ilan ilan= Ilan.builder().title(title).category(category.getFirst()).description(aciklama)
                .location(location).price(fiyat).user(SessionContext
                        .getLoggedInUser()).status(Status.ACTIVE).build();


        ilanRepository.save(ilan);
        imageService.adImage(ilan);



    }

    public void tumilanlarilistele() {




            ilanRepository.findAll().forEach(ilan ->{
                System.out.println("Id: " + ilan.getId());
                System.out.println("Başlık: " + ilan.getTitle());
                System.out.println("Resimler:");
                if(!ilan.getImages().isEmpty())
                System.out.println(ilan.getImages().getFirst().getImageurl());
                System.out.println();
            });


}

public void ilanDetay(){
        tumilanlarilistele();
    System.out.println("hangi ilan detayı görmek istiyosun");
    Long secim=scanner.nextLong();scanner.nextLine();
    Optional<Ilan> optionalIlan = ilanRepository.findById(secim);
    Ilan ilan = optionalIlan.get();


        System.out.println("Id: " + ilan.getId());
        System.out.println("user "+ ilan.getUser().getUsername());
        System.out.println("Başlık: " + ilan.getTitle());
        System.out.println("Resimler:");
     ilan.getImages().forEach(image -> System.out.println(image.getImageurl()));
        System.out.println("açıklama" + ilan.getDescription());
        System.out.println("lokasyon" + ilan.getLocation());
        System.out.println("fiyat" + ilan.getPrice());
        System.out.println("tarih"+ ilan.getCreateAt());
        System.out.println();
    ;
}

}
