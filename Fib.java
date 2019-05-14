/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

import java.util.*;

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        
	if (n == 1)		// base case or recursive case
	return 1;		// instructions for base case

	else if (n == 0)	// 2nd base case
	return 0;		// instructions

	else							// instructions for recursive
	return fib_recurrence(n-1) + fib_recurrence(n-2);	// fib calls are recursive abstraction
								// + is combining
								// no leftover processing
    }

     /* These are class methods because
    	they should work regardless of the
	specific instance. More	like a helper 
	class with methods to be called than 
	a class representing something.
	*/ 


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        long prev = 0;
	long curr = 0;
	long next = 1;

	for (int count = 0; count < n; count++) {
		prev = curr;
		curr = next;
		next = curr + prev;
	}

	return curr;
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count iterations of the for loop
       
       Then cost of the the recurrence algorithm
       grows exponentially (same as Fibonacci numbers themselves)
       as the size of the problem increases,
       because each time n goes up by 1,
       you need to add the costs for n-1 and n-2.
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (1.0 + Math.sqrt(5))/2.0;	
	double psi = (1.0 - Math.sqrt(5))/2.0;
	return (Math.pow(phi,n) - Math.pow(psi,n))/Math.sqrt(5);
    }

    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count how many times multiplied
       
       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because when you increase n by 1,
       you need to perform multiplication
       2 more times (for the exponent).
     */

	// aruond n = 43 for recursive algorithm is feasible
}
