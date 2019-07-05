/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rosario.practices.practice_07_manipulateformat_1.soccer;

/**
 *
 * @author rosario
 */
public class League {
    public static void main(String[] args) {
        
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = {player1, player2, player3 };
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " + 
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);
        
        /* Practice 7-1. Add code for finding a player within team2 here */
        StringBuilder familyNameFirts = new StringBuilder();
        for(Player player: team2.playerArray){
            if(player.playerName.contains("Saba")){
                System.out.println("Found "+ player.playerName);
                String lastname = player.playerName.split(" ")[1];
                System.out.println("Lastname is: "+ lastname);
            }
        }
        
        for(Player player: team1.playerArray){
            String name[] = player.playerName.split(" ");
            familyNameFirts.append(name[1]);
            familyNameFirts.append(", ");
            familyNameFirts.append(name[0]);
            System.out.println(familyNameFirts);
            familyNameFirts.delete(0, familyNameFirts.length());
        }
        
    
        
        
    }   
}
