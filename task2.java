
    public class task2 {
        public static void main(String[] args) {

            int arr[] = {2,3,4,5,6,2,4};
            int even  = 0 ;
            int odd = 0;
            for (int i=0; i < arr.length; i++){
                if (arr[i] % 2 == 0)
                {
                    even += 1;
                }
                else 
                {
                    odd += 1;
                }
            }
            System.out.println("even:"+ even);
            System.out.println("odd:"+ odd);




    
    }
}