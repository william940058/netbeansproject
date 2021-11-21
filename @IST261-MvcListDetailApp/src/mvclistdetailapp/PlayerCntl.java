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
public class PlayerCntl {

    private static final int STARTING_INDEX_OF_DISPLAY = 0;
    PlayerList playerList;
    PlayerListUI playerUI;
    PlayerDetailUI playerDetailUI;

    public PlayerCntl() {
        playerList = new PlayerList();
        playerUI = new PlayerListUI(this, STARTING_INDEX_OF_DISPLAY);
        playerUI.setVisible(true);
        playerDetailUI = new PlayerDetailUI(this, STARTING_INDEX_OF_DISPLAY);
        playerDetailUI.setVisible(true);
    }

    public Player getPlayer(int index) {
        ArrayList<Player> newList = playerList.getListOfPlayers();
        Player list = newList.get(index);
        String[] studentInfo = {list.getFirstName(), list.getLastName(), list.getNumber(), list.getDetail()};
        return new Player(studentInfo);
    }

    public Player getDetail(int index) {
        ArrayList<Player> newList = playerList.getListOfPlayers();
        Player list = newList.get(index);
        String[] studentInfo = {list.getFirstName(), list.getLastName(), list.getNumber(), list.getDetail()};
        return new Player(studentInfo);
    }

    public PlayerList getPlayerList() {
        return playerList;
    }

    public void addNewPlayer() {
        String[] list4 = {"Saquon", "Barkley", "44", "23 years old"};
        playerList.getListOfPlayers().add(new Player(list4));
    }

    public void deletePlayer(int index) {
        playerList.getListOfPlayers().remove(index);
        if (playerList.getListOfPlayers().isEmpty()) {
            System.exit(0);
        } else {
            playerUI.refreshDisplayWithNewValues(playerList.getListOfPlayers().size());
        }
    }

    public void editPlayer(int index) {
        String[] editList = {playerUI.editFirst(), playerUI.editLast(), playerUI.editNumber()};
        playerList.getListOfPlayers().set(index, new Player(editList));
    }
}
