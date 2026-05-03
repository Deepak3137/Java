class A {
  void display() {
    System.out.println("Hello from class A");
  }
}

public class anonymousClass {
  public static void main(String[] args) {
    A obj = new A() {
      void display() {
        System.out.println("Hello from anonymous class");
      }
    };
    // in the above code, we have created an anonymous class which is a subclass of
    // class A and we have overridden the display method of class A in the anonymous
    // class. when we call the display method on the object of the anonymous class,
    // it calls the display method of the anonymous class instead of the display
    // method of class A.
    
    obj.display(); // Hello from anonymous class
  }
}