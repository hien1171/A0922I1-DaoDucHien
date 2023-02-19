package fpt.abstrac_interface;

import java.util.Random;

public class ResizableCircle extends Circle implements Resizable{
    private double radius = 1.0;
    public ResizableCircle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public double resize( int percent) {
        this.radius+=this.radius*percent/100;
        return this.radius;

    }
}
