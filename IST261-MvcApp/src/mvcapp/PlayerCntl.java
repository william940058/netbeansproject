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
public class PlayerCntl {
    private static final int STARTING_INDEX_OF_DISPLAY = 0;
    PlayerList playerList;
    PlayerUI playerUI;

    public PlayerCntl() {
        playerList = new PlayerList();
        playerUI = new PlayerUI(this, STARTING_INDEX_OF_DISPLAY); // pass 0 so UI starts at first element in list
        playerUI.setVisible(true);
    }
    public Player getPlayer(int index){
        ArrayList<Player> newList = playerList.getListOfPlayers();
        Player list = newList.get(index);
        String[] studentInfo = {list.getFirstName(), list.getLastName(), list.getNumber()};
        return new Player(studentInfo);
    }
    public PlayerList getPlayerList() {
        return playerList;
    }

    public void addNewPlayer() {
        String[] list4 = {"Saquon", "Barkley", "44"};
        playerList.getListOfPlayers().add(new Player(list4));
    }
    public void deletePlayer(int index) {
        playerList.getListOfPlayers().remove(index);
        if(playerList.getListOfPlayers().isEmpty()){
            System.exit(0);
        }
        else{
            playerUI.refreshDisplayWithNewValues(playerList.getListOfPlayers().size());
        }
    }
    public void editPlayer(int index){
        String[] editList = {playerUI.editFirst(), playerUI.editLast(), playerUI.editNumber()};
        playerList.getListOfPlayers().set(index, new Player(editList));
    }
    
}
