package arraylist;
 import java.util.*;

public class pairsum2 {
    public static boolean pairsum(ArrayList<Integer> list,int target){
        int bp=-1;
        for(int i = 0; i<list.size();i++){
            if(list.get(i)> list.get(i+1)){
                bp = i;
                break;
            }
        }
        //case1
    int si = bp+1;
    int ei = bp;
    int n = list.size();
        while(si != ei){
            if(list.get(ei)+list.get(si) == target){
            return true;
            }
        //case2 target>this
             if(list.get(ei)+list.get(si)>target){
            ei = (ei+n-1)%n;
            }
        //case 2 
            else{
            si = (si+1)%n;
        }
        }
        return false;


    }
    
    public static void main(String[] args) {
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(15);
        l2.add(6);
        l2.add(9);
        l2.add(8);
        l2.add(10);

        int target = 27;
        System.out.print(pairsum(l2, target));
    }
}
