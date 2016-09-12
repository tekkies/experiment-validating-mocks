package uk.co.tekkies.TestingIntegrationMocks;

import uk.co.tekkies.TestingIntegrationMocks.Shape;

public class Triangle implements Shape {
    private final int width;
    private final int height;

    public Triangle(int width, int height) {

        this.width = width;
        this.height = height;
    }

    @Override
    public float CalculateArea() {
        return width*height/2;
    }
}
