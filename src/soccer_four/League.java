package soccer_four;

import utility.GameUtils;

public class League {
    public static void main(String[] args) {
        Team[] theTeams=createTeams();
        Game[] theGame=createGames(theTeams);

        Game currGame=theGame[0];

        //Goal goal1=new Goal();
        //goal1.thePlayer=currGame.awayTeam.playersArray[2];
        //goal1.theTime=55;
        //goal1.theTeam=theGame[0].awayTeam;

        //Goal[] thegoals={goal1};
        //currGame.goals=thegoals;
        //System.out.println("Goal scored after" + currGame.goals[0].theTime + "mins by" +currGame.goals[0].thePlayer.playerName + "of" + currGame.goals[0].theTeam.teamName);

        int numberOfGoals=(int) (Math.random()*7);
        //System.out.println(numberOfGoals);
        Goal[] thegoals=new Goal[numberOfGoals];
        currGame.goals=thegoals;
        GameUtils.addGamegoals(currGame);
        //System.out.println(thegoals.length);
        for (Goal currGoal:currGame.goals){
         System.out.println("Goal scored after " + currGoal.theTime
                   + " mins by " +currGoal.thePlayer.playerName
                    + " of " + currGoal.theTeam.teamName);

        }





    }
    public static Team[] createTeams()
    {
        Player player1= new Player();
        player1.playerName="George Eliot";

        Player player2= new Player();
        player2.playerName="Graham Greene";

        Player player3= new Player();
        player3.playerName="Geoffrey Chaucer";

        Player[] thePlayers= {player1,player2,player3};

        Team team1=new Team();
        team1.teamName="The Greens";

        team1.playersArray=thePlayers;

        player1.playerName="Robert Service";

        Team team2=new Team();
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
