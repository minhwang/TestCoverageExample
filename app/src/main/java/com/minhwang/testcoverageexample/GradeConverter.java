package com.minhwang.testcoverageexample;

/**
 * Created by min.hwang on 2016. 6. 20..
 */
public class GradeConverter {
    public String convert(int score) {
        if (score < 80) { return "C"; }
        if (score < 90) { return "B"; }
        return "A";
    }
}
