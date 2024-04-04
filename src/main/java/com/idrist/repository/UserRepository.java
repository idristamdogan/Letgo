package com.idrist.repository;

import com.idrist.entity.User;

public class UserRepository extends RepositoryManager<User, Long>{
    public UserRepository() {super(User.class);

    }


}
