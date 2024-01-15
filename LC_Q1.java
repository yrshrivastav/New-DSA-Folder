import java.util.Arrays;

public class LC_Q1{



    public static void merge(int[] num1, int m, int[] num2, int n) {
        
        
        int size = m + n;
        int i = 0;
        int num3[] = new int[size];
        for(int no1 : num1){
            if(no1==0){
                continue;
            }
            else{
                num3[i] = no1;
                i++;
            }
        }
        for(int no2 : num2){
            num3[i] = no2;
            i++;
        }

        num1=num3;
        Arrays.sort(num1);
        for(int no3 : num1){
            if(no3==0){
                continue;
            }
            else{
                System.out.println("Numbes in num1 array are : "+no3);
            }
           
        }
    }

    public static void main(String[] args) {
        
        int num1[] = {1,2,7,4,0,0,0};
        int num2[] = {3,4};
    
        int m = num1.length;
        int n = num2.length;

        merge(num1, m, num2, n);
        

    }

}