import java.util.ArrayList;

public class arrayList {

	public static void main(String args[]) {
		ArrayList<String> newList = setListArgs(args);
		printList(newList);
	}	

	static ArrayList<String> setListArgs(String args[]){
		ArrayList<String> newList = new ArrayList<>();

		for(String item : args)
			newList.add(item);
		
		return newList;
	}

	static void printList(ArrayList<String> list){
		for(String item : list)
			System.out.println(item);
	}
}
