public class LeetCodeQ4 {

    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        int count=0;
        int twice;

        for (int i=0; i<size; i++)
		{   
            twice=0;
                for(int j = i+1; j <size ; j++){
                    if(nums[i]<nums[j]){
                        nums[i]=nums[i+1];
                        nums[i+1]=nums[j];  
                        break;
                    }
                    if(nums[i]==nums[j]){
                        twice++;
                        if(twice==2)
                            i++;
                            break;
                    }
                }       
		}
        for(int i=0; i<size-1; i++){
            if(nums[i]<nums[i+1]){
                count++;
                continue;
            }
            if(nums[i]==nums[i+1]){
                count++;
                continue;
            }
            else{
                count++;
                break;
            }
        }

        for(int i=0; i<size-1; i++){
            System.out.print(nums[i]+"\t");
        }

        // for(int element : nums){
        //     System.out.print(element+"\t");
        // }

        return count;
    }
    public static void main(String[] args) {
        // int num[]={0,0,1,1,1,1,2,3,3};
        int num[]={1,1,1,2,2,3};
        int k=removeDuplicates(num);
        System.out.println("\nSize:- "+k);
    }
}
