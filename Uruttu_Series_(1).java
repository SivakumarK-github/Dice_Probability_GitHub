import java.util.*;
//to roll two dice find the probabilty of the two dice 1,1------------>>6,6
public class Main {
    public static void main(String[] args) {
      List<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
      for(int i=1; i<=6; i++ ){
        for(int j=1; j<=6; j++){
          ArrayList<Integer>roll = new ArrayList<Integer>();
          roll.add(i);
          roll.add(j);
          li.add(roll);
        }
          
      }
      for(ArrayList<Integer> a:li){
        System.out.print(a.get(0));
        System.out.print(" ");
        System.out.println(a.get(1));
      }
  }
}