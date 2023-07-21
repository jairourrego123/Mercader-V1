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
            return false;
    }

    /**
     * Service Validate User
     * @param email
     * @param password
     * @return User or null
     */
    public  Optional<User> validateUserLogin(String email,String password){
            if (Utilities.validateEmail(email)) {
                Optional<User> temp = userRepository.validateLogin(email, password);
                if (temp.isPresent())
                    return temp;
                else{
                    User user = new User();
                    user.setEmail(email);
                    user.setPassword(password);
                    user.setName("NO DEFINIDO");
                    return Optional.of(user);
                }


            }
            else
                return  null;


    }

    /**
     * Save users
     * @param user
     * @return User or Null
     */
    public User saveUser(User user){
        if ((user.getEmail()!=null)&&(user.getPassword()!=null))
            if ((Utilities.validateEmail(user.getEmail())) && (user.getPassword().length()>6))
                return userRepository.saveUser(user);
            else
                return null;
        else
            return  null;

        //return userRepository.saveUser(user);
    }

}
