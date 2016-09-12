package uk.co.tekkies.TestingIntegrationMocks.tests;

import org.junit.Assert;
import org.junit.Test;
import uk.co.tekkies.TestingIntegrationMocks.Drawing;
import uk.co.tekkies.TestingIntegrationMocks.Shape;
import uk.co.tekkies.TestingIntegrationMocks.Triangle;

import static org.mockito.Mockito.mock;

public class DrawingTest {
    @Test
    public void testDrawingArea() {
        Shape mockedTriangle = mock(Triangle.class);
        TriangleTest.assertValid(mockedTriangle);

        Drawing drawing = new Drawing();
        drawing.add(mockedTriangle);

        float area = drawing.calculateArea();

        Assert.assertEquals(2.0, area, 0.0000001);
    }
}
