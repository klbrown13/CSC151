
Write a class AveragingNumbers with the following static methods

// The following method takes the original array, and
// uses Arrays.sort to create a new, sorted array.
// original is not modified in any way.
public static double[] loToHi(double[] original)

// The following method takes the original array, and
// returns a new array sorted starting with the highest number.
// The original array is not modified in any way.
// Hint: you can call loToHi to make life easier in this method.
public static double[] hiToLo(double[] original)

// The following method returns the average of the given array
public static double avg(double[] original)

// The main method
// 1: will create a double[] containing one million (1,000,000)
// elements. 
// 2: It will assign a random number between 0 and 1 to each element.
// 3: It will use the avg method to calculate the average of the array. Call this value averageRandom.
// 4: It will use loToHi to create a new sorted array of the same values,
// and calculate its average using avg. Call this value averageLoToHi.
// 5: It will use hiToLo to create a new array sorted from the highest
// value to the smallest, and calculate its average using avg. Call this value averageHiToLo.
// 6: It will print the three averages, one per line.
// 7: It will print whether the 3 averages are identical or not.
public static void main(String[] args)

Hint: Start with main, and write the program for a small array, say 5 elements.
First create and populate the array and print each element.
Then write and test each of main's steps in order, making sure each step works correctly before moving on to the next one. For example,
after you can create and populate the array, write step 3 of the main method. This will require writing the avg method. Don't worry
about a method until you need to use it in the main method. Don't write loToHi until you need it for main's step 4, and don't
write hiToLo until you need it for main's step 5.
Finally, change the array size to a million. Be aware that it may take a few seconds to run (if you're holding your breath).
