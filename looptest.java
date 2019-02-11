
public class looptest {
	public static void main (String []args) {
		System.out.println();
	System.out.println("results of do/while loops: ");
	//do while loops
	int count = 0;
	do {
		System.out.println("Hello world");
		count++;
	} while (count < 3);
	
	System.out.println();
	//while loops
	System.out.println("results of while loops: ");
	count = 0;
	while(count < 4) {
		System.out.println("Hello world");
		count++;
	}
	System.out.println();
	//for loops
	System.out.println("results of for loops: ");
	for (int i=0; i<5; i++) {
		System.out.println("Hello world");
	}
	
	}
}
