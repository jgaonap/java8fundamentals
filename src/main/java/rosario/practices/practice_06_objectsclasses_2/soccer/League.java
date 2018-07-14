/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rosario.practices.practice_06_objectsclasses_2.soccer;

/**
 *
 * @author rosario
 */
public class League {
    public static void main(String[] args) {
        //Equipo 1    
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
 
        // Equipo 2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        Game juego = new Game();
        juego.homeTeam = team1;
        juego.awayTeam = team2;
        
        Goal goal = new Goal();
        goal.thePlayer = juego.homeTeam.playerArray[2];
        goal.theTeam = juego.homeTeam;
        goal.theTime = 55;
        
        Goal[] theGoals = {goal};
        juego.goals = theGoals;
        /* Practice 6-2. Print out the score of the Game */
        System.out.println("Goal score after " +
                juego.goals[0].theTime + " mins by " + 
                juego.goals[0].thePlayer.playerName + " of " +
                juego.goals[0].theTeam.teamName);
        

    }   
}
