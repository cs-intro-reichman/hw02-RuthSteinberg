/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		int index=2;
		int sum=1; // start from 1 because 1 is a divisor of any number
		String str=number + " is a perfect number since " + number + " = 1"  ;
		// Find all divisors of the number and add to the string
		while(index<number)
		{
			if(number%index==0)
			{
				sum=sum+index;
				str = str + " + " + index;
			}
			index++;
		}
		//Check whether the sum of all divisors equals the number and print the result
		if (sum==number)
		{
			System.out.println(str);
		}
		else
		System.out.println(number + " is not a perfect number");
	}
}
