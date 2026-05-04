class Counter {
  private int count = 0;

  public void increment() {
    count++;
  }

  public int getCount() {
    return count;
  }
}

public class threadsRaceConditions {
  public static void main(String[] args) {
    Counter counter = new Counter();

    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        counter.increment();
      }
    });

    // this can also be replaced with an anonymous class like this:
    // Thread thread2 = new Thread(new Runnable() {
    // @Override
    // public void run() {
    // for (int i = 0; i < 1000; i++) {
    // counter.increment();
    // }
    // }
    // });

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        counter.increment();
      }
    });

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Final count: " + counter.getCount()); // this will not always print 2000 due to race conditions

    // to fix this issue, we can use synchronization to ensure that only one thread
    // can access the increment() method at a time. we can do this by adding the
    // synchronized keyword to the increment() method like this:
    // public synchronized void increment() {
    // count++;
    // }
  }
}