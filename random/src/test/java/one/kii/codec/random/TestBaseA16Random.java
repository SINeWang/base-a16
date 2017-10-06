package one.kii.codec.random;

import one.kiii.codec.random.BaseA16Random;
import org.junit.Assert;
import org.junit.Test;

public class TestBaseA16Random {

    @Test
    public void testNext4() {
        BaseA16Random random = new BaseA16Random();
        String s = random.next4();
        Assert.assertEquals(4, s.length());
    }
}
