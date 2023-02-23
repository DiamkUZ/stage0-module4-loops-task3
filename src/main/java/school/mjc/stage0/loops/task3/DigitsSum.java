package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;

        if (t<0){
            t *=-1;
        }

        for(int a=t; a>0; a/=10) {
            sum = sum + (a % 10);
        }
        System.out.println(sum);


    }
}
