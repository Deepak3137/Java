public class dynamicMethodDispatch {
  public static void main(String[] args) {
    // dynamic method dispatch is a mechanism by which a call to an overridden
    // method is resolved at runtime rather than compile time. it is also known as
    // runtime polymorphism.

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

      boolean isPet() {
        return true;
      }
    }

    animal a = new dog(); // upcasting
    a.eat(); // barking...
    // a.isPet(); // error: cannot find symbol method isPet() in animal class
    // the above line will give an error because the reference variable a is of type
    // animal and the method isPet() is not defined in the animal class. even though
    // the actual object is of type dog, the reference variable a can only access
    // the methods defined in the animal class. this is because of dynamic method
    // dispatch. the method to be
    // called is determined at runtime based on the actual object type (dog) rather
    // than the reference type (animal). if we want to call the isPet() method, we
    // need to downcast the reference variable a to the dog class like this:
    // ((dog) a).isPet(); // true
    // but when we call the eat method on the reference variable a, it calls the eat
    // method of the dog class instead of the eat method of the animal class. this
    // is because of dynamic method dispatch. this is the key point of dynamic
    // method dispatch. the method to be called is determined at runtime based on
    // the actual object type (dog) rather than the reference type (animal).

    // in the above example, we have created an object of the dog class and assigned
    // it to a reference variable of the animal class. this is called upcasting.
    // when we call the eat method on the reference variable a, it calls the eat
    // method of the dog class instead of the eat method of the animal class. this
    // is because of dynamic method dispatch.

    // this is same as the example in polymorphismBasics.java, but here we are
    // specifically focusing on the concept of dynamic method dispatch. the key
    // point is that the method to be called is determined at runtime based on the
    // actual object type (dog) rather than the reference type (animal).

    // this is same as like
    // animal a;
    // a = new dog();
  }
}