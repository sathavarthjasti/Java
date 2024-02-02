package Java.Polymorphism;

public class Rectangle implements Shape {

    Integer length = 5;
    Integer width = 5;
    Integer result;


    public void calculateArea(){

        result = length * width;
        System.out.println("Area of the Rectangle is "+result);
    }
}
