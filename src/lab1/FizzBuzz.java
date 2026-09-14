package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 0;
        while (i <= 100) {
            System.out.println(doFizzBuzz(i));
            i++;
        }
    }

    private static String doFizzBuzz (int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            return "Fizz Buzz";
        } else if (divisibleBy3) {
            return "Fizz";
        } else if (divisibleBy5) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }
}
