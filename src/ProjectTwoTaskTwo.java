//Naoto&Nicholas
//10/10/21
//ProjectTwo
import java.util.Scanner;
public class ProjectTwoTaskTwo {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = input.next();
		
		double cost = 44.55;
		String owners = "Naoto";
		
		if(owners.equalsIgnoreCase(name))
		{
			System.out.println("You are eligible for a $2.00 discount");
			cost = cost - 2 ;
			System.out.println("the cost " +cost);
		}

	System.out.println("Hi");	

	}

}
