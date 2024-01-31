public class args{
	public static void main(String[] args){
		int nums[] = new int[args.length];

		sort.convertInt(nums, args);
		sort.printList(nums);
		sort.bubbleSort(nums);
		sort.printList(nums);
	}
}