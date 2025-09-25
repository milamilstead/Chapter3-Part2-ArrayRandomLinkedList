import java.util.Random;

public class RandomNumberUtilities {

    // Return random number
    public static double genRandomDouble0to1(Random rand) {
        double randDouble0to1 = rand.nextDouble();
        return randDouble0to1;
    }

    // TODO: generate a random number between lower and upper inclusive
    // Use the nextInt method within the object random (provided by the
    // Random class)
    public static int genRandomIntInclusive(int lower, int upper, Random random) {
        int randomIntLowertoUpper = 52;
        randomIntLowertoUpper = random.nextInt(upper - lower + 1) + lower;
        return randomIntLowertoUpper;
    }

    public static String getRandomCard(Random rnd) {
        // from array utilities - you wrote it
        int mycardnumber = genRandomIntInclusive(1, 52, rnd);
        // Return a String named myCard corresponding to dealt card
        String myCard = IntegerToCardTranslator.getCard(mycardnumber);
        String returnString = (mycardnumber + ": " + myCard);
        return returnString;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        rnd.setSeed(12345);

        // First generate random number 0 inclusive to 1 exclusive

        String playingCard = getRandomCard(rnd);
        System.out.println ("Your card is: " + playingCard);
    }
}