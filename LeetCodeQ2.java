public class LeetCodeQ2 {

    public static int removeElement(int[] num1, int val) {
        int length = 0;
        
        for(int element : num1){
            if(element == val){
                continue;
            }
            else{
                 num1[length] = element;
                 length++;
            }
        }

        int nums[] = new int[length];

        for(int i=0; i<length; i++){
            nums[i]=num1[i];
            System.out.println("Elements in nums are:- "+nums[i]);
        }

        return length;
    }

    public static void main(String[] args) {
        //Example 1
        // int[] nums = {0,1,2,2,3,0,4,2};
        // int val = 2;
        
        //Example 2
        int[] nums = {3,2,2,3};
        int val = 2;

        int k = removeElement(nums, val);
        System.out.println("Number of element after removing val from nums:- "+k);
    }
}
