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
}
