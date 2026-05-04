public class typesOfInterfaces {
  public static void main(String[] args) {
    // there are three types of interfaces in java:
    // 1. normal interface
    // 2. functional interface // SAM interface (Single Abstract Method)
    // 3. marker interface

    // normal interface is an interface which contains more than one abstract
    // method.
    // example of normal interface is as follows:
    // interface A {
    // void myMethod1();
    // void myMethod2();
    // }

    // functional interface is an interface which contains only one abstract method.
    // example of functional interface is as follows:
    // @FunctionalInterface
    // interface B {
    // void myMethod();
    // }

    // marker interface is an interface which does not contain any abstract method.
    // example of marker
    // interface is as follows:
    // interface C {
    // }
    // this is generally used to mark a class for some special behavior. for
    // example, the Serializable interface is a marker interface which is used to
    // store the current state of the object in the hard disk or to send the object
    // over the network. when a class implements the Serializable interface, it
    // indicates that the class can be serialized and deserialized. the Serializable
    // interface does not contain any abstract method, it is just a marker interface
    // which is used to mark a class for some special behavior.

  }
}