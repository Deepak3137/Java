class A extends Thread {
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("A Thread is running...");
      // for printing the o/p for both the threads, we can use the sleep() method to
      // pause the execution of the thread for a certain amount of time. this will
      // allow the other thread to execute and print its o/p. the sleep() method takes
      // an argument in milliseconds. for example, sleep(1000) will pause the
      // execution of the thread for 1 second.
      try {
        Thread.sleep(10); // pause the execution of the thread for 1 second
      } catch (InterruptedException e) {
        e.printStackTrace(); // handle the InterruptedException
      }
    }
  }
}

class B extends Thread {
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("B Thread is running...");
    }
    try {
      Thread.sleep(10); // pause the execution of the thread for 1 second
    } catch (InterruptedException e) {
      e.printStackTrace(); // handle the InterruptedException
    }
  }
}

class MyRunnable implements Runnable {
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("MyRunnable Thread is running...");
    }
    try {
      Thread.sleep(10); // pause the execution of the thread for 1 second
    } catch (InterruptedException e) {
      e.printStackTrace(); // handle the InterruptedException
    }
  }
}

public class threadsBasics {
  public static void main(String[] args) {
    // thread is a lightweight process that can run concurrently with other threads.
    // it is a separate path of execution in a program. it is used to perform
    // multiple tasks simultaneously. it is also used to improve the performance of
    // a program by allowing multiple tasks to run concurrently.

    // there are two ways to create a thread in java:
    // 1. by extending the Thread class
    // 2. by implementing the Runnable interface

    // by extending the Thread class
    A t1 = new A();
    t1.start(); // start() method is used to start the thread. it calls the run() method of the
                // thread.

    try {
      t1.sleep(10); // pause the execution of the thread for 1 second
    } catch (InterruptedException e) {
      e.printStackTrace(); // handle the InterruptedException
    }
    B t2 = new B();
    t2.start(); // start() method is used to start the thread. it calls the run() method of the
                // thread.

    // we can also set the priority of the thread using the setPriority() method.
    // the priority of the thread is an integer value between 1 and 10. the default
    // priority of the thread is 5. the higher the priority of the thread, the more
    // chances it has to get executed.
    // t1.setPriority(7); // set the priority of thread t1 to 7
    // t2.setPriority(3); // set the priority of thread t2 to 3
    // t1.setPriority(Thread.MAX_PRIORITY); // set the priority of thread t1 to 10

    // priority ranges from 1 to 10. the higher the priority, the more chances it
    // has to get executed. the default priority is 5. the thread with higher
    // priority will get executed first. if two threads have the same priority, then
    // the thread that is created first will get executed first.

    // by implementing the Runnable interface
    MyRunnable r1 = new MyRunnable();
    Thread t3 = new Thread(r1);
    t3.start(); // start() method is used to start the thread. it calls the run()
    // method of the
    // thread.
  }
}