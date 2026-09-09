package bit_manipulation;

public class get_ith {
    public static int get_inth(int n, int i){
        int bitmask = 1<<i;
        int get = n | bitmask;
        return(get);
    } 
    //this was for get 

    public static int clear(int n , int i){
        int bitmask = 1<<i;
        int notBit = ~(bitmask);
        return n & notBit;
    }



    public static int update( int n , int i , int bit){
        // if(bit == 0){
        //    return clear(n, i);
        // }else{
        // }
         n = clear(n,i);
        int bitmask = bit<<i;
         return  n | bitmask; 

        
    }
    public static void main(String[] args){
        // System.out.print(get_inth(10,2)); this is for get 
        System.out.print(update(10,1 ,1));
    }
}
