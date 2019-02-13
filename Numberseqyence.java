package studentsGrade;

public class Numberseqyence {
	public static void main (String[]agrs) {
		int i;
		for (i =1; i <= 50; i++ ) {
			if (i > 20 ) {	
				break;
			}
			if (i%2==0) {
				continue;
			}
			
			else 
				System.out.println(i);
		}
	}
}
