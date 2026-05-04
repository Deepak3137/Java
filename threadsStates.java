public class threadsStates {

  public static void main(String[] args) {
    // thread states in java:
    // 1. New: when a thread is created but not started yet.
    // 2. Runnable: when a thread is ready to run but not running yet. start()
    // method is called on the thread but the thread scheduler has not yet selected
    // it to run.
    // 3. Running: when a thread is executing its task. run() method is called on
    // the thread and the thread scheduler has selected it to run.
    // 4. Blocked: when a thread is waiting for a monitor lock to enter a
    // synchronized block/method.
    // 5. Waiting: when a thread is waiting indefinitely for another thread to
    // perform a particular action. wait() method is called on the thread and it is
    // waiting for another thread to call notify() or notifyAll() method on the same
    // object.
    // 6. Timed Waiting: when a thread is waiting for another thread to perform a
    // particular action for a specified amount of time.
    // 7. Terminated/Dead: when a thread has completed its execution.

    Thread t1 = new Thread(() -> {
      System.out.println("Thread is running...");
    });

    System.out.println("Thread state: " + t1.getState()); // New
    t1.start();
    System.out.println("Thread state: " + t1.getState()); // Runnable or Running
    try {
      t1.join(); // wait for the thread to finish
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread state: " + t1.getState()); // Terminated
  }
}