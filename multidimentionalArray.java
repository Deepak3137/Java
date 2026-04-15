class multidimentionalArray {
  public static void main() {
    int arr [][] = new int [2][3];

    for(int i=0; i<2; i++) {
      for(int j=0; j<3; j++) {
        arr[i][j] = (int)(Math.random() * 10);
      }
    }

    for(int i=0; i<2; i++) {
      for(int j=0; j<3; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    //enhanced for loop;

    for(int p[] : arr) {
      for (int num: p) {
        System.out.print(num + " ");
      }
      System.out.println();
    }


    // jagged array where the j is not fixed;
    System.out.println("Now the jagged array.");

    int jagged [][] = new int [3][];

    for(int i=0; i<3; i++) {
      jagged[i] = new int [i+2];
    }

    for(int i=0; i<jagged.length; i++) {
      for(int j=0; j<jagged[i].length; j++) {
        jagged[i][j] = (int)(Math.random() * 10);
      }
    }

    for(int p[] : jagged) {
      for (int num: p) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}