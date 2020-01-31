/**
 * Practice 01 Recursive
 * CS 245 - Part of the first practice assignment
 * @author masonlancel
 *
 */

public class Practice01MathRecursive implements Practice01Math
{
	int x = 1;
	
	public int fact(int n) throws Exception
	{
		if(n < 0)
			throw new Exception("Negative");
		if(n >= 1)
			return n*fact(n-1);
		else
			return 1;
	}

	public int fib (int n) throws Exception
	{
		if(n < 0)
			throw new Exception("Negative");
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fib(n-1) + fib(n-2);
	}

}