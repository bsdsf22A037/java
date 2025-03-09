import java.util.Scanner;

public class h1t1{

    // declaring array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int len_arr = in.nextInt();
        System.out.print("Enter " + len_arr+"elememts of array:");


        int[] arr = new int[len_arr];
        for (int i= 0; i < len_arr ; i++ ){
            arr[i] = in.nextInt();
        }
        //printing array
        System.out.print("Array element are :");

        for (int i = 0 ; i < len_arr ; i++){
            System.out.print(arr[i] + " ");
        }
        //finding min , max 
        int mini = arr[0];
        int maxi = arr[0];
        for (int i = 1 ; i < len_arr ; i++){
            if (arr[i] < mini){
                mini = arr[i];
            } 
            if (arr[i] > maxi){
                maxi= arr[i];
            }
        }

        System.out.print("Maximum element of array is  :"+ maxi );
        System.out.print("Minimum element of array is "+ mini);






    }

}

