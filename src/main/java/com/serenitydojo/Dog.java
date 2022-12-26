package com.serenitydojo;

public class Dog {
    private final String name;
    private final String favoriteToy;
    private final int age;
    private boolean isFed;

    static String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.isFed = false;
    }

    public String getName() {
        return name;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    public int getAge() {
        return age;
    }
    public String makeNoise() {
        return DOG_NOISE;
    }
    public boolean getIsFed() {
        return isFed;
    }
    public void feed() {
        isFed = true;
    }

}

