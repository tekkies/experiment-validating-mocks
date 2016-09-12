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
    public void calculateAreaOfEmptyTriangle() {
        //given
        Shape emptyTriangle = mock(Triangle.class);
        when(emptyTriangle.calculateArea()).thenReturn((float)0.0);
        Drawing drawing = new Drawing();
        drawing.add(emptyTriangle);

        //Check that the mocked empty triangle behaves the same way as the
        //empty triangle that we unit tested
        TriangleTest.assertValidEmptyTriangle(emptyTriangle);

        //when
        float area = drawing.calculateArea();

        //then
        Assert.assertEquals(0.0, area, 0.001);
    }
}
