package com.Array.SortingAlgorithm;

import java.util.Scanner;

public class DescendingBubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter array length");
		int [] arr=new int[sc.nextInt()];
		System.out.println("enter array element ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();

		}
		System.out.println("array elememt before sorting......");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		DescendingSort descendingSort=new DescendingSort();
		descendingSort.descendingBubbleSort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
		

}
}
