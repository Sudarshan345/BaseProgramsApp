package com.reg.java;

public class LoopsDemoTest {

	public static void main(String[] args) {
		int n=20;
		
		System.out.println("numbers from 0 to last:");
		LoopsDemo.printNos(n);
		
		System.out.println("\nnumbers from last to 1st:");
		LoopsDemo.print_n_0(n);
		
		int e=20;
		System.out.println("\nEven numbers are:");
		LoopsDemo.printEven(e);
		
		
		System.out.println("\nOdd numbers are:");
		LoopsDemo.printOdd(e);
		
		
		System.out.println("\nPrime numbers are");
		e=50;
		LoopsDemo.printPrimeNOS();
		
		System.out.println("\nAlternate  numbers are:");
		LoopsDemo.printAlter(n);
		
		System.out.println("\nDivisible by 7(from 1-40), are:");
		LoopsDemo.printDiv7(40);
		

	}

}
