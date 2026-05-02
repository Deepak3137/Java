public class inheritenceBasics {
  public static void main(String[] args) {
    // in inheritence we can use the properties of one class in another class.
    // this is done by using the keyword extends.
    // the class which is inherited is called parent class or super class.
    // the class which inherits is called child class or sub class.

    // example
    // parent class
    class animal {
      void eat() {
        System.out.println("eating...");
      }
    }

    // child class
    class dog extends animal {
      void bark() {
        System.out.println("barking...");
      }
    }

    dog d = new dog();
    d.eat(); // eating...
    d.bark(); // barking...


    //this is single level inheritence, we can also extends animal class in another class and then that class can be extended by another class and so on. this is called multi level inheritence.
  }
}