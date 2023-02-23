package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        if (lengthOfLastNumber <=0) {
            System.out.println(0);
            return;
        }

        int t9 =9;
        int sum = t9;
        for (int counter =1; counter < lengthOfLastNumber; counter++) {
            t9 = (9*(int)Math.pow(10,counter))+t9;
            sum = sum + t9;
        }
        System.out.println(sum);

    }
}
