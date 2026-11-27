package arraylist;
import java.util.*;

public class arraylist {
    public static void main(String argvs[]){
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(14);
        l1.add(5);

        int max = Integer.MIN_VALUE;
        for(int i =0;i<l1.size();i++){
           
            int element = l1.get(i);
            //  if(max<element){
            //     max=element;
            //  }//my approach

            max = Math.max(max, element);

            
        System.out.println(element);
        }
        System.out.println("max is " + max);
        
    }
}
