#include<stdio.h>
void merge(int arr[],int low,int mid,int high){
    int n1=mid-low+1;
    int n2=high-mid;

    int a[n1];
    int b[n2];

    for(int i=0;i<n1;i++)
        a[i]=arr[low+i];

    for(int i=0;i<n2;i++)
        b[i]=arr[mid+1+i];

    int i=0;
    int j=0;
    int k=low;
    while(i<n1 && j<n2)
    {
        if(a[i]<b[j])
        {
            arr[k]=a[i];
            k++;
            i++;
        }
        else{
            arr[k]=b[j];
            k++;
            j++;
        }
    }

    while(i<n1)
    {
        arr[k]=a[i];
        k++;
        i++;
    }

    while(j<n2)
    {
        arr[k]=b[j];
        k++;
        j++;
    }
}

void mergeSort(int a[],int l,int h){
  if(l<h){
    int mid=(l+h)/2;
    mergeSort(a,l,mid);
    mergeSort(a,mid+1,h);
    merge(a,l,mid,h);
  }
}


int main(){
    int n,i;
    printf("Enter the no. of elements :- \n ");
    scanf("%d",&n);
    int a[n];
    printf("Enter the elements to be sorted :- \n");
    for(i=0;i<n;i++){
            printf("Enter %d element  ",(i+1));
        scanf("%d",&a[i]);
    }
    mergeSort(a,0,n-1);
    printf("The sorted array is :- \n");
    for (i=0 ; i< n ; i++){
        printf("%d\n",a[i]);
    }
   return 0;
}



