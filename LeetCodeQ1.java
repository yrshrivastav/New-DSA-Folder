import java.util.Arrays;

class LeetCodeQ1{
    public static void main(String[] args) {
        int num1[] = {1,3,5,2};
        int num2[] = {9,4,7};

        int m = num1.length;
        int n = num2.length;
        int sizeOfNewArrayNum1 = m+n;
    
        num1 = Arrays.copyOf(num1, sizeOfNewArrayNum1);
        for(int no2 : num2){
            num1[m] = no2;
            m++;
        }
        Arrays.sort(num1);
        for(int no3 : num1){
            System.out.println("No in num1 are : "+no3);
        }

        }
}