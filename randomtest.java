import java.util.Random;
public class randomtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j=0; j<3; j++) {
		int die1, die2, countDoubles = 0;
		Random rand = new Random();
		for (int i=0; i<100; i++) {
			die1 = rand.nextInt(6)+1;
			die2 =rand.nextInt(6)+1;
			if (die1 == die2) {
				countDoubles++;
			}
		}
		
		System.out.println("I rolled: " + countDoubles + " doubles");
		}
	}

}
