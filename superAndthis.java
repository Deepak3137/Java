class animal {
  public animal() {
    super(); // this will call the constructor of the parent class which is object class.
    System.out.println("inside the constructor of animal class");
  }

  void eat() {
    System.out.println("eating...");
  }
}

class dog extends animal {
  public dog() {
    super(); // this will call the constructor of the parent class.
    this("deepak"); // this will call the constructor of the current class with the parameter.
  }

  public dog(String name) {
    System.out.println("inside the constructor of dog class");
  }

  void eat() {
    System.out.println("barking...");
  }

  void bark() {
    System.out.println("barking...");
  }

  void work() {
    super.eat(); // this will call the eat method of the parent class.
    this.eat(); // this will call the eat method of the current class.
  }
}

class superAndthis {
  public static void main(String[] args) {
    // super is used to refer to the parent class object. this is used to access the
    // members of the parent class.
    // this is used to call the constructor of the parent class.

    dog d = new dog();
    d.work(); // eating... barking...
  }
}