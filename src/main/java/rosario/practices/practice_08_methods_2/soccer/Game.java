/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosario.practices.practice_08_methods_2.soccer;

import rosario.practices.practice_08_methods_2.utility.GameUtils;

/**
 *
 * @author rosario
 */
public class Game {

    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    public void playGame() {
        Game currGame = this;
        int numberOfGoals = (int) (Math.random() * 7);
        //System.out.println(numberOfGoals);
        Goal[] theGoals = new Goal[numberOfGoals];
        currGame.goals = theGoals;
        GameUtils.addGameGoals(currGame);
    }

    public String getDescription() {
        // Print out goal details
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal : this.goals) {
            returnString.append("Goal scored after "
                    + currGoal.theTime + " mins by "
                    + currGoal.thePlayer.playerName + " of "
                    + currGoal.theTeam.teamName
                    + "\n");
        }
        return returnString.toString();
    }
}
