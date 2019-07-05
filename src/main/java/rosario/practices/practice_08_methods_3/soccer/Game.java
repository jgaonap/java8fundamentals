/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosario.practices.practice_08_methods_3.soccer;

import rosario.practices.practice_08_methods_3.utility.GameUtils;

/**
 *
 * @author rosario
 */
public class Game {

    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    public void playGame(int maxGoals) {
        int numberOfGoals = (int) (Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);
    }

    public void playGame() {
        playGame(6);
    }

    public String getDescription() {
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
