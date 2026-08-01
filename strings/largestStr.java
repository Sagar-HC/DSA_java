public class largestStr {
// largest String by actual length
    public static void largestStrr(String str1,String str2,String str3){
        
        if(str1.length()>str2.length() && str1.length() >str3.length() ){
            System.out.print(str1 +" "+"is the largest String");
        }if(str1.length()<str2.length() && str2.length() >str3.length()){
            System.out.print(str2 +" "+"is the largest String");
        }else{
            System.out.print(str3 +" "+"is the largest String");
        }
    }

    

    public static void main(String args[]){

//largest String by lexographic order
        String fruits[]={ "apple", "banana", "mango"};//mango should be the answer
        String largest = fruits[0];
        for(int i = 1 ; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }   
        }
        System.out.println(largest);
    }
}
