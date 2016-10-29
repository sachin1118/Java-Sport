
public class SportInstances {
	public static void main(String[] args) {
		Sport football = new Sport("football", 11, true);
		Sport baseball = new Sport("baseball", 9, true);
		Sport hockey = new Sport("hockey", 5, false);
		
		System.out.println(hockey.hasBall);
		football.time = 60;
		football.numberOfPeriods = 4;
		System.out.println(football.timePerPeriod());
		System.out.println(baseball.hasBall);
	}
}
