#include <bits/stdc++.h>
using namespace std;


// swap given two values passed by reference to address
void swap(int *x, int *y){
	int temp = *x;
	*x = *y;
	*y = temp;
}


// function to implement selection sort technique
void selectionSort(int arr[], int n){
	int i,j, min_index;

	for(i=0;i< n-1;i++){
		min_index = i;
        // find minimum element in the unsorted array         
		for(j=i+1;j < n;j++){
			if(arr[j] < arr[min_index])
				min_index = j;
		}
        // swap minimum element with element corresponding to outer loop
		swap(&arr[min_index], &arr[i]);
	}
}


// function to print an array
void printArray(int arr[], int n){
	for(int i=0;i<n;i++){
		cout << arr[i] << " ";
	}
	cout << endl;
}

int main(){
	int size;
	cout << "Enter the length of array: ";
	cin >> size;
	int arr[size];
	cout << "Enter elements of the array: ";
	for(int i=0;i< size;i++){
		cin >> arr[i];
	}
	selectionSort(arr,size);
	cout << "Sorted array : \n";
	printArray(arr,size);
	return 0;

}
