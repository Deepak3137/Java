public class upcastingAndDowncasting {
  public static void main(String[] args) {
    // upcasting is the process of converting a subclass type to a superclass type. it
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
  }
}