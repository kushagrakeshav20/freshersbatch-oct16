
public class Generic_Swap {
	public static <T> void swap(T[] array, int right, int left) {
		T temp = array[right];
		array[right] = array[left];
		array[left] = temp;	
	}
	public static void main(String args[]) {
		Integer[] nums = {1,2,3,4,5,6,7};
		swap(nums,2,3);
		for(Integer p : nums) {
			System.out.print("After swap value is "+p+" ");
		}
	}
}
