/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvclistdetailapp;

import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
public class PlayerList {
    private final ArrayList<Player> playerList;

    public PlayerList() {
        playerList = new ArrayList<>();
        addPlayersToList();
    }

    private void addPlayersToList() {
        getListOfPlayers().add(new Player(new String[] {"Barack", "Obama", "31", "30 years old"}));
        getListOfPlayers().add(new Player(new String[] {"Donald", "Trump", "32", "20 years old"}));
        getListOfPlayers().add(new Player(new String[] {"Michael", "Jackson", "29", "18 years old"}));
    }

    public ArrayList<Player> getListOfPlayers() {
        return playerList;
    }
}
