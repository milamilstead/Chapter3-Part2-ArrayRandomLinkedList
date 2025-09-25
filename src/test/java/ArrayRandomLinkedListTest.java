import org.desu.answermap.AnswerMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class ArrayRandomLinkedListTest {

    // Part 1
    @Test
    void test1() {
        int[] ourArrayOfint = ArrayUtilities.genSortedArrayOfint(10);
        System.out.println("Generate Sorted Array of int example: ");
        String testArrayOutputString = Arrays.toString(ourArrayOfint);
        System.out.println("Sorted array example is: " + testArrayOutputString);
        Assertions.assertEquals
                ("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", testArrayOutputString);
    }

    @Testx
    void test2() {
        int[] ourArrayOfint = ArrayUtilities.genSortedArrayOfint(10);
        System.out.println("Generate Sorted Array of int example: ");
        String testArrayOutputString = Arrays.toString(ourArrayOfint);
        System.out.println("Sorted array example is: " + testArrayOutputString);
        Random rnd = new Random();
        rnd.setSeed(12345);
        ArrayUtilities.shuffleFisherYates(ourArrayOfint, rnd);
        System.out.println("\nGenerate unsorted Array of int example (Fisher-Yates): ");
        testArrayOutputString = Arrays.toString(ourArrayOfint);
        System.out.println("Sorted array example is: " + testArrayOutputString);
        System.out.println(Arrays.toString(ourArrayOfint));
        Assertions.assertEquals(
                "[7, 1, 6, 3, 5, 2, 0, 8, 4, 9]", testArrayOutputString);
    }

    @Test
    void test3() {
        int numarrays = 3;
        int size = 5;
        int[][] ourSequentialArrayint =
                ArrayUtilities.generateSequentialIntArrays(numarrays, size);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numarrays; i++) {
            sb.append(Arrays.toString(ourSequentialArrayint[i]));
            if (i < numarrays - 1) {
                sb.append('\n');
            }
        }
        String arrayString = sb.toString();
        //System.out.println(Arrays.toString(ourSequentialArrayint[i]));
        System.out.println("arrayString is: ");
        System.out.println(arrayString);
        // Test here
        AnswerMap SB2AnswerMap = new AnswerMap();
        String answer1 = SB2AnswerMap.map.get("Answer1");
        System.out.println("Expected answer is: ");
        System.out.println(answer1);
        Assertions.assertEquals(answer1, arrayString);
    }

    @Test
    void test4() {
        int[] ourArrayOfint = ArrayUtilities.genSortedArrayOfint(10);
        Random rnd = new Random();
        rnd.setSeed(12345);
        ArrayUtilities.shuffleintArrayNativeJava(ourArrayOfint, rnd);
        System.out.println("ourArrayOfInt is: ");
        String ourArrayOfIntString = Arrays.toString(ourArrayOfint);
        System.out.println(ourArrayOfIntString);
        Assertions.assertEquals(
                "[3, 2, 0, 5, 8, 9, 6, 7, 4, 1]", ourArrayOfIntString);
    }

    @Test
    void test5() {
        Random rnd = new Random();
        rnd.setSeed(12345);
        // First generate random number 0 inclusive to 1 exclusive
        String playingCard = RandomNumberUtilities.getRandomCard(rnd);
        System.out.println("Your card is: " + playingCard);
        Assertions.assertEquals("36: 10 of Clubs", playingCard);
    }

    @Test
    void test6() {
        String portfolioString =
                TestDoublyLinkedListsBook.buildExamplePortfolioDoublyLinkedList();
        System.out.println("\nEntire Portfolio after removal of list elements:");
        System.out.println(portfolioString);
        AnswerMap SB2AnswerMap = new AnswerMap();
        String answer2 = SB2AnswerMap.map.get("Answer2");
        System.out.println("Expected answer is: ");
        System.out.println(answer2);
        Assertions.assertEquals(answer2, portfolioString);
    }

    @Test
    void test7() {
        String portfolioString =
                TestDoublyLinkedListsJava.buildExamplePortfolioDoublyLinkedList();
        System.out.println("\nEntire Portfolio after removal of list elements:");
        System.out.println(portfolioString);
        AnswerMap SB2AnswerMap = new AnswerMap();
        String answer2 = SB2AnswerMap.map.get("Answer2");
        System.out.println("Expected answer is: ");
        System.out.println(answer2);
        Assertions.assertEquals(answer2, portfolioString);
    }

}
