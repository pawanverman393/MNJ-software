class Main {
  public static void main(String[] args) {
      int[] arr = {1, 4, 7, 8, 4, 8, 1, 4, 9};
      
      int max = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;

      
      for (int num : arr) {
          if (num > max) {
              secondMax = max;
              max = num;
          } else if (num > secondMax && num != max) {
              secondMax = num;
          }
      }

     
      if (secondMax == Integer.MIN_VALUE) {
          System.out.println("No second largest element found.");
      } else {
          System.out.println("The second largest element is: " + secondMax);
      }
  }
}
