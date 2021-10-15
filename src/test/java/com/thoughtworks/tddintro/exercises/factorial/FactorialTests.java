package com.thoughtworks.tddintro.exercises.factorial;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTests {

    private final Factorial factorial = new Factorial();

    @Test
    public void shouldReturnOneWhenNumberIsOne(){
        assertThat(new Factorial().compute(1), is(1));
    }

    @Test
    public void shouldReturnTwoWhenNumberIsTwo(){
        assertThat(factorial.compute(2), is(2));
    }

    @Test
    public void shouldReturnOneWhenNumberIsZero(){
        assertThat(factorial.compute(0), is(1));
    }

    @Test
    @Ignore // Remove each @Ignore to allow the test to run
    public void shouldReturnSixWhenNumberIsThree(){
        assertThat(factorial.compute(3), is(6));
    }

    @Test(expected = IllegalArgumentException.class)
    @Ignore // Remove each @Ignore to allow the test to run
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNegative(){
        factorial.compute(-1);
    }
}