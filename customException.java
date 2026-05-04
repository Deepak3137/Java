class OwnException extends Exception {
  public OwnException(String message) {
    super(message);
  }
}
public class customException {  
  public static void main(String[] args) {
    int i = 11, result = 0;
      try {
        result = 10 / i; // this will throw ArithmeticException if i==0
        if (result == 0) {
          throw new OwnException("Result is zero");
        }
        System.out.println("The result is: " + result);
      } catch (OwnException e) {
        result = 10 / 1; // this will not throw ArithmeticException
        System.out.println("OwnException Output: " + e.getMessage());
      }

      System.out.println(result);
  }
      
}