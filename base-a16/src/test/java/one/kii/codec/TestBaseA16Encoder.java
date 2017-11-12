package one.kii.codec;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class TestBaseA16Encoder {

    @Test
    public void testEncoderRandom() {
        long l = new Random().nextInt(65535);
        String s = BaseA16Encoder.encode(l);
        Assert.assertTrue(s.length() < 16);
    }

    @Test
    public void testEncoder() {
        long l = 2461084393822224385L;
        String s = BaseA16Encoder.encode(l);
        Assert.assertEquals(l, BaseA16Decoder.decode(s));
        System.out.println(s);
    }
}
