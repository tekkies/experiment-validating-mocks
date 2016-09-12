package uk.co.tekkies.TestingIntegrationMocks.tests;

import org.junit.Assert;
import org.junit.Test;
import uk.co.tekkies.TestingIntegrationMocks.Shape;
import uk.co.tekkies.TestingIntegrationMocks.Triangle;

public class TriangleTest {
    @Test
    public void testAreaCalculation() {
        Shape triangle = new Triangle(2,2);

        float area = triangle.calculateArea();

        assertValid(triangle);
        Assert.assertEquals(2.0, area, 0.0000001);
    }

    @Test
    public void testNullTriangle() {
        Shape triangle = new Triangle(0,1);

        float area = triangle.calculateArea();

        assertValid(triangle);
        Assert.assertEquals(-1, area, 0.0000001);
    }

    public static void assertValid(Shape triangle) {
        if(triangle.getWidth() == 0 || triangle.getHeight() == 0) {
            Assert.assertEquals(-1, triangle.calculateArea(), 0.001);
        } else {
            Assert.assertTrue(triangle.getWidth() > 0);
            Assert.assertTrue(triangle.getHeight() > 0);
            Assert.assertTrue(triangle.calculateArea() > 0);
        }
    }
}
