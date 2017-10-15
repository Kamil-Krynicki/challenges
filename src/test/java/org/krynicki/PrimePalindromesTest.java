package org.krynicki;

import org.junit.Assert;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;

/**
 * Created by K on 03.07.2017.
 */
public class PrimePalindromesTest {

    @Test
    public void testDeclarative() {
        Assert.assertEquals(PrimePalindromes.find(PrimePalindromes.MAX_VAL), 159323951);
    }

    @Benchmark
    public void benchmarkDeclarative() {
        PrimePalindromes.find(PrimePalindromes.MAX_VAL);
    }


    @Test
    public void testFunctional() {
        Assert.assertEquals(PrimePalindromes.findFunctional(PrimePalindromes.MAX_VAL), 159323951);
    }
}