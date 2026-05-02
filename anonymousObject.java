
class student {
    public student() {
      System.out.println("inside the constructor");
    }
  } 

public class anonymousObject {
  public static void main(String[] args) {
    new student(); // anonymous object
    // means it don't have any refrence to it which means we can used this only one time
    // 2nd time we do this, a new object is created.
  }
}