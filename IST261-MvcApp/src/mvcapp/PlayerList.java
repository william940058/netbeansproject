/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcapp;

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
        getListOfPlayers().add(new Player(new String[] {"Barack", "Obama", "31"}));
        getListOfPlayers().add(new Player(new String[] {"Donald", "Trump", "32"}));
        getListOfPlayers().add(new Player(new String[] {"Michael", "Jackson", "29"}));
    }

    public ArrayList<Player> getListOfPlayers() {
        return playerList;
    }
}
