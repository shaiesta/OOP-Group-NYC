import java.util.Random;

/* FINAL PROJECT: RUTGERS ROUNDABOUT 
 * 
 * @author Beatrice Trinidad, Johnny Manzano, Renz Sarayba, Chantelle Glowacki, Jonathan Paragas
 *
 */

public class Player {

	private String playerName; // Name of player
	private int totalPoints; // Total points the player has

	public Player(){
		playerName = null;
		totalPoints = 0;
	}

    public Player(String playerName, int totalPoints) {
        this.playerName = playerName;
        this.totalPoints = totalPoints;
    }
   
    public String getPlayerName(){
		return playerName;
	}
    
    public int getTotalPoints(){
		return totalPoints;
	}
    
    public void setPlayerName(String pName){
		playerName = pName;
	}
    
    public void losePoints(int tPoints){
		totalPoints = (int) (tPoints - ( (Math.random() * 10) + 1) );
	} 
    
    public void winPoints(int tPoints){
		totalPoints = (int) (tPoints + ( (Math.random() * 10) + 1) );
	} 
    

}   

/* Have all the relevant information you collect from the player such
as location, name, etc. */