import org.junit.Assert;
import org.junit.Test;

public class HarryPotterTest {
    HarryPotter harry = new HarryPotter();
    @Test
    public void countSummTest(){
        int a1[] = {0,0,0,0,0};
        Assert.assertEquals(0.0, harry.count(a1),0);
        int a2[] = {0,1,0,0,0};
        Assert.assertEquals(8.0, harry.count(a2),0);
        int a3[] = {0,2,0,0,0};
        Assert.assertEquals(16.0, harry.count(a3),0);
        int a4[] = {1,1,0,0,0};
        Assert.assertEquals(15.2, harry.count(a4),0);
    }
}