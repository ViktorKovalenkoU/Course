package oop.practice5;

public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {
      this.width = Math.max(0,width);
      this.height = Math.max(0,height);
    }

    public double getArea() {
        return this.width * this.height + 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(0,width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(0,height);
    }

}
