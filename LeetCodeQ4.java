public class LeetCodeQ4 {

    public static int removeDuplicates(int[] nums) {
        
        int [] result = new int[nums.length];
        int count=0,j=0;
        int twice=0;
        int a=nums[0];
        for(int i=0;i<nums.length;i++){

            if(a==nums[i]){
                if(twice<2){
                    result[j]=a;
                    count++;
                    j++;
                    twice++;
                }
            }
            else{
                twice=0;
                a=nums[i];
                i--;
            }
            
        }

        for (int i=0;i<count;i++) {
                System.out.print(result[i]+" ");
        }
        return count;
    }
    public static void main(String[] args) {
        int result[]={0,0,1,1,1,1,2,3,3};
        // int result[]={1,1,1,2,2,3};
        int k=removeDuplicates(result);
        System.out.println("\nSize:- "+k);
    }
}
