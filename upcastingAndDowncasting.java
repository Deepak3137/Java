public class upcastingAndDowncasting {
  public static void main(String[] args) {
    // upcasting is the process of converting a subclass type to a superclass type.
    // it
    // is done implicitly by the java compiler. it is also known as widening
    // conversion. downcasting is the process of converting a superclass type to a
    // subclass type. it is done explicitly by the programmer. it is also known as
    // narrowing conversion.

    // example
    class animal {
      void eat() {
        System.out.println("eating...");
      }
    }

    class dog extends animal {
      void eat() {
        System.out.println("barking...");
      }

      boolean isPet() {
        return true;
      }
    }

    animal a = new dog(); // upcasting
    a.eat(); // barking...
    // a.isPet(); // error: cannot find symbol method isPet() in animal class

    ((dog) a).isPet(); // downcasting, true

    //dog d = new animal(); // error: incompatible types: animal cannot be converted to dog
    // to avoid this error, we need to use downcasting
   // dog d = (dog) new animal(); // downcasting, but it will throw a ClassCastException at runtime because the
                                // actual object is of type animal and cannot be cast to type dog

    // to avoid this error, we can use the instanceof operator to check if the object is of the correct type before downcasting
    if (a instanceof dog) {
      dog d1 = (dog) a; // downcasting, but it will not throw a ClassCastException at runtime because the actual object is of type dog and can be cast to type dog
      System.out.println(d1.isPet()); // true
    } else {
      System.out.println("The object is not of type dog");  
  }
}