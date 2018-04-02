package palprime;
/**
 * Program: Palindromic Prime Number List
 * File: Palprime.java
 * Summary: The program will loop over the first 100,000 integers and display integers that are both palindromic and prime numbers.
 * Author: Erica Morgan
 * Date: 3/30/2018
 */

public class Palprime {
//main method
	public static void main(String[] args) {
		//print the initial sentence
		System.out.println("The palindromic primes from 1 - 100000 are: \n");
		//for the first 100000 positive integers, determine if the number is both prime and a palindrome
		for (int number = 1; number <= 100000; number++) {
			if (isPrime(number) && isPal(number)) {
				//print the numbers that meet the requirements
				System.out.println(number);
			}
		}
	}
	//determine if the number is prime
	public static boolean isPrime(int number) {
		if(number == 2)
			return true;
		for (int i = 2; i <= number/2; i++) 
			if(number % i == 0) {
				return false;
		}
		return true;
	}
	//calculate the reverse of the number
	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			int lastNumber = number % 10;
			reverse = reverse * 10 + lastNumber;
			number = number / 10;
		}
			return reverse;
	}
	//using the now calculated reverse of the number, determine if that is the same as the number, indicating a palindrome
	public static boolean isPal(int number) {
		return number == reverse(number);
	}	
}
