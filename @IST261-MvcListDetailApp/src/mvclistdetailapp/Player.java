/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvclistdetailapp;

/**
 *
 * @author macbookpro
 */
public class Player {
    private final String firstName;
    private final String lastName;
    private final String number;
    private final String detail;

    public Player(String[] playerInfo) {
        firstName = playerInfo[0];
        lastName = playerInfo[1];
        number = playerInfo[2];
        detail = playerInfo[3];
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumber() {
        return number;
    }
    public String getDetail(){
        return detail;
    }
}
