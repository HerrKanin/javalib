package com.example.gitdemo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbersRetrunSum(){
        int result = Calculator.add(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void addThreeNumbersReturSum() {
        int result = Calculator.add(1, 2, 3);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void addMultipleNUmbersReturnSum(){
        int result = Calculator.add(1,2,3,4);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void noParamsReturnZero(){
        int result = Calculator.add();
        assertThat(result).isEqualTo(0);
    }
}

