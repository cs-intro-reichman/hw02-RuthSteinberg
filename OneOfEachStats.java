import java.util.Random;
public class OneOfEachStats {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		Random generator = new Random(seed);
		//int number = Integer.parseInt(seed); //amount of families
		int family2=0;
		int family3=0;
		int family4=0;
		double sum=0;
		// create family: tempSum - thst sum of children in any family. sum - the sum of all the chilsren.
		for (int i=1; i<=T; i++) 
		{
		int tempSum=1;
		boolean boy=false;
		boolean girl=false;
		double rnd = generator.nextDouble(); 
		//generate the first childern - 2 options. 1=boy, 2=girl. print g/b and add 1 to the sum.
		if(rnd>=0.5 && rnd <1) 
			{ 
				boy=true;
				sum=sum+1;
			}
		else {
				girl=true;
				sum=sum+1;
			}
		// keep generating until the answer is diffrent from the first child.
		while(boy!=girl)
		{
			rnd = generator.nextDouble();
			if(rnd>=0 && rnd <0.5) 
			{
				sum=sum+1;
				tempSum=tempSum+1;
				boy = true;
			} 
			else
			{
				sum=sum+1;
				tempSum=tempSum+1;
				girl=true;
			}
		}
		// After creating family, check in witch catagory the family is
		if(tempSum==2)
			{
				family2=family2+1;
			}
		else
			{
			if(tempSum==3)
			{
				family3=family3+1;
			}
			else
			{
				family4=family4+1;
			}
		}	
		}
		int commen = 0;
		//check witch catagory is most commen
		if(Math.max(family2, family3)==family2)
		{
			commen =2;
		}
			else
			{
			if(Math.max(family3,family4)==family3)
			{
				commen=3;
			}
			else commen=4;
		}
		double av = sum/T;
		System.out.println("Average: " + av + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + family2);
		System.out.println("Number of families with 3 children: " + family3);
		System.out.println("Number of families with 4 or more children: " + family4);
		System.out.println("The most common number of children is "+commen+".");
	}
}
