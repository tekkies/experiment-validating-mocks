package uk.co.tekkies.TestingIntegrationMocks;

public class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public float calculateArea() {
        return width * height;
    }
}
