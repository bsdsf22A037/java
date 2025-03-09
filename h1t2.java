import java.util.ArrayList;
import java.util.Scanner;

public class h1t2 {
    public static  boolean is_armstrong(int number1){
        int val = number1;
        int rem = 0;
        int sum_val = 0;
        int i = String.valueOf(number1).length();

        while (true) { 
            
            if (val < 10){
                sum_val += (Math.pow(val,i));
                break;
            }
            if (val > 9 ){
                rem = val % 10;
                sum_val += Math.pow(rem,i);
                val = val /10;
            }           
        }
        return  (sum_val) == number1;

    }




    public static void main(String args[]){
        System.out.print("ENter the range you want to find armstrong number");
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0;i <= range;i++ ){
            if (is_armstrong(i) ){
                list.add(i);

            }
            
        }
        System.out.print("The armstrong numbers are :"+ list );
    }


    
}
