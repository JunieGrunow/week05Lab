/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.io.Serializable;

/**
 *
 * @author nuket
 */
public class User implements Serializable{
    private String username;
    private String password;
    
    public User(){
        this.username = "";
        this.password = "";
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    
}
