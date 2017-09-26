
package com.models.crm;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Petar
 */
@Entity
@Table(name = "USERS")
public class User implements Serializable {

    public User() {
    }

    public User(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    
    @Column(name = "email",unique = true)
    private String email;
    
    @Column(name = "username", unique = true)
    private String userName;
    
    @Column(name = "password")
    private String password;
    

    public int getUserID() {
        return userID;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
