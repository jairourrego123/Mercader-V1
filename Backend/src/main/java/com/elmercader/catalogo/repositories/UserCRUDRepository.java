package com.elmercader.catalogo.repositories;

import com.elmercader.catalogo.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserCRUDRepository  extends CrudRepository<User,Integer> {
    public Optional<User> findByUserEmail(String userEmail);

    @Query(value = "SELECT * FROM users WHERE userEmail=? AND userPassword=?;",nativeQuery = true)
    public Optional<User> validateLogin(String userEmail,String userPassword);


}
