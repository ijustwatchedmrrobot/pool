import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

	public static void main(String args[]) {
		ArrayList<String> newList = setListArgs(args);
		System.out.println("args list:");
		printList(newList);
		
		setListScan(newList);
		System.out.println("scanned list:");
		printList(newList);
	}	

	static ArrayList<String> setListArgs(String args[]){
		ArrayList<String> newList = new ArrayList<>();

		for(String item : args)
			newList.add(item);
		
		return newList;
	}

	static void setListScan(ArrayList<String> list){
		list.clear();
		Scanner scan = new Scanner(System.in);
		String item = "";
		while (!item.equalsIgnoreCase("exit"))
		{

			item = scan.nextLine();
			if (!item.equalsIgnoreCase("exit"))
				list.add(item);
		}
	}

	static void printList(ArrayList<String> list){
		for(String item : list)
			System.out.println(item);
	}
}
