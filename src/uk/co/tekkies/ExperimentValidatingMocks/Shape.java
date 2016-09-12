package uk.co.tekkies.ExperimentValidatingMocks;


public abstract class Shape {
    protected final int width;
    protected final int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract float calculateArea();

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
