/** Class that demonstrates Java's command line arguments
*/

public class hometask1{
	public static void main(int[] args){
		System.out.println("The array passed is following:");

		for (int i=0; i < args.length; i++){
			System.out.println("arg[" + i + "]: " + args[i]);
		}
	}
}