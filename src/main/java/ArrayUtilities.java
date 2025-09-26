import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayUtilities {

    // We will use this for searching tests
    // On already-sorted arrays
    // Content of thisIntArray[i] = i
    public static int[] genSortedArrayOfint(int inputsize) {
        int[] thisIntArray = new int[inputsize];
        // TODO: Fill the array with thisIntArray[i] = i
        for (int i = 0; i < inputsize; i++){
            thisIntArray[i] = i;
        }
        return thisIntArray;
    }

    // TODO: generate the unsorted (shuffled) array of int
    // Use previous method (genSortedArrayOfint)
    // Then shuffle using shuffleFisherYates below
    public static int[] genUnsortedArrayOfint(int inputsize, Random rnd) {
        int[] arrayOfInt = genSortedArrayOfint(inputsize);
        // TODO: Shuffle the arrayOfInt that we know is already sorted
        shuffleFisherYates(arrayOfInt, rnd);
        // Use shuffleFisherYates or shuffleintArrayNativeJava
        // If you use shuffleintArrayNativeJava must complete
        // that To-Do first

        return arrayOfInt;
    }

    // TODO: Generate sequential int arrays (non-overlapping values)
    // This method generates double arrays like the following:
    // [0 1 2 3 4]
    // [5 6 7 8 9]
    // [10 11 12 13 14]
    // Those methods needed to run the
    // three-way disjoint example in Chapter 4
    public static int[][] generateSequentialIntArrays(int numarrays, int size) {
        int[][] array = new int[numarrays][size];
        // TODO: Add code to fill the arrays with the appropriate values
        for(int i = 0; i < numarrays; i++){
            for(int j = 0; j < size; j++){
                array[i][j] = i * size +j;
            }
        }
        // Read above
        return array;
    }

    // We will need this for future timing tests on sorting
    // This method generates double arrays like the following:
    // [3 1 2 4 0]
    // [1 0 3 2 4]
    // [4 1 3 0 2]
    public static int[][] generateMultipleShuffledArrays(int numarrays, int size, Random rnd) {
        int[][] array = new int[numarrays][size];
        for (int i = 0; i < numarrays; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = j;
            }
            // Now shuffle the ith array
            shuffleintArrayNativeJava(array[i], rnd);
        }
        return array;
    }

    // AI-generated
    // "Fisher-Yates algorithm for scramble with forward walkthrough"
    // Essentially equivalent to Java Collections.shuffle
    // edited to require input random
    public static void shuffleFisherYates(int[] array, Random rnd) {
        for (int i = 0; i < array.length; i++) {
            int j = rnd.nextInt(i + 1); // 0 ≤ j ≤ i
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // TODO: use the java-provided Collections.shuffle routine to
    // shuffle the array - convert to a list
    // Convert array to list, perform shuffle, convert back to array
    // This is functionally equivalent to Fisher-Yates above
    public static void shuffleintArrayNativeJava(int[] intArray, Random rnd) {
        // Step 1: convert primitive to boxed array (of objects)
        Integer[] boxedArray = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            boxedArray[i] = intArray[i]; // Autoboxing
        }
        // Convert the boxed array to a List (implements Java collections)
        List<Integer> intList = Arrays.asList(boxedArray);
        // Shuffle the list
        // TODO: Collections.shuffle here - don't overthink
        Collections.shuffle(intList, rnd);

        // Don't forget this requires the random number variable

        // Convert back to an array of Integer objects
        boxedArray = intList.toArray(new Integer[0]);
        // Convert the Integer array to int array
        for (int i = 0; i < boxedArray.length; i++) {
            intArray[i] = boxedArray[i]; // Unboxing occurs here
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        //rnd.setSeed(12345);
        int arraySize = 10;
        int[] ourArrayOfint = genSortedArrayOfint(arraySize);
        System.out.println("Generate Sorted Array of int example: ");
        System.out.println(Arrays.toString(ourArrayOfint));

        // Now randomize it (example)
        shuffleFisherYates(ourArrayOfint, rnd);
        System.out.println("\nGenerate unsorted Array of int example (Fisher-Yates): ");
        System.out.println(Arrays.toString(ourArrayOfint));

        // Now generate the unsorted version
        int[] ourArrayOfInt2 = genUnsortedArrayOfint(arraySize, rnd);
        System.out.println("\nGenerate unsorted Array of Int example (Java shuffle native method): ");
        System.out.println(Arrays.toString(ourArrayOfInt2));

        // Now generate the multi-array disjoint example
        int numarrays = 3;
        int size = 5;
        int[][] ourSequentialArrayint = generateSequentialIntArrays(numarrays, size);
        System.out.println("\nMulti-array disjoint example: ");
        for (int i = 0; i < numarrays; i++) {
            System.out.println(Arrays.toString(ourSequentialArrayint[i]));
        }

        // Generate multiple shuffled arrays
        numarrays = 3;
        size = 5;
        int[][] ourShuffledArrayint = generateMultipleShuffledArrays(numarrays, size, rnd);
        System.out.println("\nMulti-array unsorted example: ");
        for (int i = 0; i < numarrays; i++) {
            System.out.println(Arrays.toString(ourShuffledArrayint[i]));
        }
    }
}

