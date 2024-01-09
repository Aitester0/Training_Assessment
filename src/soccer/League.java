package soccer;

public class League {
    public static void main(String[] args) {
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

        for (Player thePLayer:team1.playersArray)
        {
            System.out.println(thePLayer.playerName);
        }
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

        for (Player thePLayer:team2.playersArray)
        {
            System.out.println(thePLayer.playerName);
        }

    }

}
