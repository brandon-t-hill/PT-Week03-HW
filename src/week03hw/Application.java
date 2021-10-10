package week03hw;

public class Application {

  public static int firstFromLast(int[] ages) {
    return ages[ages.length - 1] - ages[0];
  }

  // Step 1
  public static void iArrayStep() {
    // Create array of int called ages
    int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
    // Subtract first element from last element
    int temp = firstFromLast(ages);
    // Print to console
    System.out.println(temp);
    // Add new age and repeat
    int[] ages2 = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 58};
    temp = firstFromLast(ages2);
    System.out.println(temp);
    // Loop through and calculate average
    int total = 0;
    double average = 0;
    for (int i = 0; i < ages.length; i++) {
      total = total + ages[i];
      average = (double) total / (i + 1);
    }
    System.out.println("Average age: " + average);
  }

  // Steps 2, 5, and 6
  public static void sArrayStep() {
    // Create array of strings
    String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    String allNames = "";
    int total = 0;
    double average = 0;
    // Use a loop to iterate through the array and calculate the average number of letters per name
    for (String name : names) {
      total = total + name.length();
      // Use a loop to iterate through the array again and concatenate all the names together,
      // separated by spaces
      allNames = allNames + name + " ";
    }
    average = total / names.length;
    // Print Result to console
    System.out.println("Average name length: " + average);
    System.out.println(allNames);
    // Create a new array of int called nameLengths.
    int[] nameLengths = new int[names.length];
    // Write a loop to iterate over the previously created names array and add the length of each
    // name to the nameLengths array.
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }
    total = 0;
    // Write a loop to iterate over the nameLengths array and calculate the sum of all the elements
    // in the array.
    for (int n : nameLengths) {
      total = total + n;
    }
    // Print to console
    System.out.println(total);
  }

  /*
   * Step 7 Write a method that takes a String, word, and an int, n, as arguments and returns the
   * word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect
   * the method to return “HelloHelloHello”)
   */
  public static String multiCat(String word, int n) {
    String cat = "";
    for (int i = 0; i < n; i++) {
      cat = cat + word;
    }
    return cat;
  }

  /*
   * Step 8 Write a method that takes two Strings, firstName and lastName, and returns a full name
   * (the full name should be the first and the last name as a String separated by a space).
   */
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  /*
   * Step 9 Write a method that takes an array of int and returns true if the sum of all the ints in
   * the array is greater than 100
   */
  public static boolean isHundredPlus(int[] arr) {
    int total = 0;
    for (int n : arr) {
      total = total + n;
    }
    return total > 100;
  }

  /*
   * Step 10 Write a method that takes an array of double and returns the average of all the
   * elements in the array.
   */
  public static double dAverage(double[] arr) {
    double total = 0.0;
    double average = 0.0;

    for (double num : arr) {
      total = total + num;
    }
    average = total / arr.length;
    return average;
  }

  /*
   * Step 11 Write a method that takes two arrays of double and returns true if the average of the
   * elements in the first array is greater than the average of the elements in the second array.
   */
  public static boolean doubleTrouble(double[] arr1, double[] arr2) {
    double a1 = dAverage(arr1);
    double a2 = dAverage(arr2);

    return a1 > a2;
  }

  /*
   * Step 12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double
   * moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than
   * 10.50.
   */
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    final double DRINK_PRICE = 10.50;
    return (moneyInPocket >= DRINK_PRICE) && isHotOutside;
  }

  /*
   * Step 13 Create a method of your own that solves a problem. In comments, write what the method
   * does and why you created it.
   */
  //I wrote this method as a joke out of frustration. 
  //Phrasing a problem is important and if your students can't understand what you are asking for, they will struggle.
  //The Open Class module for Methods, Arrays, and Loops was very poorly worded on every question.
  public static boolean needsEditor(boolean hasWritingExperience) {
    return !hasWritingExperience;
  }

  public static void main(String[] args) {
    
    
    iArrayStep();
    sArrayStep();
    System.out.println(multiCat("Hello", 3));
    System.out.println(fullName("Brandon", "Hill"));
    //I apologize, but I am not making at least 3 unique arrays to show my code working. I just do not have the time.
    /*
     * System.out.println(isHundredPlus(intArray));
     * System.out.println(dAverage(doubleArray1));
     * System.out.println(doubleTrouble(doubleArray1, doubleArray2));
     * System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
     * System.out.println(needsEditor(hasWritingExperience));
     */
  }

}
