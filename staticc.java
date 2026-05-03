class student {
  String name;
  int rollno;
  static String schoolName;

  static { // used for initilize the static variable , this called only once . doesn't
           // depend on how many object you created.
    schoolName = "xyz";
  }

  public void getdata() {
    System.out.println(name + " : " + rollno + " : " + schoolName);
  }

  // static member function
  public static void data() {
    // System.out.println(name + " : " + rollno + " : " + schoolName);
    // this is wrong since we use static variable in static function
    // for using instance variable pass the obj of the instance you want the data
    // from when calling data()
  }
}

public class staticc {
  public static void main(String[] args) {
    student deepak = new student();
    student deepak2 = new student();

    deepak.name = "deepak";
    deepak.rollno = 1;
    deepak.schoolName = "abc";

    deepak2.name = "deepak2";
    deepak2.rollno = 2;
    deepak2.schoolName = "xyz";

    System.out.println(student.schoolName); // used the class name for static variable

    deepak.getdata(); // deepak 1 xyz
    deepak2.getdata(); // deepak2 1 xyz

    // static block execute when the class load in the class loader. this is done
    // when we create the object.
    // this is done only one time, then when we again create the new object, class
    // is already loaded.
    // when we load the class, then there this static block is called.
    // if we don't make object of the class, the static block is not executed.
    // but we explicitly load the class without creating the object.
    // this is done by the class class.

    // Class.forName(student); this will load the student class.

  }
}