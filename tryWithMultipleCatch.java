public class tryWithMultipleCatch {
  public static void main(String[] args) {
    int arr[] = new int[5];
    try {
      int result = 10 / 0; // this will throw ArithmeticException
      arr[10] = 20; // this will throw ArrayIndexOutOfBoundsException
      System.out.println("The result is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index is out of bounds");
    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }

    System.out.println("Program continues after handling exceptions");
  }
}