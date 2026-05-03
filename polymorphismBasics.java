public class polymorphismBasics {
  public static void main(String[] args) {
    // polymorphism is the ability of an object to take on many forms. it is a
    // feature of object oriented programming which allows a single interface to be
    // used for a general class of actions. the specific action is determined by the
    // exact nature of the situation.

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

    animal a = new dog(); // upcasting
    a.eat(); // barking...

    // in the above example, we have created an object of the dog class and assigned
    // it to a reference variable of the animal class. this is called upcasting.
    // when we call the eat method on the animal reference variable, it calls the
    // eat method of the dog class instead of the eat method of the animal class.
    // this is because of polymorphism.
  }
}