package oop.practice5;

public class WallArea {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("wall1 area= " + wall.getArea());

        Wall wall2 = new Wall(-1,-5);
        System.out.println("wall2 area= " + wall2.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
