package com.ashutosh.currencycount.service;

public class MergeSort {

	static int maxSize = 100;

	public void performSorting(int[] currencyDenominations, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			performSorting(currencyDenominations, low, mid);
			performSorting(currencyDenominations, mid + 1, high);
			merge(currencyDenominations, low, mid, high);
		}
	}

	private void merge(int a[], int low, int mid, int high) {

		int b[] = new int[maxSize];
		int i, j, k;
		i = low;
		j = mid + 1;
		k = low;
		
		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				b[k] = a[i];
				k++;
				i++;
			} else {
				b[k] = a[j];
				k++;
				j++;
			}
		}
		
		while (i <= mid) {
			b[k] = a[i];
			k++;
			i++;
		}
		
		while (j <= high) {
			b[k] = a[j];
			k++;
			j++;
		}
		
		for (int m = low; m <= high; m++)
			a[m] = b[m];
	}

}
