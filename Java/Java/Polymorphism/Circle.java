package Java.Polymorphism;

public class Circle implements Shape{

    Integer radius = 5;
    double result;


    public void calculateArea() {

        result = Math.PI * (radius *radius);
        System.out.println("Area of the circle is "+result);


    }
}
