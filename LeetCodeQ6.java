public class LeetCodeQ6 {
    
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        
        for (int i = 0; i<k; i++)
		{
            int length = size-1;
			int temp = nums[size-1];
                for(int j = size-1; j > 0 ; j--){
                    nums[length] = nums[length-1];
                    length--;
                }
            nums[0] = temp;
		}

        for(int element : nums){
            System.out.print(element+", ");
        }
    }

    public static void main(String[] args) {
		//Example1
        int[] nums = {1,2,3,4,5,6,7};
        int k = 2;
        rotate(nums, k);
        
        //Example2
        // int[] nums1 = {-1,-100,3,99};
        // int k1 = 2;
        // rotate(nums1, k1);
	}

}
