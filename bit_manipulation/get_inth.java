package bit_manipulation;

public class get_inth {
    public static  int ith(int n , int i){
        int bitmask = 1<<i;
        if((bitmask & n) == 0) {
            return 0;
        }else{return 1;}
    }

    public static void main(String[] args) {
        System.out.println(ith(10,2));
    }
}
// was quite difficult 
