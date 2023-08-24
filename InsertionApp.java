package com.Array.SortingAlgorithm;

import java.util.Scanner;

public class InsertionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array length");
		int [] arr=new int[sc.nextInt()];
		System.out.println("enter array element");
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array element before sorting");
		for(int a:arr) {
			System.out.println(a+" ");
		}
		 
		 
		for(int i=1;i<=arr.length-1;i++) {
			int j=i-1;
			int item=0;
			while(j>=0&&arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
				
				
			}
			arr[j+1]=item;
		
			
			
			
		}

	}

}
