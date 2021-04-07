package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class TestMax {


    @Test
    public  void givenThreeinteger_whenMaxNumberAtFirstposition_shouldReturnFirstnumber() {
        Maxfinder maxfinder = new Maxfinder();
        Integer result = maxfinder.maxValuefinder(30, 20, 10);
        Assert.assertEquals(Integer.valueOf(30), result);
    }

    @Test
    public  void givenThreeinteger_whenMaxNumberAtSecondposition_shouldReturnSecondnumber() {
        Maxfinder maxfinder = new Maxfinder();
        Integer result = maxfinder.maxValuefinder(20, 30, 10);
        Assert.assertEquals(Integer.valueOf(30), result);
    }

    @Test
    public  void givenThreeinteger_whenMaxNumberAtThirdposition_shouldReturnThirdnumber() {
        Maxfinder maxfinder = new Maxfinder();
        Integer result = maxfinder.maxValuefinder(20, 10, 30);
        Assert.assertEquals(Integer.valueOf(30), result);
    }

    @Test
    public  void givenThreefloatVal_whenMaxNumberAtFirstposition_shouldReturnFirstnumber() {
        Maxfinder maxfinder = new Maxfinder();
        Float result = maxfinder.maxValuefinder(30.0f, 10.0f, 20.0f);
        Assert.assertEquals(Float.valueOf(30.0f), result);
    }

    @Test
    public  void givenThreefloatVal_whenMaxNumberAtSecondposition_shouldReturnSecondnumber() {
        Maxfinder maxfinder = new Maxfinder();
        Float result = maxfinder.maxValuefinder(20.0f, 30.0f, 20.0f);
        Assert.assertEquals(Float.valueOf(30.0f), result);
    }

    @Test
    public  void givenThreefloatVal_whenMaxNumberAtThirdposition_shouldReturnThirdnumber() {
        Maxfinder maxfinder = new Maxfinder();
        Float result = maxfinder.maxValuefinder(20.0f, 10.0f, 30.0f);
        Assert.assertEquals(Float.valueOf(30.0f), result);
    }

    @Test
    public  void givenThreestringVal_whenMaxStringAtFirstposition_shouldReturnFirstnumber() {
        Maxfinder maxfinder = new Maxfinder();
        String result = maxfinder.maxValuefinder("Peach", "Banana", "Apple");
        Assert.assertEquals(String.valueOf("Peach"), result);
    }

    @Test
    public  void givenThreestringVal_whenMaxStringAtSecondposition_shouldReturnSecondnumber() {
        Maxfinder maxfinder = new Maxfinder();
        String result = maxfinder.maxValuefinder("Banana", "Peach", "Apple");
        Assert.assertEquals(String.valueOf("Peach"), result);
    }

    @Test
    public  void givenThreestringVal_whenMaxStringAtThirdposition_shouldReturnThirdnumber() {
        Maxfinder maxfinder = new Maxfinder();
        String result = maxfinder.maxValuefinder("Apple", "Banana", "Peach");
        Assert.assertEquals(String.valueOf("Peach"), result);
    }
}
