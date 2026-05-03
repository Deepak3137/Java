public class abstractKeyword {
  public static void main(String[] args) {
    // the abstract keyword in java is used to declare a class as abstract. an
    // abstract class cannot be instantiated, but it can be subclassed. an abstract
    // class can have abstract methods, which are methods without a body. the
    // subclasses of an abstract class must provide an implementation for the
    // abstract methods.

    // example
    abstract class animal {
      abstract void eat();
    }

    class dog extends animal {
      void eat() {
        System.out.println("barking...");
      }
    }
    // animal a = new animal(); // error: cannot instantiate the type animal
    animal a = new dog();
    a.eat(); // barking...
  }
}