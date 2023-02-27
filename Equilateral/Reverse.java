
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				//Counting spaces as 0 1 2 3 4 .........
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++) {
				//making stars count as 5 4 3 2 1........
				System.out.print("* ");
			}

			System.out.print("\n");
		}
	}

}
