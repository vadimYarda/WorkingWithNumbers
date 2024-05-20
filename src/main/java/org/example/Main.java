package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int x : intList) {
            if (x > 0 && x % 2 == 0) {
                result.add(x);
            }
        }
        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = 1; j < result.size() - i -1; j++) {
                if (result.get(j) > result.get(j +1)) {
                    int tempVar = result.get(j +1);
                    result.set(j + 1, result.get(j));
                    result.set(j, tempVar);
                }
            }
        }
        System.out.println(result);
    }
}