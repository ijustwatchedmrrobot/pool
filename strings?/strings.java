import java.util.Scanner;

public class strings {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name = "";
		while (name.isEmpty())
		{
			System.out.println("Enter your name");
			name = scan.nextLine();
		}
	}
}
