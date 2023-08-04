package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        String numLength = Integer.toString(number);
        int i;
        for (i=0; i <= numLength.length(); i++) {
            sum += i;
;        }
        System.out.println(sum);
    }
}
