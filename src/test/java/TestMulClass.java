import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMulClass {
    @Test
    public void ThirdNg() {
        MultiClass mul=new MultiClass();
       float result= mul.getmul(44,5);
        Assert.assertEquals(220,result);



    }
}
