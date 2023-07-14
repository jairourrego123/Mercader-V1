package com.elmercader.catalogo.models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name="users")
public class User implements Serializable {

    //Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 80,nullable = false)
    private String userName;
    @Column(length = 50,nullable = false,unique = true)
    private String userEmail;
    @Column(length = 50,nullable = false)
    private String userPassword;

    /**
     * Get Id user
     * @return
     */

    public Integer getId() {
        return id;
    }


    /**
     * Get name User
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set name User
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Get Email User
     * @return
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Set Email User
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * Get Password User
     * @return
     */

    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Set Password User
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
