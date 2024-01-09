package soccer_three;

import soccer_three.Player;

public class League {
    public static void main(String[] args) {
        Team[] theTeams=createTeams();
        Game[] theGame=createGames(theTeams);

        Game currGame=theGame[0];

        Goal goal1=new Goal();
        goal1.thePlayer=currGame.awayTeam.playersArray[2];
        goal1.theTime=55;
        goal1.theTeam=theGame[0].awayTeam;

        Goal[] thegoals={goal1};
        currGame.goals=thegoals;
        System.out.println("Goal scored after" + currGame.goals[0].theTime + "mins by" +currGame.goals[0].thePlayer.playerName + "of" + currGame.goals[0].theTeam.teamName);

    }
    public static Team[] createTeams()
    {
        soccer_three.Player player1= new soccer_three.Player();
        player1.playerName="George Eliot";

        soccer_three.Player player2= new soccer_three.Player();
        player2.playerName="Graham Greene";

        soccer_three.Player player3= new soccer_three.Player();
        player3.playerName="Geoffrey Chaucer";

        Player[] thePlayers= {player1,player2,player3};

        soccer_three.Team team1=new soccer_three.Team();
        team1.teamName="The Greens";

        team1.playersArray=thePlayers;

        player1.playerName="Robert Service";

        soccer_three.Team team2=new soccer_three.Team();
        team2.teamName="The Reds";

        team2.playersArray=new Player[3];
        team2.playersArray[0]=new Player();
        team2.playersArray[0].playerName="Robert Service";

        team2.playersArray[1]=new Player();
        team2.playersArray[1].playerName="Robbie Burns";

        team2.playersArray[2]=new Player();
        team2.playersArray[2].playerName="Rafeal Sabatini";

        Team[] theTeams={team1,team2};
        return theTeams;

    }
    public static Game[] createGames(Team[] theTeams)
    {
        Game theGame=new Game();
        theGame.homeTeam=theTeams[0];
        theGame.awayTeam=theTeams[1];
        Game[] theGames={theGame};
        return theGames;
    }

}
