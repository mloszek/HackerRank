package ThirdyDaysOfCode.Day17;

public class Calculator {

    public int power(int n, int p) throws Exception {

        boolean isNegative = ((n < 0) || (p < 0));

        if (isNegative)
            throw new Exception("n and p should be non-negative");
        else
            return (int) Math.pow(n, p);
    }
}
