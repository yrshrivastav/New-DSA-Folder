import java.util.Arrays;

class LeetCodeQ1{
    public static void main(String[] args) {
        int num1[] = {1,2,3,4};
        int num2[] = {5,6};

        int m = num1.length;
        int n = num2.length;
        int sizeOfNewArrayNum1 = m+n;
    
        num1 = Arrays.copyOf(num1, sizeOfNewArrayNum1);
        for(int no2 : num2){
            num1[m] = no2;
            m++;
        }
    
        for(int no3 : num1){
            System.out.println("No in num1 are : "+no3);
        }

        }
}