import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */	
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		int sum=1;
		boolean boy=false;
		boolean girl=false;
		//generate the first childern - 2 options. 1=boy, 2=girl. print g/b and add 1 to the sum.
		int random = (int)((Math.random()*2)+1); 
		if(random==1)
		{
			boy=true;
			System.out.print("b ");
		}
		else
		{
			girl=true;
			System.out.print("g ");
		} 
		// keep generating until the answer is diffrent from the first child.
		while(boy!=girl)
		{
			random = (int)((Math.random()*2)+1);
			if(random == 2) 
			{
				System.out.print("g ");
				sum=sum+1;
				girl = true;
			} 
			else
			{
				System.out.print("b ");
				sum=sum+1;
				boy=true;
			}
		}
		System.out.print(" You made it... and you now have " + sum + " children.");
}
}
	


    
	

