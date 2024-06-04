
import org.example.Factorial;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
public class test_Factorial {
    @org.junit.Test
    public void factorial_test()
    {
        // тест 1
        int x1 = 1;
        BigInteger result1 = Factorial.getFactorial(x1);
        BigInteger expected1 = BigInteger.valueOf(1);
        assertEquals(expected1, result1);
        // тест 2
        int x2 = 5;
        BigInteger result2 = Factorial.getFactorial(x2);
        BigInteger expected2 = BigInteger.valueOf(120);
        assertEquals(expected2, result2);
        // тест 3
        int x3 = 8;
        BigInteger result3 = Factorial.getFactorial(x3);
        BigInteger expected3 = BigInteger.valueOf(40320);
        assertEquals(expected3, result3);
        // тест 4
        int x4 = 10;
        BigInteger result4 = Factorial.getFactorial(x4);
        BigInteger expected4 = BigInteger.valueOf(3628800);
        assertEquals(expected4, result4);
        // тест 5
        int x5 = 12;
        BigInteger result5 = Factorial.getFactorial(x5);
        BigInteger expected5 = BigInteger.valueOf(479001600);
        assertEquals(expected5, result5);
    }
}
