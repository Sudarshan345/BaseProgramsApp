package com.reg.java;

public class LoopsDemo {

	public static void printNos(int n) {
		int i = 1;
		do {
			System.out.print(" " + i + " ");
			i++;
		} while (i <= n);

	}

	public static void print_n_0(int n) {
		do {
			System.out.print(" " + n + " ");
			n--;
		} while (n > 0);
	}

	public static void printEven(int e) {
		for (int i = 0; i <= e; i++) {
			if (i % 2 == 0)
				System.out.print(" " + i + " ");
		}
	}

	public static void printOdd(int e) {
		for (int i = 0; i <= e; i++) {
			if (i % 2 != 0)
				System.out.print(" " + i + " ");
		}
	}

	public static void printPrime(int e) {
		for (int i = 3; i <= e; i++) {
			int pmno = 0;
			// if (i==0||i==1||i==2) {System.out.println(); return;}
			for (int pm = 2; pm <=i / 2; pm++) {
				if (i % pm == 0) {
					pmno = 1;
				}
			}
			if (pmno == 0) {
				System.out.println(i);

			}

		}
	}

	public static void printAlter(int n) {

		for (int i = 1; i <= n;) {
			System.out.print(" " + i + " ");
			i += 2;// i=i+2
		}
	}

	public static void printDiv7(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 7 == 0) {
				System.out.print(" " + i + " ");
			}
		}
	}
	
	public static void printPrimeNOS() {
		int n=50;
		
		
		for(int i=3;i<=n;i++) {
			
					int pno=5;
					for(int k=2;k<=i/2;k++) {
						if(i%k==0)
							pno=1;
				
											}
			if(pno==5)
				System.out.println(i);
		}
	}
}
