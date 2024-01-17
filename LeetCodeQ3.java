public class LeetCodeQ3 {
    public static int duplicateElement(int[] nums){
        int size = nums.length;
        int count=0;

        for (int i=0; i<size; i++)
		{
                for(int j = 1; j <size ; j++){
                    if(nums[i]<nums[j]){
                        nums[i]=nums[i];
                        nums[i+1]=nums[j];  
                        break;
                    }
                    if(nums[i]==nums[j]){
                        continue;
                    }
                    
                }       
		}
        for(int i=0; i<size; i++){
            if(nums[i]<nums[i+1]){
                count++;
            }
            else{
                count++;
                break;
            }
        }

        int expectedNums[]=new int[count];

        for(int i=0; i<count; i++){
            expectedNums[i]=nums[i];
        }
        
        for(int element : expectedNums){
            System.out.print(element+"\t");
        }

        return count;
    }

    public static void main(String[] args) {
        // int num[]={1,1,2};
        int num[]={0,0,1,1,1,2,2,3,3,4};
        int k=duplicateElement(num);
        System.out.println("\nSize:- "+k);
    }
}
