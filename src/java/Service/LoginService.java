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
public class LoginService implements Serializable{
    User abe = new User("abe","password");
    User barb = new User("barb","password");
    public User logIn(String username,String password){
        if(username.equals(abe.getUsername())&&password.equals(abe.getPassword())){
            return abe;
        }
        if(username.equals(barb.getUsername())&&password.equals(barb.getPassword())){
            return barb;
        }
        return null;
    }
    
}
