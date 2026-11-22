public static void substring(String s, String ans, int i){
    //base case
    if(i == s.length()){
        if(ans.length() == 0){
            System.out.println("null");
        }
        else{
            System.out.println(ans);
        }
        return;
    }
    // yes
    substring(s, ans+s.charAt(i), i+1);
    //no
    substring(s, ans, i+1);
}

public static void main(String argvs[]){
    String s = "abc";
    substring(s, "", 0);
}