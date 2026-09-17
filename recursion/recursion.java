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

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n*fnm1; 
        return fn;
        
    }

    public static int sum(int n){
        if(n == 1 ){
            return 1;
        }
        int sum1 = sum(n-1);
        int ans = sum1+n;
        return  ans;
    }

    public static int fibb(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibnm1 = fibb(n-1) ;
        int fibnm2 = fibb(n-2);
        int fib = fibnm1+fibnm2;

        return fib;
    }
    public static void main(String args[]){
        // recurse(10);
        // recurseInverse(10);
        System.out.print(fibb(5));
    }

}


