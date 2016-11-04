import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();
    @Test
    public void positiveNumbersTest(){
        Assert.assertEquals(0,stringCalculator.summ(""));
        Assert.assertEquals(1,stringCalculator.summ("1"));
        Assert.assertEquals(3,stringCalculator.summ("1,2"));
        Assert.assertEquals(62,stringCalculator.summ("1,2,4,55"));
        Assert.assertEquals(12,stringCalculator.summ("1,2,4\n5"));
        Assert.assertEquals(33,stringCalculator.summ("1,23,4\n5"));
        Assert.assertEquals(33,stringCalculator.summ("1,23,;4,\n5"));

    }

    @Test(expected = Exception.class)
    public void negativeNumberTest(){
        stringCalculator.summ("-5");
    }

}