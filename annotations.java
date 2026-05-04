class A {
  public void display() {
    System.out.println("Hello World in A");
  }
}

class B extends A {

  // this means that we are overriding the display method of class A in class B.
  // it is used to provide metadata for the code to the compiler and to the
  // runtime environment. it is also used to provide information about the code to the
  // tools that are used to generate code, documentation, and other resources.
  @Override
  public void display() {
    System.out.println("Hello World in B");
  }
}

public class annotations {
  public static void main(String[] args) {

    A objA = new A();
    objA.display(); // Hello World in A

    A objA2 = new B();
    objA2.display(); // Hello World in B

    B objB = new B();
    objB.display(); // Hello World in B
  }
}