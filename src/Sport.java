
public class Sport {
	String name;
	int time;
	int numberOfPlayers;
	int numberOfPeriods;
	boolean hasBall;
	boolean isViolent;
	
	public Sport(String name, int numberOfPlayers, boolean hasBall) {
		this.name = name;
		this.numberOfPlayers = numberOfPlayers;
		this.hasBall = hasBall;
	}
	
	public String toString() {
		return this.name;
	}
	
	public int timePerPeriod(){
		return time / numberOfPeriods;
	}
}
