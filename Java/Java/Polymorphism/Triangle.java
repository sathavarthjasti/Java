package Java.Polymorphism;

public class Triangle implements Shape{

    Integer base = 10;
    Integer height = 10;

    double result;

    public void calculateArea(){

        result = 0.5 * base * height;
        System.out.println("Area of the Triangle is "+result);

    }
}
