public class wrapperClass {
  public static void main(String[] args) {
    // wrapper class in java is a class that provides a way to use primitive data
    // types as objects. it is a part of the java.lang package. the wrapper class
    // provides a set of methods that are used to convert primitive data types to
    // objects and vice versa. the wrapper class also provides a set of methods that
    // are used to perform operations on the primitive data types.

    // example
    int x = 10;
    Integer y = Integer.valueOf(x); // converting int to Integer
    System.out.println(y); // 10

    Integer z = 20;
    int w = z.intValue(); // converting Integer to int
    System.out.println(w); // 20

    // the wrapper class also provides a set of methods that are used to perform
    // operations on the primitive data types. for example, the Integer class
    // provides a method called parseInt() which is used to convert a string to an
    // integer.
    String str = "30";
    int num = Integer.parseInt(str);
    System.out.println(num); // 30

    // boxing and unboxing
    // boxing is the process of converting a primitive data type to an object. it is
    // done implicitly by the java compiler. unboxing is the process of converting
    // an object to a primitive data type. it is also done implicitly by the java
    // compiler.
    Integer a = 40; // boxing
    int b = a; // unboxing
    System.out.println(a); // 40
    System.out.println(b); // 40

    // automatic boxing and unboxing
    // automatic boxing and unboxing is a feature of java that allows the java
    // compiler to automatically convert between primitive data types and their
    // corresponding wrapper classes. this feature was introduced in java 5.
    Integer c = 50; // automatic boxing
    int d = c; // automatic unboxing
    System.out.println(c); // 50
    System.out.println(d); // 50
  }
}