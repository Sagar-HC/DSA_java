package arraylist;

import java.util.*;

public class swap {
    public static void swapArray(ArrayList<Integer> list,int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
     public static void main(String argvs[]){
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(14);
        l1.add(5);
    
        swapArray(l1, 1, 3);
        //  for(int i =0;i<l1.size();i++){
        //     int element = l1.get(i);
        // System.out.println(element);
        // }
        System.out.print(l1);
        Collections.sort(l1);
        System.out.println(l1);

    }
}
