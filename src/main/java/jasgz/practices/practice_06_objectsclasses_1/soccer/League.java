package jasgz.practices.practice_06_objectsclasses_1.soccer;

public class League {
    
    public static void main(String []args){
    Player player1= new Player();
    player1.playerName="George Eliot";//PLAYER OF THE TEAM ONE "THE GREENS"
    
    Player player2= new Player();
    player2.playerName="Graham Greene";//PLAYER OF THE TEAM ONE "THE GREENS"
    
    Player player3= new Player();
    player3.playerName="Geoffrey Chaucer";//PLAYER OF THE TEAM ONE "THE GREENS"
    
    Player[]thePlayers={player1, player2, player3};
    
    Team team1= new Team();//TEAM ONE
    team1.teamName="The Greens";
    team1.playerArray= thePlayers;
    
    Team team2=new Team();//TEAM TWO
    team2.teamName="The Reds";
    team2.playerArray= new Player[3];
    team2.playerArray[0]=new Player();
    team2.playerArray[0].playerName="Robert  Service";//PLAYER OF THE TEAM "THE REDS"
    team2.playerArray[1]= new Player();
    team2.playerArray[1].playerName="Robbie Burns";//PLAYER OF THE TEAM "THE REDS"
    team2.playerArray[2]= new Player();
    team2.playerArray[2].playerName="Rafael Sabatini";//PLAYER OF THE TEAM "THE REDS"

    player1.playerName="Robert Service";//REMOVING PLAYER WITH THE NAME "GEORGE ELIOT"
    for(Player thePlayer: team1.playerArray){
        System.out.println(thePlayer.playerName);
    }
        for(Player thePlayer: team2.playerArray){
        System.out.println(thePlayer.playerName);
        
    }
    }
}
