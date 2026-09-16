package recursion;

public class recursion {
    public static void recurse(int n){
        if( n == 1){
            System.out.print("1");
            return ;
        }
        System.out.println(n);
        recurse(n-1);
    }
     public static void recurseInverse(int n){
        
          if( n == 1){
            System.out.println("1");
            return ;
        }
        recurseInverse(n-1);
        System.out.println(n);
       

      

    }



    public static void main(String args[]){
        recurse(10);
        recurseInverse(10);
    }

}


