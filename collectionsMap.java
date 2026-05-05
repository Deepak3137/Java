import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class collectionsMap {
  public static void main(String[] args) {
    // A map is a collection that stores key-value pairs. it does not maintain the
    // order of insertion.
    // we can use the HashMap class to create a map. the HashMap class implements
    // the Map interface.

    Map<String, Integer> map = new HashMap<>();
    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);

    System.out.println(map); // {one=1, two=2, three=3} - the order of insertion is not maintained

    for (String key : map.keySet()) {
      System.out.println(key + " = " + map.get(key)); // one = 1 two = 2 three = 3 - the order of insertion is not
                                                      // maintained
    }

    // we can also use an iterator to iterate over the map. the iterator does not
    // maintain the order of insertion.
    Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<String, Integer> entry = it.next();
      System.out.println(entry.getKey() + " = " + entry.getValue()); // one = 1 two = 2 three = 3 - the order of
                                                                     // insertion is not maintained
    }

    // Iterating over a map using for-each loop
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " = " + entry.getValue()); // one = 1 two = 2 three = 3 - the order of
                                                                     // insertion is not maintained
    }
    // we can also use the containsKey() method to check if a key is present in the
    // map or not.
    System.out.println(map.containsKey("two")); // true

    // Hashtable is a class that implements the Map interface. it is part of the
    // java.util package and provides a way to store and manipulate groups of
    // objects. it does not maintain the order of insertion and does not allow null
    // keys or values. it also provides various methods to perform operations on the
    // map, such as adding, removing, and searching for elements.

    // difference between HashMap and Hashtable:
    // 1. HashMap is not synchronized, while Hashtable is synchronized. this means
    // that HashMap is not thread-safe, while Hashtable is thread-safe.
    // 2. HashMap allows null keys and values, while Hashtable does not allow null
    // keys or values.

    // TreeMap is a class that implements the Map interface. it is part of the
    // java.util package and provides a way to store and manipulate groups of
    // objects. it maintains the order of insertion and does not allow null keys or
    // values. it also provides various methods to perform operations on the map,
    // such as adding, removing, and searching for elements. TreeMap is implemented
    // as a red-black tree, which is a self-balancing binary search tree. it
    // provides logarithmic time complexity for the basic operations such as get()
    // and put().

    // difference between HashMap and TreeMap:
    // 1. HashMap does not maintain the order of insertion, while TreeMap maintains
    // the order of insertion.
    // 2. HashMap allows null keys and values, while TreeMap does not allow null
    // keys or values.

    // Map<String, Integer> treeMap = new TreeMap<>();
  }
}