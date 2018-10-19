package Lab6;

public class Goal {
	public int minute;
	public Player player;
	
	public Goal(int minute, Player player) {
		this.minute = minute;
		this.player = player;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setplayer(Player player) {
		this.player = player;
	}
	
}
