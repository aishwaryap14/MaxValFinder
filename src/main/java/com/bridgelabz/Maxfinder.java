package com.bridgelabz;

import java.util.Arrays;
import java.util.Comparator;

public class Maxfinder {

    
    public <E extends Comparable> E maxValuefinder(E... values)
    {
        E max = Arrays.stream(values).max((i, j)-> i.compareTo(j)).get();
        toPrintMaxvalue(max);
        return max;
    }

    public <E extends Comparable> void toPrintMaxvalue(E max)
    {
        System.out.println(max);
    }


}
