// public class arr{
//     //largest in the array
//     // public static int largest(int num[]){
//     //     int max = 0;
//     //     for(int i =0;i<num.length;i++){
            
//     //         if(num[i]>max){
//     //             max =num[i];
//     //         }
//     //     }return max;  
//     // }
    
//max subarray part-2
//     public static void sumarr(int arr[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[arr.length];
//         prefix[0] = arr[0];

//         //prefix array

//         for(int i =1;i<prefix.length;i++){
//             prefix[i] = prefix[i-1]+arr[i];
//         }


//         for(int i =0; i<arr.length;i++){
//             int start = i;
//             for(int j =i;j<arr.length;j++){
//                 int end = j;
                
//                 currSum =   start == 0?prefix[end] :prefix[end] -prefix[start-1];
                
//                 if (maxSum<currSum){
//                     maxSum=currSum;
//                 }

                
//             }
//         }
//         System.out.println(maxSum+" this is the max");
//     }

//     public static void main(String args[]){

//         int arr[] = { 1,-2,6,-1,3};
//         sumarr(arr);
//     }
// }

//     // reverse an array

//     public static void reverse(int arr[]){
//         int first = 0;
//         int last = arr.length -1;

//         while(first<last){
//             int temp = arr[first];
//             arr[first] = arr[last];
//             arr[last]=temp;

//             first++;
//             last--;
//         }
//     }
//     public static void main(String args[]){
//         // int largest[] = {1,2,44,5,7};
//         // System.out.print(largest(largest));

//         // int arr[] = {1,2,3,4,5};
//         // subarr(arr);

//         int arr[] = {1,2,3,4,5};

//         reverse(arr);
//         for(int i = 0; i<=arr.length-1;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// public class arr{

//     public static void pair(int arr[]){
//         for(int i =0;i<arr.length;i++){
//             int curr=arr[i];
//             for(int j=i+1;j<arr.length;j++){
//                 System.out.print("("+curr+","+arr[j]+")");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]   ){
//         int arr[] = {1,2,3,4,5,6,7};
//         pair(arr);
//     }
// }


//max subarray kadane's method

// public class arr{

//     public static void kadanes(int arr[]){
//         int cs = 0;
//         int ms=Integer.MIN_VALUE;

//         for(int i = 0;i<arr.length;i++){
//             cs=cs+arr[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
//         System.out.print("the highest sum is "+ms);
//     }

//     public static void main(String args[]){
//         int arr[] = { -2,-3,4,-1,-2,1,5,-3};
//         kadanes(arr);
//     }
// }

// trapped water level problem

// public class arr{
//     public static int trappedwater(int height[]){
//         int n = height.length;

//         //calculate left max boundary
//         int leftmax[] =new int[n];
//         leftmax[0]=height[0];
//         for(int i=1;i<n; i++){
//             leftmax[i] =Math.max(height[i], leftmax[i-1]);
//         }
//         //calculate right max boundary

//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightMax[i]=Math.max(height[i], rightMax[i+1]);
//         }

//          int trapwater=0;
//         //loop
//         for(int i = 0;i<n;i++){
//             //water level
//             int waterlvl = Math.min(leftmax[i],rightMax[i]);

//             //trappedwater
//             trapwater += waterlvl-height[i];
//         }
//         return trapwater;
        
//     }

//     public static void main(String[] args) {
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedwater(height));
//     }
// }

//stocks

public class arr{
    public static int stocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0 ; i<prices.length;i++){
            if (buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = { 1,2,4,5,10};
        System.out.print(stocks(prices));
    }
}