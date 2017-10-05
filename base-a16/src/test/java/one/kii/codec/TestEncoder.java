package one.kii.codec;

import one.kii.codec.base16.Encoder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class TestEncoder {

    @Test
    public void testEncoder() {
        String s = Encoder.encode(999);
        Assert.assertEquals("ZK", s);
    }


    @Test
    public void testEncoderRandom() {
        long l = new Random().nextInt(65535);
        String s = Encoder.encode(l);
        Assert.assertTrue(s.length() < 16);
        System.out.println(s);
    }
}
