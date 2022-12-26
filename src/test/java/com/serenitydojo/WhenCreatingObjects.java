package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void dog_makes_noise() {
        Dog bruno = new Dog("Bruno", "Bone", 6);
        Assert.assertEquals(bruno.makeNoise(), "Woof");
    }

    @Test
    public void dog_feeds() {
        Dog jack = new Dog("Jack", "Ball", 2);
        Assert.assertFalse(jack.getIsFed());
        jack.feed();
        Assert.assertTrue(jack.getIsFed());
    }
}
