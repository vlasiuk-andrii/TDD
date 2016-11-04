import org.junit.Assert;
import org.junit.Test;

public class WordWrapTest {
    WordWrap wordWrap = new WordWrap();
    @Test
    public void wordWrapTest(){
        Assert.assertEquals("", wordWrap.wrapText("", 1));
        Assert.assertEquals("x", wordWrap.wrapText("x", 1));
        Assert.assertEquals("x\nx", wordWrap.wrapText("xx", 1));
        Assert.assertEquals("x\nx\nx", wordWrap.wrapText("xxx", 1));
        Assert.assertEquals("x\nx", wordWrap.wrapText("x x", 1));
        Assert.assertEquals("x\nx", wordWrap.wrapText("x x", 2));
        Assert.assertEquals("x\nxx", wordWrap.wrapText("x xx", 3));
        Assert.assertEquals("a dog\nwith a\nbone fot\ncomplex\ntest\ncase", wordWrap.wrapText(
                            "a dog with a bone fot complex test case", 8));
    }
}
