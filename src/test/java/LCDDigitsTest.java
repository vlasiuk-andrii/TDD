import org.junit.Assert;
import org.junit.Test;

public class LCDDigitsTest {
    LCDDigits lcd = new LCDDigits();

    @Test
    public void getDigitsTest(){
        Assert.assertEquals("._.\n|.|\n|_|", lcd.printDigits(0));
        Assert.assertEquals("...\n..|\n..|", lcd.printDigits(1));
        Assert.assertEquals("._.\n._|\n|_.", lcd.printDigits(2));
        Assert.assertEquals("._.\n._|\n._|", lcd.printDigits(3));

        Assert.assertEquals("... ._.\n..| ._|\n..| |_.", lcd.printDigits(1,2));
        Assert.assertEquals("... ._.\n..| ._|\n..| |_.", lcd.printDigits(12));
        //Assert.assertEquals("._. ._.\n|.| ._|\n|_| ._|", lcd.printDigits(03));

    }

}