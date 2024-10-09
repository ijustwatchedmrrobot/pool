public class sort{
	
	static void bubbleSort(int nums[]){
		int temp;

		for(int i = 0; i < nums.length - 1; i++){
			for(int j = 0; j < nums.length - i - 1; j++){
				if (nums[j] > nums[j + 1]){
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;			
				}

			}
		}
	}

	static void printList(int nums[]){
		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}
		
static void convertInt(int nums[], String args[]){
		for(int i = 0; i < nums.length; i++){
			try{
				nums[i] = Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e){
				System.out.println("Invalid Number: " + args[i]);
				return ;
			}
		}
	}
}
