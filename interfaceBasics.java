
// we can declare an interface using the interface keyword. the syntax for
// declaring an interface is as follows:
interface A {
  int myVar = 10;
  // all the member variable in the interface are final and static by default
  // bacause interface is a collection of abstract methods and static constants.
  // so we can't change the value of myVar in the implementation class.

  void myMethod();
  // public abstract void myMethod(); this is also correct since all the methods
  // in the interface are abstract and public by default.
}

// we can implement an interface using the implements keyword. the syntax for
// implementing an interface is as follows
class MyClass implements A {
  public void myMethod() {
    System.out.println("Hello from MyClass");
  }
}

interface B extends A {
  void myMethod2();
  // we can also extend an interface using the extends keyword. the syntax for
  // extending an interface is as follows:
  // interface InterfaceName extends Interface1, Interface2, ... {
  // // declaration of abstract methods and static constants
  // }
}

public class interfaceBasics {
  public static void main(String[] args) {
    // interface is a collection of abstract methods and static constants. it is
    // used to achieve abstraction and multiple inheritance in java. it is also
    // used to achieve loose coupling in java.

    // we can also implement multiple interfaces in a class. the syntax for
    // implementing multiple interfaces is as follows:
    // class ClassName implements Interface1, Interface2, ... {
    // // implementation of abstract methods
    // }

    MyClass obj = new MyClass();
    obj.myMethod(); // Hello from MyClass

  }
}