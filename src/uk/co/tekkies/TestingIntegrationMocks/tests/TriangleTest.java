package uk.co.tekkies.TestingIntegrationMocks.tests;

import org.junit.Assert;
import org.junit.Test;
import uk.co.tekkies.TestingIntegrationMocks.Shape;
import uk.co.tekkies.TestingIntegrationMocks.Triangle;

public class TriangleTest {
    @Test
    public void get22TrigngleArea() {
        Shape triangle = new Triangle(2,2);

        float area = triangle.CalculateArea();
        Assert.assertEquals(2.0, area, 0.0000001);
    }
}
