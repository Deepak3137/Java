public class methodOverriding {
  public static void main(String[] args) {
    // method overriding is a feature of object oriented programming which allows a subclass to provide a specific implementation of a method that is already provided by its parent class. the implementation in the subclass overrides the implementation in the parent class.

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
    }

    dog d = new dog();
    d.eat(); // barking...  

    // in the above example, the eat method of the dog class overrides the eat method of the animal class. when we call the eat method on the dog object, it calls the eat method of the dog class instead of the eat method of the animal class.
  }
}