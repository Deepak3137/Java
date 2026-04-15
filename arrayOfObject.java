class student {
  String name;
  int marks;
}

class arrayObject {
  public static void main(String a[]) {
    student students[] = new student[3];

    students[0] = new student();
    students[0].name = "Deepak";
    students[0].marks = 90;

    students[1] = new student();
    students[1].name = "Rahul";
    students[1].marks = 78;

    students[2] = new student();
    students[2].name = "Praveen";
    students[2].marks = 85;

    for(int i=0; i<students.length; i++) {
      System.out.println(students[i].name + " : " + students[i].marks);
    }
  }
}