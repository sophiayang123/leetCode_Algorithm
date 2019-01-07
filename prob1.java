import java.util.Arrays;
public class prob1 {
	int result[] = new int[2];
	public int[] twoSum(int[] nums, int target) {
		outerloop:
		for(int i =0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i]+ nums[j]== target) {
					result[0]= i;
					result[1] = j;
					
					break outerloop;
				}
			}
		}
		System.out.print(Arrays.toString(result));
		return result;
	}
	public static void main(String[] args) {
		prob1 pb = new prob1();
		int nums[] = {2,1,6,5};
		pb.twoSum( nums, 7);

	}

}
