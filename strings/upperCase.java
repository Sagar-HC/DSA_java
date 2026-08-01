public class upperCase {
    public static String toUpperCase( String str){
        StringBuilder stre = new StringBuilder("");
        char ch =  Character.toUpperCase(str.charAt(0));
        stre.append(ch);

        for(int i =1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                stre.append(str.charAt(i)); 
                i++;  
                stre.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                stre.append(str.charAt(i)); 
            }

        }
        return stre.toString();

    }
    public static void main(String args[]){
     System.out.println(toUpperCase("hi i am sagar hc"));
    }

}
