abstract class A {
  abstract void display();
}

public class abstractAndAnonymousInnerClass {
  public static void main(String[] args) {

    A obj = new A() {
      void display() {
        System.out.println("Hello from anonymous class");
      }
    };
    // above code is an example of anonymous inner class which is a subclass of
    // abstract class A and we have overridden the display method of class A in the
    // anonymous inner class. when we call the display method on the object of the
    // anonymous inner class, it calls the display method of the anonymous inner
    // class instead of the display method of class A.

    // by using the anonymous inner class, we can create an object of the abstract
    // class and we can provide the implementation of the abstract method in the
    // anonymous inner class.

    obj.display(); // Hello from anonymous class
  }
}