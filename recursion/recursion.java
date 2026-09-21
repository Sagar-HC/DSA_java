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

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstRec(int arr[],int i,int n){
       if( i == arr.length-1 && arr[i] !=n ){
        System.out.println("number doesnt exists in the arr");
        return -1;
       }
       
        if( arr[i] == n){
        return i;
       };
      return firstRec(arr, i+1, n);

    }
    public static int lastRec(int arr[],int key,int i){
       if( i == arr.length){
        return -1;
       }
       int isFound = lastRec(arr, key, i+1);

       
        if(isFound == -1 && arr[i] == key){
                return i;
       };

       return isFound;
     
    }
//tiles problem with a side of length 2 and another n;
    public static int tiles(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        int fnm1 = tiles(n-1);
        int fnm2 = tiles(n-2);

        return fnm1+fnm2;
    }

    public static void duplicate(String str, int i , boolean[] alp, StringBuilder newstr){
        if( i == str.length() ){
            System.out.print(newstr);
            return;
        }
        char currChar = str.charAt(i);
        if(alp[currChar - 'a'] == true){
            //duplicate
            duplicate(str, i+1, alp, newstr); 
        }else{
            alp[currChar - 'a'] = true;
            duplicate(str, i+1, alp, newstr.append(currChar));
        }

    }

    public static int pair(int i){
        if(i == 1 || i == 2){
            return i;
        }
        // int fnm1 = pair(i-1);
        // int fnm2 = pair(i-2);
        // int pairways = (i-1)*fnm2;
        return pair(i-1)+(i-1)*pair(i-2);
    }

    public static void main(String args[]){
    System.out.print(pair(3));
    }

}


