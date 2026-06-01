import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class comparatorr {
  public static void main(String[] args) {
    
    List<Integer> list = new ArrayList<>();
    list.add(42);
    list.add(27);
    list.add(31);
    list.add(19);

    System.out.println("Before sorting: " + list);

    Collections.sort(list);


    System.out.println("After sorting: " + list);


    Comparator<Integer> com = new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        return Integer.compare(a % 10, b % 10); // 1 for swap and -1 for not swap
      }
    };

    Collections.sort(list, com);
    System.out.println("After sorting with comparator: " + list);
  }
}