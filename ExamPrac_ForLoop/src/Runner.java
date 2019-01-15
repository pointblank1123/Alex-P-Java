
public class Runner {
	public static void main(String[] args) {
		
		int count = 0;
		for (int j = 4; j<9; j++) {
			if (j%2 == 1) 
				count++; // if only one line after if statement {} are not required
		}
		System.out.println(count);
		//
		int sum = 0;
		for(int m=5; m<10; m++) {
			if (m%2!=1) {
				sum+=m;
			}
		}
		System.out.println(sum);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
