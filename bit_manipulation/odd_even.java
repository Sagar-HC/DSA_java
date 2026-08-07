package bit_manipulation;

public class odd_even {
    
    public static void odd_even(int n){
        if((n & 1) == 0){
            System.out.println("the number is even");
        }else{
            System.out.println("number is odd");
        }
    }

    public static void main(String args[]){
        odd_even(1);
        odd_even(10);
    }
}
