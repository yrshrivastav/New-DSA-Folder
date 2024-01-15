import java.util.Arrays;

class LeetCodeQ1{
    public static void main(String[] args) {
        int num1[] = {1,3,5,2,4};
        int num2[] = {9,4,7};

        int m = num1.length;
        int n = num2.length;
        int sizeOfNewArrayNum1 = m+n;
    
        num1 = Arrays.copyOf(num1, sizeOfNewArrayNum1);
        for(int no2 : num2){
            num1[m] = no2;
            m++;
        }

            
        for(int i=0; i<m; i++){
            for(int j=i+1; j<m; j++){
                if(num1[i]>num1[j]){
                    int temp=num1[i];
                    num1[i]=num1[j];
                    num1[j]=temp;
                }
            }
        }

        for(int no3 : num1){
            System.out.println("No in num1 are : "+no3);
        }


    }
}