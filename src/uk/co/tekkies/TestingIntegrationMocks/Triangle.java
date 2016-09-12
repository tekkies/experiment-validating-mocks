package uk.co.tekkies.TestingIntegrationMocks;

import uk.co.tekkies.TestingIntegrationMocks.Shape;

public class Triangle extends Shape {


    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public float calculateArea() {
        float area;
        if(height == 0 | width == 0) {
            area = -1;
        } else {
            area = width*height/2;
        }
        return area;
    }
}
