package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i < 2) {
            return 1;
        } else {
            return i;
        }
    }
}
