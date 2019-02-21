package com.reg.java;

public class ArrayDemoTest {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

		System.out.print("Elements present in the array are:");
		ArrayDemo.printArrEle(arr);

		System.out.print("\neven numbers present in the given array:");
		ArrayDemo.arrayEvenEle(arr);

		System.out.print("\nOdd numbers present in the given array:");
		ArrayDemo.arrayOddEle(arr);

		System.out.print("\nelements at EVEN index in the given array:");
		ArrayDemo.arrayAtEvenIndex(arr);

		System.out.print("\nelements at ODD index in the given array:");
		ArrayDemo.arrayAtOddIndex(arr);

		System.out.print("\nmiddle to right:");
		ArrayDemo.arrayMtoR(arr);

		System.out.print("\nmiddle to left");
		ArrayDemo.arrayMtoL(arr);

		System.out.print("\nalternate numbers are:");
		ArrayDemo.arrayAlterEle(arr);

		System.out.print("\nThe index of array at element 7 is");
		ArrayDemo.arrayGetEle(arr);

		System.out.print("\n sum of all array elements:");
		ArrayDemo.arrayTotAvg(arr);
	}

}
