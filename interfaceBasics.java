
// we can declare an interface using the interface keyword. the syntax for
// declaring an interface is as follows:
interface A {
  int myVar = 10;
  // all the member variable in the interface are final and static by default
  // bacause interface is a collection of abstract methods and static constants.
  // so we can't change the value of myVar in the implementation class.

  // static in interface means that the variable belongs to the interface and not
  // to any instance of the interface. it can be accessed using the interface
  // name, like A.myVar.

  // we can also refrence the variable using the instance of the interface, but it
  // is not recommended because it can lead to confusion and it is not clear that
  // the variable belongs to the interface and not to the instance of the
  // interface. for example:
  // A obj = new MyClass();
  // System.out.println(obj.myVar); // this is correct but it is not recommended
  // because it can lead to confusion and it is not clear that the variable
  // belongs to the interface and not to the instance of the interface.

  void myMethod();
  // public abstract void myMethod(); this is also correct since all the methods
  // in the interface are abstract and public by default.
}

// we can implement an interface using the implements keyword. the syntax for
// implementing an interface is as follows
class MyClass implements A {
  int var = 20;
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

    // A a; // we can also declare a reference variable of the interface type and assign it
       // to an instance of the class that implements the interface. this is called
       // upcasting. upcasting is the process of converting a subclass type to a
       // superclass type. it is done implicitly by the java compiler. it is also
       // known as widening conversion.
    System.out.println(A.myVar); // 10 - we can access the static variable of the interface using the interface
                                 // name
    // System.out.println(a.myVar); // 10 - we can also access the static variable
    // of the interface using the instance of the interface, but it is not
    // recommended because it can lead to confusion and it is not clear that the
    // variable belongs to the interface and not to the instance of the interface.

  }
}