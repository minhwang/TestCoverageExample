package com.minhwang.testcoverageexample;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by min.hwang on 2016. 6. 20..
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class GradeConverterTest {
    @Test
    public void testWhenScoreIs90_thenShouldReturnA() {
        GradeConverter converter = new GradeConverter();
        String grade = converter.convert(90);

        Assert.assertEquals("A", grade);
    }

    @Test
    public void testWhenScoreIsGreaterThan90_thenShouldReturnA() {
        GradeConverter converter = new GradeConverter();
        String grade = converter.convert(2015);

        Assert.assertEquals("A", grade);
    }

    @Test
    public void testWhenScoreIsLessThan90_thenShouldReturnB() {
        GradeConverter converter = new GradeConverter();
        String grade = converter.convert(50);

        Assert.assertEquals("B", grade);
    }

    @Test
    public void testWhenScoreIsFrom80ToLessThan90_thenShouldReturnB() {
        GradeConverter converter = new GradeConverter();
        String grade = converter.convert(85);

        Assert.assertEquals("B", grade);
    }

    @Test
    public void testWhenScoreIsLessThan80_thenShouldReturnC() {
        GradeConverter converter = new GradeConverter();
        String grade = converter.convert(35);

        Assert.assertEquals("C", grade);
    }
}
