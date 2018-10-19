package Lab6;

import java.util.Date;

public class SoccerMatchTestMain {
	public static void main (String[] args) {
		SoccerMatch match = new SoccerMatch(new Date(System.currentTimeMillis()), "Marist", "Fordham");
			
		Player player = new Player();
		player.setName("Justice");
		player.setTeam("Marist");
		match.addHomePlayer(player);
			
		Player visitor = new Player();
		visitor.setName("Brian");
		visitor.setTeam("Fordham");
		match.addVisitorPlayer(visitor);
			
		Goal number = new Goal(89, player);
		match.addHomeGoal(number);
			
		System.out.println(match.startTime);
		System.out.println("The winner of the match is: " + match.getWinner());
		
	}
}
