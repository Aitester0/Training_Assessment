package soccer_two;

import soccer.Player;
import soccer.Team;
import soccer_one.Game;
import soccer_one.Goal;

public class League {
    public static void main(String[] args) {
        soccer_two.Player player1= new soccer_two.Player();
        player1.playerName="George Eliot";

        soccer_two.Player player2= new soccer_two.Player();
        player2.playerName="Graham Greene";

        soccer_two.Player player3= new soccer_two.Player();
        player3.playerName="Geoffrey Chaucer";

        soccer_two.Player[] thePlayers= {player1,player2,player3};

        soccer_two.Team team1=new soccer_two.Team();
        team1.teamName="The Greens";

        team1.playerArray=thePlayers;

        soccer_two.Team team2=new soccer_two.Team();
        team2.teamName="The Reds";

        team2.playerArray=new soccer_two.Player[3];
        team2.playerArray[0]=new soccer_two.Player();
        team2.playerArray[0].playerName="Robert Service";

        team2.playerArray[1]=new soccer_two.Player();
        team2.playerArray[1].playerName="Robbie Burns";

        team2.playerArray[2]=new soccer_two.Player();
        team2.playerArray[2].playerName="Rafeal Sabatini";

        soccer_two.Game currGame=new soccer_two.Game();
        currGame.homeTeam=team1;
        currGame.awayTeam=team2;

        soccer_two.Goal goal1=new soccer_two.Goal();
        goal1.thePlayer=currGame.homeTeam.playerArray[2];
        goal1.theTeam=currGame.homeTeam;
        goal1.theTime=55;

        soccer_two.Goal[] theGoal={goal1};
        currGame.goals=theGoal;
        System.out.println("Goal scored after" + currGame.goals[0].theTime + "mins by" + currGame.goals[0].thePlayer.playerName + "of" + currGame.goals[0].theTeam.teamName);

        for (soccer_two.Player thePlayer:team2.playerArray)
        {
            if (thePlayer.playerName.matches(".*Sab.*"))
            {
            System.out.println("Found "+thePlayer.playerName);
            System.out.println("Last name is"+ thePlayer.playerName.split(" ")[1]);

        }
        }
        StringBuilder familyNameFirst=new StringBuilder();
        for (soccer_two.Player thePlayer:team1.playerArray)
        {
            String name[]=thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0,familyNameFirst.length());
        }
    }
}
