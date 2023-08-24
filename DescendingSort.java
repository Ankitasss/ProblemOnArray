package com.Array.SortingAlgorithm;

public class DescendingSort {
	void descendingBubbleSort(int arr[]) {
		int help;
		for(int i=arr.length-2;i>=0;i--) {
			for(int j=arr.length-2-i;j>=0;j--) {
				if(arr[j]<arr[j+1] ){
					help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
	}

	

}
