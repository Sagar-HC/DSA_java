package arraylist;
import java.util.*;
public class maxwater {
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
}

}

