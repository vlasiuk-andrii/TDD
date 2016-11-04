import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void fizzBuzzOne(){
        Assert.assertEquals("1",fizzBuzz.convert(1));
    }

    @Test
    public void fizzBuzzTwo(){
        Assert.assertEquals("2",fizzBuzz.convert(2));
    }

    @Test
    public void fizzBuzzThree(){
        Assert.assertEquals("Fizz",fizzBuzz.convert(3));
    }

    @Test
    public void fizzBuzzFour(){
        Assert.assertEquals("4",fizzBuzz.convert(4));
    }

    @Test
    public void fizzBuzzFive(){
        Assert.assertEquals("Buzz",fizzBuzz.convert(5));
    }

    @Test
    public void fizzBuzzSix(){
        Assert.assertEquals("Fizz",fizzBuzz.convert(6));
    }

    @Test
    public void fizzBuzzSeven(){
        Assert.assertEquals("7",fizzBuzz.convert(7));
    }

    @Test
    public void fizzBuzzEight(){
        Assert.assertEquals("8",fizzBuzz.convert(8));
    }

    @Test
    public void fizzBuzzNine(){
        Assert.assertEquals("Fizz",fizzBuzz.convert(9));
    }

    @Test
    public void fizzBuzz(){
        Assert.assertEquals("FizzBuzz",fizzBuzz.convert(30));
    }
}
