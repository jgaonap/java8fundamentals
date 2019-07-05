/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rosario.practices.practice_09_EncapConstructors_2.soccer;

/**
 *
 * @author rosario
 */
public class Team {
    
    private String teamName;
    private Player[] playerArray;
    
    /*Add the two constructors*/
    public Team(String teamName, Player[] players){
        this.teamName = teamName;
        this.playerArray = players;
    }
    
    public Team(){}

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
     */
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
    
}
