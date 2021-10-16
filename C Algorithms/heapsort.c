#include<stdio.h>

void heapSort(int [],int);
void heapify(int [],int,int);
void swap(int*,int*);
void main()
{
    int arr[10],n,i;
    printf("Enter the no of elements:");
    scanf("%d",&n);
    printf("\n Enter elements:");

    for(i=0;i<n;i++)
     scanf("%d",&arr[i]);
    heapSort(arr,n);
    for(i=0;i<n;i++)
      printf("%d ",arr[i]);
}

void heapSort(int arr[],int n)
{
    int i;
    for(i=(n-1)/2;i>=0;i--)
     heapify(arr,n,i);
    
    for(i=0;i<n-1;i++)
    {
        swap(&arr[n-1-i],&arr[0]);
        heapify(arr,n-1-i,0);
    }
}

void heapify(int arr[],int n,int i)
{
    int parent=i,rchild=2*i+2,lchild=2*i+1;
    
    if(lchild<n && arr[lchild]>arr[parent])
     parent=lchild;
    
    if(rchild<n && arr[rchild]>arr[parent])
     parent=rchild;
     
    if(parent!=i)
    {
        swap(&arr[i],&arr[parent]);
        heapify(arr,n,parent);
    }
}
void swap(int *a,int *b)
{
    int temp=*b;
    *b=*a;
    *a=temp;
}