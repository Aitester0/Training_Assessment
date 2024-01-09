package utility;

import soccer_four.Game;
import soccer_four.Goal;
import soccer_four.Team;

public class GameUtils {
    public static void addGamegoals(Game currGame){


        for (int i=0; i<currGame.goals.length;i++) {
            Goal currGoal=currGame.goals[i];
            currGoal=new Goal();
            Team[] team={currGame.homeTeam,currGame.awayTeam};
            int j=(int)(Math.random()*2);
            if(j==0){
                currGoal.thePlayer = currGame.homeTeam.playersArray[(int)(Math.random()*3)];
                currGoal.theTeam = currGame.homeTeam;
            }if(j==1){
                currGoal.thePlayer = currGame.awayTeam.playersArray[(int)(Math.random()*3)];
                currGoal.theTeam = currGame.awayTeam;
            }
            currGoal.theTime = (int)(Math.random()*50);
            currGame.goals[i]=currGoal;
        }

    }
}
