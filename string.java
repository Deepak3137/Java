public class string{

  static void main (String arg[]) {
    String name = "Deepak";

    System.out.println(name); //Deepak

    //another way
    String Name = new String("Deepak");
    System.out.println(Name); // Deepak

    name += " Kumar";

    System.out.println(name); // Deepak Kumar
    // this is immutable string means it's cant change. Everytime when we change this, a new memory created
    // and store the string and then the address of the new string is replaced with the new one.

    // So, for mutable string, we use stringbuffer
    StringBuffer s1 = new StringBuffer("Deepak");

    System.out.println(s1); //Deepak
    System.out.println(s1.charAt(1)); // e
    System.out.println(s1.capacity()); // 22 -> 16 (size of stringbuffer) + 6 ( size of deepak);

  }

}