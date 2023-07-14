package com.elmercader.catalogo.services;

import com.elmercader.catalogo.models.User;
import com.elmercader.catalogo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    /**
     * Get all Users
     * @return
     */
    public List<User> getAllUsers(){
        return userRepository.getAll();
    }

    /**
     * Service Validate User  By Emal
     * @param email
     * @return True if exist this email  or null
     */
    public Boolean getUserByEmail(String email){

        if (Utilities.validateEmail(email)) {
            Optional<User> user = userRepository.getByEmail(email);
            return user.isPresent();
        }
        else
            return null;
    }

    /**
     * Service Validate User
     * @param email
     * @param password
     * @return User or null
     */
    public  Optional<User> validateUserLogin(String email,String password){
            if (Utilities.validateEmail(email))
                return userRepository.validateLogin(email,password);

            else
                return  null;


    }

    /**
     * Save users
     * @param user
     * @return User or Null
     */
    public User saveUser(User user){
        if ((user.getUserEmail()!=null)&&(user.getUserPassword()!=null))
            if ((Utilities.validateEmail(user.getUserEmail())) && (user.getUserPassword().length()>6))
                return userRepository.saveUser(user);
            else
                return null;
        else
            return  null;

        //return userRepository.saveUser(user);
    }

}
