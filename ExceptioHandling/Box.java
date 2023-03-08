package ExceptioHandling;

public class Box {

    double height, width, depth;

    Box() {
    }

   
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;

    }

    public void result() {
        double res = height * width * depth;
        System.out.println("Volume = " + res);
    }
}
