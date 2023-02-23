package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        System.out.println(first);
        int second = 1;
        System.out.println(second);

        int result = 0;
        for (int i = 1; i < lastFibonacci-1; i++) {
            result = first + second;
            first = second;
            second = result;
            System.out.println(result);
        }
    }
}
