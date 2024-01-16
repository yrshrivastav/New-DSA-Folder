public class LeetCodeQ6 {
    
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        int length = size-1;
        // int condition = size-k;
        
        for (int i = 1; i<size-k; i++)
		{
            int j = length;
			int temp = nums[length];
                for(int index = length; index > 0 ; index--){
                    nums[j] = nums[j-1];
                    j--;
                }
            nums[0] = temp;
		}

        for(int element : nums){
            System.out.print(element+", ");
        }
    }

    public static void main(String[] args) {
		
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);
	}

}
