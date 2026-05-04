public class enumBasics {
  enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
  }

  public static void main(String[] args) {
    Day today = Day.MONDAY;
    System.out.println("Today is " + today); // Today is MONDAY

    // we can also use the ordinal() method to get the index of the enum constant.
    System.out.println("Index of " + today + " is " + today.ordinal()); // Index of MONDAY is 1

    // we can also use the values() method to get an array of all the enum
    // constants.
    Day[] days = Day.values();
    System.out.println("All days of the week:");
    for (Day day : days) {
      System.out.println(day);
    }
  }
}