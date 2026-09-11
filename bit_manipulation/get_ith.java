package bit_manipulation;

public class get_ith {
    // public static int get_inth(int n, int i){
    //     int bitmask = 1<<i;
    //     int get = n | bitmask;
    //     return(get);
    // } 
    // //this was for get 

    // public static int clear(int n , int i){
    //     int bitmask = 1<<i;
    //     int notBit = ~(bitmask);
    //     return n & notBit;
    // }



    // public static int update( int n , int i , int bit){
    //     // if(bit == 0){
    //     //    return clear(n, i);
    //     // }else{
    //     // }
    //      n = clear(n,i);
    //     int bitmask = bit<<i;
    //      return  n | bitmask; 

        
    public static int clearInRange(int n,int j,int i){
        int left = (-1)<<(j+1);
        int right = (1<<i) - 1;
        int bitwise = left |right ;
        return n&bitwise;

    }

    public static boolean powerTwo(int n){
        return (n&(n-1)) == 0 ;
    }
    // }
    public static void main(String[] args){
        // System.out.print(get_inth(10,2)); this is for get 
        // System.out.print(update(10,1 ,1));
        System.out.print(powerTwo(8));
    }
}
