package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int result = 0;

        for (int counter = 1; counter <= Math.max(first, second); counter++) {
            if (first % counter == 0 && second % counter == 0) {
                result = counter;
            }
        }
        System.out.println(result);
    }
}
