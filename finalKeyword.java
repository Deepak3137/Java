public class finalKeyword {
  public static void main(String[] args) {
    // the final keyword in java is used to restrict the user. it can be used with
    // variables, methods and classes. when a variable is declared as final, its
    // value cannot be changed once it is initialized. when a method is declared as
    // final, it cannot be overridden by any subclass. when a class is declared as
    // final, it cannot be subclassed.  

    // example
    final int x = 10;
    // x = 20; // error: cannot assign a value to final variable x  

    final class animal {
      void eat() {
        System.out.println("eating...");
      }
    }

    // class dog extends animal { // error: cannot subclass a final class
    //   void eat() {
    //     System.out.println("barking...");
    //   }
    // }  

    class animal2 {
      final void display() {
        System.out.println("displaying...");
      }
    }

    // class child extends animal2 {
    //   void display() { // error: cannot override a final method
    //     System.out.println("displaying child...");
    //   }
    // }
  }
}