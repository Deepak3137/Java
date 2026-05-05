import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class collectionsSet {
  public static void main(String[] args) {
    // Set is a collection that contains no duplicate elements. it is an interface
    // that extends the Collection interface. it is implemented by the HashSet,
    // LinkedHashSet, and TreeSet classes. it does not maintain the order of
    // insertion. it also provides various methods to perform operations on the set,
    // such as adding, removing, and searching for elements.

    // Collection <E> -> Set <E> -> HashSet <E>
    // Set provides different methods to manipulate the set such as add(), remove(),
    // contains(), size(), clear(), etc.

    // HashSet is a class that implements the Set interface. it is part of the
    // java.util package and provides a way to store and manipulate groups of objects. it
    // does not maintain the order of insertion and does not allow duplicate elements.
    // it also provides various methods to perform operations on the set, such as
    // adding, removing, and searching for elements.

    Set<Integer> set = new HashSet<Integer>(); // here Set is an interface and HashSet is a class that implements the Set interface.
    //  we can also use HashSet<Integer> set = new HashSet<>(); but it is recommended to use the interface type for 
    // the reference variable to allow for flexibility in changing the implementation later if needed.
    set.add(3);
    set.add(2);
    set.add(1);
    set.add(2); // duplicate element, will not be added to the set    

    System.out.println(set); // [3, 2, 1] - the order of insertion is not maintained


    Set<Integer> set2 = new TreeSet<Integer>(); // here Set is an interface and TreeSet is a class that implements the Set interface. we can also use TreeSet<Integer> set2 = new TreeSet<>(); but it is recommended to use the interface type for the reference variable to allow for flexibility in changing the implementation later if needed.
    set2.add(3);
    set2.add(1);
    set2.add(2);  
    set2.add(2); // duplicate element, will not be added to the set

    System.out.println(set2); // [1, 2, 3]

  }
}