package org.krynicki;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by K on 03.07.2017.
 */
public class PrimePalindromesTest {

    @Test
    public void testDeclarative() {
        Assert.assertEquals(PrimePalindromes.find(PrimePalindromes.MAX_VAL), 159323951);
    }

    @Test
    public void testFunctional() {
        Assert.assertEquals(PrimePalindromes.findFunctional(PrimePalindromes.MAX_VAL), 159323951);
    }
}