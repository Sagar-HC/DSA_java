package arraylist;
import java.util.*;
public class maxwater {
    //brute force TC = O(n**2)
    public static void water(ArrayList<Integer> height){
        int MaxWater = Integer.MIN_VALUE;
        for(int i = 0; i<height.size();i++){
            for(int j = i+1; j<height.size();j++){
                int H1 = height.get(i);
                int H2 = height.get(j);
                int H = Math.min(H1,H2);
                int b = j - i;
                int water = H*b;
                MaxWater = Math.max(MaxWater,water);
            }
        }
        System.out.print(MaxWater);
        

    }
    // 2 pointer approach with TC = O(n)
    public static int water2(ArrayList<Integer> height){
        int maxwater = Integer.MIN_VALUE;
        int si =0;
        int ei = height.size()-1;
        while(si<ei){
            int H = Math.min( height.get(ei),height.get(si));
            int B = ei -si;
            int paani = H*B;
            maxwater = Math.max(maxwater,paani);
            if(height.get(ei)<height.get(si)){
                ei--;
            }else{
                si++;
            }
        }return maxwater;
    }




 public static void main(String args[]){
    ArrayList <Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    water(height);
    System.out.println("-------------");
    System.out.println(water2(height));
}

}

