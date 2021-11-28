package com.itmuch.contentcenter;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class TestMain {

    public static void main(String[] args) {
        String ruleDir = System.getProperty("user.home") + "/sentinel/rules";
        System.out.println(ruleDir);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);    // 55
        int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum);      // 55

        int sum3 = Arrays.stream(numbers).reduce(0, (a, b) -> a - b);   // -55
        int sum4 = Arrays.stream(numbers).reduce(1, (a, b) -> a * b);   // 0, initial is 0, 0 * whatever = 0
        int sum5 = Arrays.stream(numbers).reduce(0, (a, b) -> a / b);   // 0
        System.out.println(sum4);

    }
}
