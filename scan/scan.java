import java.util.Scanner;

public class scan {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("first side: ");
		int x = scan.nextInt();
		System.out.println("second side: ");
		int y = scan.nextInt();
		System.out.println("hypo: " + Math.sqrt((x*x) + (y*y)));
	}
}
