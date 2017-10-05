package one.kii.codec;

import one.kii.codec.base16.Decoder;
import one.kii.codec.base16.Encoder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class TestDecoder {


    @Test
    public void testDecodeRandom() {
        long l = new Random().nextInt(32);
        String s = Encoder.encode(l);
        Assert.assertEquals(l, Decoder.decode(s));
        System.out.println(s);
    }
}
