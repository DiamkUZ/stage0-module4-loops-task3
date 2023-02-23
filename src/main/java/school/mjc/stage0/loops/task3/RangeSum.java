package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int resultSum =0;
        for (int counter = firstBoarder; counter <= secondBoarder; counter++) {
            resultSum = resultSum + counter;
        }
        System.out.println(resultSum);

    }
}
