class world {
  int nums[] = new int[4];
  public void assign(){
    for(int i=0; i<4; i++) {
      nums[i] = i;
    }
  }

  public void print() {
    System.out.println("Inside the print function");
    for(int i=0; i<4; i++) {
      System.out.println(nums[i]);
    }
  }
}

class hello {
  public static void main(String arg[]) {
    world obj = new world();

    obj.assign();
    obj.print();
  }
}