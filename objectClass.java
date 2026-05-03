public class objectClass {
  public static void main(String[] args) {
    // the object class in java is the root class of the java class hierarchy. every
    // class in java is a subclass of the object class. it is the superclass of all
    // classes in java. it provides a set of methods that are common to all objects
    // in java. these methods include toString(), equals(), hashCode(), getClass(),
    // and many more.

    // example
    class animal {
      void eat() {
        System.out.println("eating...");
      }
    }

    animal a = new animal();
    System.out.println(a.toString()); // objectClass$1animal@15db9742
    System.out.println(a.hashCode()); // 366712642
    System.out.println(a.getClass()); // class objectClass$1animal
    System.out.println(a.getClass().getName()); // objectClass$1animal
    a.eat(); // eating...
  }
}