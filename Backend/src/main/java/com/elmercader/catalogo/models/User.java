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
    @Column(length = 50,nullable = false,unique = true)
    private String email;
    @Column(length = 50,nullable = false)
    private String password;

    @Column(length = 80,nullable = false)
    private String name;

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
    public String getName() {
        return name;
    }

    /**
     * Set name User
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Email User
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set Email User
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get Password User
     * @return
     */

    public String getPassword() {
        return password;
    }

    /**
     * Set Password User
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
