

    public static void changeArr(int arr[],int i , int value){
        if(i == arr.length){//this is base case 
            printarray(arr);
            return;
        }
        //kaam
        arr[i] = value;
        changeArr(arr, i+1, value+1);
        arr[i] = arr[i] -2;
    }
    
    public static void printarray(int arr[]){
        for(int i =0; i<arr.length;i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String argvs[]){
        int arr[] = new int[6];
        changeArr(arr, 0, 1);
        printarray(arr);
    }

