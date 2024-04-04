package com.idrist.service;

import com.idrist.utility.SessionContext;
import com.idrist.entity.User;
import com.idrist.repository.UserRepository;

import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
    UserRepository userRepository;

    public UserService() {
        this.userRepository =new UserRepository();
    }


        public void register() {
            Scanner sc = new Scanner(System.in);
            boolean flag=true;

            String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
            String email = "";
            do {
                System.out.println("Enter email address");
                email = sc.nextLine();
                Pattern pattern = Pattern.compile(emailRegex);
                Matcher matcher = pattern.matcher(email);
                if (matcher.find()) {
                    System.out.println("E-posta adresi uygun " + matcher.group());
                    flag = false;
                }
                else {
                    System.out.println("E-posta adresi uygun degil");
                }
            }while (flag);

            System.out.println("Enter a username");
            String username = sc.nextLine();
            System.out.println("Enter a password");
            String password = sc.nextLine();
            System.out.println("Enter phone number");
            String phoneNumber = sc.nextLine();
            System.out.println("Add a profile picture");
            String profilePicture = sc.nextLine();
            System.out.println("Enter location");
            String location = sc.nextLine();

            User user = User.builder()
                    .email(email)
                    .username(username)
                    .password(password)
                    .phone(phoneNumber)
                    .profileimageurl(profilePicture)
                    .location(location)
                    .build();
            userRepository.save(user);
        }
    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();


        Optional<User> userOptional=userRepository.findByColumnAndValue("username",username)
                .stream()
                .filter(user -> user.getPassword().equals(password))
                .findFirst();
        if (userOptional.isPresent()) {
            System.out.println("Login success");
            SessionContext.setLoggedInUser(userOptional.get());

        }
        else {
            System.out.println("Login failed");
        }
    }




}
