package one.kii.codec;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class TestBaseA16Decoder {


    @Test
    public void testDecodeRandom() {
        long l = new Random().nextInt(32);
        String s = BaseA16Encoder.encode(l);
        Assert.assertEquals(l, BaseA16Decoder.decode(s));
        System.out.println(s);
    }
}
