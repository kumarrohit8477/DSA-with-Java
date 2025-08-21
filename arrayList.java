import java.util.ArrayList;

public class arrayList {
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      list.add(2);
      System.out.println(list);
      System.out.println("Size of the list: " + list.size());
      System.out.println(list.remove(2));
      System.out.println(list.get(2));
      System.out.println(list);

      
   }
      
}
