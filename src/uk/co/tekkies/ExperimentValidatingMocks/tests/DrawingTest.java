package uk.co.tekkies.ExperimentValidatingMocks.tests;

import org.junit.Assert;
import org.junit.Test;
import uk.co.tekkies.ExperimentValidatingMocks.Drawing;
import uk.co.tekkies.ExperimentValidatingMocks.Shape;
import uk.co.tekkies.ExperimentValidatingMocks.Triangle;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DrawingTest {
    @Test
    public void testCalculateAreaOfDrawingShapes() {
        //Given
        Shape triangle = mock(Triangle.class);
        //Missing: when(triangle.calculateArea()).thenReturn((float)0.1);

        //Confirm the mock is legal before continuing the test
        TriangleTest.assertValidTriangle(triangle);

        Drawing drawing = new Drawing();
        drawing.add(triangle);

        //When
        float area = drawing.calculateArea();

        //Then
        Assert.assertTrue(area > 0.0);
    }
}
