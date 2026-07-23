package sorting;

public class sort {
    public static void insertionsort(int arr[]){
        for(int i = 1; i< arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding the pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev] ;
                prev--;
            }
            arr[prev+1] =curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
           int minpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp= arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
}
 public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0 ;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j =0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
public static void main(String[] args) {
    int arr[] = { 1,2,4,2,5,4,2,4,9,7,8,7};
//    selectionSort(arr); 
//    printarr(arr);
countingsort(arr);
 printarr(arr);
}
}
