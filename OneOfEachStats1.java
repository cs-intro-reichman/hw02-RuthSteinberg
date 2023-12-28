/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]); //amount of families
		int family2=0;
		int family3=0;
		int family4=0;
		int sum=1;
		for (int i=1; i<=number; i++)
		{
		int tempSum=1;
		boolean boy=false;
		boolean girl=false;
		//generate the first childern - 2 options. 1=boy, 2=girl. print g/b and add 1 to the sum.
		int random = (int)((Math.random()*2)+1); 
		if(random==1) {boy=true;}
		else
		{
			girl=true;
		} 
		// keep generating until the answer is diffrent from the first child.
		while(boy!=girl)
		{
			random = (int)((Math.random()*2)+1);
			if(random == 2) 
			{
				sum=sum+1;
				tempSum=tempSum+1;
				girl = true;
			} 
			else
			{
				sum=sum+1;
				tempSum=tempSum+1;
				boy=true;
			}
		}
		if(tempSum==2) {family2=family2+1;}
		if(tempSum==3) {family3=family3+1;}
		if(tempSum>=4) {family4=family4+1;}		
		}	
		double av = sum/number;
		System.out.println("Average: " + av);
		System.out.println("Number of families with 2 children: " + family2);
		System.out.println("Number of families with 3 children: " + family3);
		System.out.println("Number of families with 4 or more children: " + family4);
	}
}
