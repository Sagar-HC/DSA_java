public static void findPermutate(String str, String ans){
    // base
    if(str.length() == 0){
        System.out.println(ans);
        return;
    }
    //recursion
    for(int i =0; i<str.length();i++){
         char curr = str.charAt(i);
        String newstr = str.substring(0,i)+str.substring(i+1);
        findPermutate(newstr, ans+curr  );

    }
}

public static void main(String args[]){
    String s = "fah";
    findPermutate(s,"");

}