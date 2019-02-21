package com.reg.java;

public class ArrayDemo {

	public static void printArrEle(int arr[]) {

		for (int i = 0; i < arr.length; i++)
				System.out.print(" "+arr[i]+" ");
	
	}

	public static void arrayEvenEle(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				System.out.print(" "+arr[i]+" ");
		}
	}

	public static void arrayOddEle(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0)
			System.out.print(" "+arr[i]+" ");
		
	}
	
	}

	public static void arrayAtEvenIndex(int arr[]) {
		for(int i=0;i<arr.length;i+=2)
		{
			System.out.print(" "+arr[i]+" ");
			
		}
	}
	
	public static void arrayAtOddIndex(int arr[]) {
		for(int i=1;i<arr.length;i+=2)
		{
			System.out.print(" "+arr[i]+" ");
			
		}
	}

	public static void arrayMtoR(int arr[]) {
		for(int i=arr.length/2;i<arr.length;i++) {
			System.out.print(" "+arr[i]+" ");
		}
	}
	
	public static void arrayMtoL(int arr[]) {
		for(int i=arr.length/2-1;i>=0;i--) {
			System.out.print(" "+arr[i]+" ");
		}
	}
	
	public static void arrayAlterEle(int[] arr) {
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(" "+arr[i]+" ");
			
		}
		}
	
	public static void arrayGetEle(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if (i==7)System.out.println(arr[i]);
		}
	}
	
	public static void arrayTotAvg(int[] arr) {
		int tot=0;
		float avg;
		for(int i=0;i<arr.length;i++) 
			tot=tot+arr[i];
			avg=tot/arr.length;
		System.out.println("SUM="+tot+ "Average="+avg);
		
	}
}
