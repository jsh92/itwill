package com.day10;

public class FiboTest {
	/*
	 fib(n) = 	0                	n=0
      			1			 		n=1 			
	      fib(n-2) + fib(n-1)       n=2 ÀÌ»ף

	 */
	public static int fibonacci(int n){
		int result = 0;
		
		if (n==0)
			result = 0;
		else if (n==1)
			result = 1;
		else
			result = fibonacci(n-2)+fibonacci(n-1);  
			/*
			f(0)+f(1)
			  0 + 1 =>1 
			  
			f(1)+f(2)
			  1 + f(0)+f(1)
			  1 +  0  + 1  => 2 
			*/
		
		return result;
	}
	
	public static void main(String[] args) {
		
		for (int i=0;i<11 ; i++){
			int num = fibonacci(i);
			/*
			 0, 1, 1, 2, 
			 */
			
			System.out.print(num);
			if (i!=10)  System.out.print(", ");
		}//for
		
	}

}

