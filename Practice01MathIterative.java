/**
 * Practice 01 Recursive
 * CS 245 - Part of the first practice assignment
 * @author masonlancel
 *
 */

public class Practice01MathIterative implements Practice01Math
{
	
	
	public int fact(int n) throws Exception
	{
		if(n < 0)
			throw new Exception("Negative");
		int total = 1;
		
		for(int i = 1;i<=n;i++)
		{
			total = total * i;
		}
		
		return total;
	}

	public int fib (int n) throws Exception
	{
		int total = 0;
		int first = 1;
		int last = 1;

		if(n < 0)
			throw new Exception("Negative");
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		for(int i = 1;i<=n;i++)
		{
			first = last;
			last = total;
			total = first + last;
		}
		return total;

	}
}