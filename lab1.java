import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        //... Initialization
        String operator1 ;
        int val1 ;
        int val2 ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operator");
        operator1 = in.nextLine();      // Read one line from the console.

        //... Prompt and read input.
        System.out.println("enter first value");
        val1 = in.nextInt();      // Read one line from the console.

        System.out.println("enter your second number");
        val2 = in.nextInt();
        
        if (operator1.equals("+"))
		{
			System.out.println(val1 + val2);
		}
        else if (operator1.equals("-"))
		{
			System.out.println(val1 - val2);
		}
        else if (operator1.equals("*"))
		{
			System.out.println(val1 * val2);
		}
        else if (operator1.equals("/"))
		{
			System.out.println(val1 / val2);
		}


  

    //    in.close();

   
    }
    
}
