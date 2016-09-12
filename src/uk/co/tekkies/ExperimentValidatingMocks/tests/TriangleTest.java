package uk.co.tekkies.ExperimentValidatingMocks.tests;

import org.junit.Assert;
import org.junit.Test;
import uk.co.tekkies.ExperimentValidatingMocks.Shape;
import uk.co.tekkies.ExperimentValidatingMocks.Triangle;

public class TriangleTest {
    @Test
    public void areaIsCalculatedForTypicalTriangle() {
        //given
        Shape triangle = new Triangle(2, 2);

        //when
        float area = triangle.calculateArea();

        //then
        Assert.assertEquals(2.0, area, 0.0000001);
    }

    @Test
    public void areaIsNegativeForEmptyTriangle() {
        Shape triangle = new Triangle(0, 1);

        assertValidEmptyTriangle(triangle);
    }

    public static void assertValidEmptyTriangle(Shape triangle) {
        Assert.assertEquals(-1, triangle.calculateArea(), 0.001);
    }
}