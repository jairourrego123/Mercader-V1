package com.elmercader.catalogo.repositories;

import com.elmercader.catalogo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class UserRepository {

    @Autowired
    private UserCRUDRepository userCRUDRepository;

    /**
     * Get all Users
     * @return List Users
     */
    public List<User> getAll(){
        return (List<User>) userCRUDRepository.findAll();
    }
    /**
     * Get user by email
     * @param email
     * @return Optional User
     */
    public Optional<User> getByEmail(String email){
        return userCRUDRepository.findByEmail(email);
    }

    /**
     * Validate User using email and password
     * @param email
     * @param password
     * @return Optional User
     */
    public Optional<User> validateLogin(String email, String password){
        return userCRUDRepository.validateLogin(email,password);
    }

    /**
     * Crete User
     * @param user
     * @return User
     */
    public User saveUser(User user){
        return userCRUDRepository.save(user);
    }
}
