public class OddEvenSum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        int number = LOWERBOUND;

        while(number<=UPPERBOUND) {
            if(number % 2 == 0) { // Even number
                sumEven += number;
            } else {
                sumOdd += number; // Odd number
            }
            ++number;
        }

        if(sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        // absDiff = (sumOdd>sumEven) ? sumOdd - sumEven : sumEven - sumOdd; // Tek satırda örneği
        System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
        System.out.println("The sum of even numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven);
        System.out.println("The absolute difference between the two sums is: " + absDiff);
    }
}