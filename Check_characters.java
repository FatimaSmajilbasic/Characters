package chars;
import java.util.Scanner;
    public class Check_characters {

	public static Scanner input = new Scanner(System.in);
			
	public static void main(String[] args) {
				
		System.out.print("Input some string : ");
		 String user = input.nextLine();
				
		System.out.println("\nString length : " + user.length());
		System.out.print("Characters at even positions :  " );
		Characters.atEvenIndex(user);
		System.out.print("\nCharacters at odd positions : " );
		Characters.atOddIndex(user);
		System.out.println("\nNumber of uppercase characters  : " + Characters.numberOfUpperCase(user));
		System.out.println("Number of lowercase characters  : " + Characters.numberOfLowerCase(user));
		System.out.println("Number of other characters  : " + Characters.notChars(user));

		
		   		 



	}

}
