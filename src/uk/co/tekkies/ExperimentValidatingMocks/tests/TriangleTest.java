package uk.co.tekkies.ExperimentValidatingMocks.tests;

import org.junit.Assert;
import org.junit.Test;
import uk.co.tekkies.ExperimentValidatingMocks.Shape;
import uk.co.tekkies.ExperimentValidatingMocks.Triangle;

public class TriangleTest {
    @Test
    public void testCalculateArea() {
        //given
        Shape triangle = new Triangle(2, 2);

        //when
        float area = triangle.calculateArea();

        //then
        assertValidTriangle(triangle);
        Assert.assertEquals(2.0, area, 0.001);
    }

    public static void assertValidTriangle(Shape triangle) {
        Assert.assertTrue(triangle.calculateArea() > 0);
    }
}