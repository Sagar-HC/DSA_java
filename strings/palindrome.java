public class palindrome {
    
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }return true;
    }

    public static float shortestPath(String str){
        int n = str.length();
        int x= 0;
        int y = 0; 
        for (int i = 0; i<n;i++){
            int c = str.charAt(i);
            //north
            if(c == 'n'){
                y++;
            }
            //south
            else if(c == 's'){
                y--;
            }
            //east
            else if(c == 'e'){
                x++;
            }
            //west
            else if(c == 'w'){
                x--;
            }
            
        }int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(Y2+X2);
            
    }

    public static void main(String[] args) {
        // String str1 = "racecar";
        // System.out.println(isPalindrome(str1));
        String str10 = "nnwwsseeeeesswssee";
        System.out.print(shortestPath(str10));
    }
}

