/*
Assignment: Final Project Deliverable Football Game
Name: Kaitlyn, Niloofar, Wei-Lun
Project Includes:
-Corrected MVC format and game field bounds
-Fixed player speed (made game more playable)
-Improved visual aspect with football field picture and Penn State logos
-A scoreboard including wins and losses

*We have decided as a group to not add a timer to the game and use wins and losses instead (more realistic for our game)
*We had hoped to have the selected players picture appear in the player block but quickly realized that
it would not work in our current project format (This would be a great feature to add in the future) 

Test Requirements: 
1) Click to run the project
2) The user will see the player panel on the left and the game panel on the right
3) Select a player number at the button of the player panel
    -you will see a message listing the RB player and the LB player
4) At any time during the game the user can select another player number for a new pair
5) Once you have selected the players, click the RB player block (the player closest to the
    player panel)
6) You can now use the keyboard arrows to move RB
7) The goal is to get RB to the other side of the screen (field), without getting caught by the LB player
8) You can also change the speed of the game, by moving the toggle bar at the top of the screen
9) Look up at the scoreboard to see your wins and losses
*/

import Model.Model;
import Controller.Controller;
import View.View;

public class FP_Starter
{
    public static void main(String[] args)
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}