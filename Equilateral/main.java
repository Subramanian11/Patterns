import java.util.Scanner;
public class Equilateral {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-1-i;j++) {
				//Calculating spaces with 4 3 2 1 0.......
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				//Making stars count 1 2 3 4 5.......
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}

}
