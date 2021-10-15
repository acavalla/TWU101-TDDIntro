package com.thoughtworks.tddintro.exercises.factorial;

import java.util.Objects;

public class Factorial {
    public Integer compute(int i) {
        if (Objects.equals(i, 1)) {
            return 1;
        } else {
            return i;
        }
    }
}
