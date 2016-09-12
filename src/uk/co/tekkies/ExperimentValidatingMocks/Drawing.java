package uk.co.tekkies.ExperimentValidatingMocks;

import java.util.ArrayList;

public class Drawing {
    ArrayList<Shape> shapes;

    public Drawing() {
        this.shapes = new ArrayList<>();
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public float calculateArea() {
        float area = 0;
        for (Shape shape : shapes ) {
            area += shape.calculateArea();
        }
        return area;
    }
}
