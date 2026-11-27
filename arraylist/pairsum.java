package arraylist;
import java.util.*;
public class pairsum {
    public static boolean pairsum2(ArrayList<Integer> list,int target){
        int si = 0,ei =list.size()-1;
        while(si<ei){
            int cursum =list.get(si) +list.get(ei);
            if(cursum == target){
                return true;
            }if(cursum>target){
                ei--;
            }else{
                si++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        int target = 200;
        System.out.println(pairsum2(l1, target));
    }
}
