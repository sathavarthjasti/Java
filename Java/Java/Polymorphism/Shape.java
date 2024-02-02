package Java.Polymorphism;

public interface Shape {

    public void calculateArea();

    public static void main(String[] args) {

        Shape r = new Rectangle();
        Shape t = new Triangle();
        Shape c = new Circle();
        r.calculateArea();
        t.calculateArea();
        c.calculateArea();


    }
}
