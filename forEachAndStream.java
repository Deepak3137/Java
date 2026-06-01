import java.util.*;
import java.util.stream.Stream;

class forEachAndStream {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 5 };

    // for-each loop to iterate over the array
    for (int i : arr) {
      System.out.println(i);
    }

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

    // list.forEach(i -> System.out.println(i)); // using lambda expression to
    // iterate over the list

    Stream<Integer> s1 = list.stream(); // using stream to iterate over the list
    Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // using filter to get only even numbers from the list
    Stream<Integer> s3 = s2.map(n -> n * 2); // using map to multiply each element by 2
    int result = s3.reduce(0, (a, b) -> a + b); // using reduce to get the sum of all elements in the stream

    System.out.println(result); // 24 - the sum of all even numbers multiplied by 2 (2*2 + 4*2 + 6*2 = 4 + 8 +
                                // 12 = 24)

    // parallel stream to iterate over the list
    Stream<Integer> s4 = list.parallelStream(); // using parallel stream to iterate over the list
    Stream<Integer> s5 = s4.filter(n -> n % 2 == 0); // using filter to get only even numbers from the list
    Stream<Integer> s6 = s5.map(n -> n * 2); // using map to multiply each element by 2
    int result2 = s6.reduce(0, (a, b) -> a + b); // using reduce to get the sum of all elements in the stream
    System.out.println(result2); // 24 - the sum of all even numbers multiplied by 2 (2*2 + 4*2 + 6*2 = 4 + 8 +
                                 // 12 = 24)

    // both the sequential stream and parallel stream give the same result because
    // the operations performed on the stream are stateless and do not depend on the
    // order of the elements in the stream. however, the performance of the parallel
    // stream may be better than the sequential stream for large lists because it
    // can utilize multiple CPU cores to process the elements in parallel.

    // the diffrence between sequential stream and parallel stream is that
    // sequential stream processes the elements in a single thread, while parallel
    // stream processes the elements in multiple threads. sequential stream is
    // suitable for small lists or when the operations performed on the stream are
    // not computationally intensive, while parallel stream is suitable for large
    // lists or when the operations performed on the stream are computationally
    // intensive.

  }
}