package com.idrist;

import com.idrist.entity.Category;
import com.idrist.entity.Ilan;
import com.idrist.entity.enums.Status;
import com.idrist.repository.IlanRepository;
import com.idrist.service.CategoryService;
import com.idrist.service.IlanService;
import com.idrist.service.ImageService;
import com.idrist.service.UserService;
import com.idrist.utility.SessionContext;
import jakarta.persistence.EntityManager;

import java.util.Scanner;

public class Runner {
    public static CategoryService categoryService=new CategoryService();
    public static Scanner scanner = new Scanner(System.in);
    public static IlanService ilanService=new IlanService();
    public static ImageService imageService=new ImageService();
    public  static UserService userService=new UserService();
    public static void main(String[] args) {




       // categoryService.addCategory();

  menu();


}

    private static void menu() {
        int secim;
        do {
            System.out.println("*** Ana Menü *******");
            System.out.println("1- Register");
            System.out.println("2- Login");
            System.out.println("3- ÇIKIŞ");
            System.out.println("Secim giriniz");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.println("Register");
                    userService.register();

                    break;
                case 2:
                    System.out.println("login");
                    userService.login();
                    ilanmenu();


                    break;
                case 3:
                    System.out.println("exit");
                    break;
                default:

                    break;
            }
        } while (secim != 3);
        System.out.println("Program sonlandı.");
    }
    private static void ilanmenu() {

        while(true){

            System.out.println("********HOŞGELDİNİZ*********");
            System.out.println("1- ilan ver");
            System.out.println("2- ilanları listele");
            System.out.println("3- ilanlarımı detay görüntüle");
            System.out.println("4- ilan mesaj gönder");

            System.out.println("seçiminizi girinşz");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:

                 ilanService.ilanver();


                    break;

                case 2:

                    ilanService.tumilanlarilistele();


                    break;
                case 3:
                    ilanService.ilanDetay();


                    break;
                default:

                    break;
            }



        }


    }


}
