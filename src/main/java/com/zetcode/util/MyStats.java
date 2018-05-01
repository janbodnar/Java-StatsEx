package com.zetcode;

import java.util.List;

public class MyStats {


    public static int max(List<Integer> vals) {

        int max = vals.stream().max(Integer::compare).get();
        return max;
    }

    public static int min(List<Integer> vals) {

        int min = vals.stream().min(Integer::compare).get();
        return min;
    }


}
