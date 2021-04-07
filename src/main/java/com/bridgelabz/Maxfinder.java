package com.bridgelabz;

import java.util.Arrays;
import java.util.Comparator;

public class Maxfinder {
    
    public <E extends Comparable> E maxValuefinder(E... values) {
        return Arrays.stream(values).max((i, j)-> i.compareTo(j)).get();

    }


}
