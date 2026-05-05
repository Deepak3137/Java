import java.util.ArrayList;

public class collectionArrayList {
  public static void main(String[] args) {
    // ArrayList is a resizable array implementation of the List interface. it is
    // part of the java.util package and provides a way to store and manipulate
    // groups of objects. it allows duplicate elements and maintains the order of
    // insertion. it also provides various methods to perform operations on the
    // list,
    // such as adding, removing, and searching for elements.
    // Collection <E> -> List <E> -> ArrayList <E>
    // List provides diifferent methods to manipulate the list such as add(),
    // remove(), get(), size(), contains(), clear(), etc.

    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("World");
    list.add("Java");
    list.add("Programming");

    System.out.println(list); // [Hello, World, Java, Programming]

    list.remove("Java");
    System.out.println(list); // [Hello, World, Programming]

    System.out.println(list.get(0)); // Hello

    System.out.println(list.size()); // 3

    System.out.println(list.contains("World")); // true

    list.clear();
    System.out.println(list); // []
  }
}