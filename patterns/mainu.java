
       
// //        System.out.print("Enter number a :");
// //        int a = sc.nextInt();
// //        System.out.print("Enter number b :");
// //        int b = sc.nextInt();
// //        int c = a+b;
// //        System.out.print("sum of a and b :"+ c);
// //     }
// // }

// //sum of n numbers , input taken from users
// // import java.util.*;

// // public class sum{
// //   public static void main(String args[]){
// //        int i = 1;
// //        int sum = 0 ;
// //        System.out.print("enter your range: ");
// //        Scanner sc = new Scanner(System.in);
// //        int range = sc.nextInt();

// //        //loop starts here
// //        while(i<=range){
// //          sum +=i;
// //          i++;
// //        }
// //        System.out.println("the sum of range" + range +"is "+sum );
// //   }

// // }

// //reverse the num and store it 

// // public class sum{
// //     public static void main (String args []){
// //           int num = 10899;
// //           int rev = 0 ;
// //            while(num >0){
// //             //this gives the last number to ld and deletes the last digit from the number
// //             int ld = num%10;
// //             //this updates the reversed number
// //             rev= (rev*10)+ld;
// //             //this updates the num n
// //             num =num/10;
            
// //           }
// //     System.out.println(rev);
// //     }
// // }


// //printing star  pattern 1

// // public class main{

// //     public static void main (String args[]){

// //       for (int line = 1;line<=4;line++){
// //         for (int star = 1;star<=line;star++){
// //             System.out.print("*");
// //         }
// //         System.out.println();
        
// //       }
// //     }
// // }


// //code to print a inverted star pattern 

// // public class main{
// //     public static void main( String args[]){
// //         for (int line = 1 ; line <= 4;line++){
// //             for (int star = 1;star <= 4-line+1;star ++){
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// //code to print a half triangle of numbers

// // public class main{
// //     public static void main (String args[]){
// //         for (int line = 1;line<=4;line++){
// //             for (int num =1; num<= line;num ++){
// //                 System.out.print(num);
// //             }
// //             System.out.println();
// //         }
// //     }
// // }


// // code to write a pattern of continuous characters

// // public class mainu{
// //     public static void main(String args[]){
// //         int n = 4;
// //         char ch = 'A';

// //         for(int line =1;line<=n;line++){
// //             for(int chars = 1; chars<=line;chars++){
// //                 System.out.print(ch);
// //                 ch++;
// //             }System.out.println();  
// //         }
             
// //         }
// //     }

// // public class mainu{
// //     public static void printsubarray(int numbers[]){
// //         int ts=0;
// //         for(int i=0;i<numbers.length; i++){
// //             int start = i;
// //             for (int j = i;j<numbers.length;j++){
// //                 int end = i;
// //                 for(int k = start;k<=end;k++){
// //                     System.out.print(numbers[k]+"");
// //                 }
// //                 ts++;
// //                 System.out.println();
// //             }
// //             System.out.println();
// //         }
// //         System.out.println( "total subarrays:" +ts);
// //     }

// // }

// // public class mainu{
// //     public static void hollow_rectangle(int totrows,int totcols){
// //         for(int i = 1;i<=totrows;i++){
// //             for(int j = 1; j<=totcols;j++){
// //                 if(  i == 1 ||i == totrows || j == 1 || j == totcols){
// //                     System.out.print("*");
// //                 }else{
// //                     System.out.print(" ");
// //                 }
// //             }
// //             System.out.println("");
// //         }
// //     }


// //     public static void main(String args[]){

// //     hollow_rectangle(4,5);
// // }
// // }

// // public class mainu{
// //     public static void inverted_half_triangle(int n){
// //         for(int i=1;i<=n;i++){
// //             for (int j=1; j<=n-i; j++){
// //                 System.out.print(" ");
// //             }
// //             for(int j=1; j<=i; j++){
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }

// //     public static void main(String args[]){
// //         inverted_half_triangle(5);
// //     }

// // }

// // public class mainu{

// //     public static void inverted_half_triangle_numbers(int n){
// //         for (int i =1;i<=n;i++){
// //             for(int j=1;j<=n-i+1;j++){
// //                 System.out.print(j+"");
// //             }
// //             System.out.println();
// //         }
        
// //      }
// //      public static void main(String args[]){
// //          inverted_half_triangle_numbers(5);
// //     }
// // }

// //floyd's trianlge

// // public class mainu{
// // public static void floyd(int n){
// // int counter = 1;
// //      for(int i=1; i<=n;i++){

// //             for(int j=1;j<=i;j++){
// //                 System.out.print(counter+" ");
// //                 counter++;
// //             }
// //             System.out.println();
// //         }
// // }
// //     public static void main(String args[]){
// // floyd(5);
       
// //     }
// // }

// //0-1 triangle

// public class mainu{
// public static void zero_one(int n){

//     for(int i=1;i<=n;i++){
//         for(int j=1; j<=i;j++){
//             int sum = j+i;
//             int even = sum%2;
//             if(even == 0){
//                 System.out.print("1");
//             }else{
//                 System.out.print("0");
//             }
            
//         }
//         System.out.println();
//     }
// }
//     public static void main(String args[]){

//         zero_one(6);
//     }
// }
// public class mainu{

//     public static void butterfly(int n){
//         //first half
//         for(int i = 1;i<=n;i++){
//                 for(int j=1;j<=i;j++){
//                     System.out.print("*");
//                 }

//                 for(int j=1;j<=2*(n-i);j++){
//                     System.out.print(" ");
//                 }
//                 for(int j=1;j<=i;j++){
//                     System.out.print("*");
//                 }
//             System.out.println();
//         }

//         //second half

//         for(int i=n;i>=1; i--){
//             for(int j=1;j<=i;j++){
//                     System.out.print("*");
//                 }

//                 for(int j=1;j<=2*(n-i);j++){
//                     System.out.print(" ");
//                 }
//                 for(int j=1;j<=i;j++){
//                     System.out.print("*");
//                 }
             
//                 System.out.println();
//         }
        
//     }

//     public static void main(String args[]){
//         butterfly(5);
//     }

// }
public class main{
    public static void rhom(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            System.out.print("****");
            System.out.println();
        }
    }
    public static void mainu(String args[]){
        rhom(005);
    }
}