package src.day17_ClassAndObject;

public class Rectangle {

    public double length;
    public double width;


    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double calculateArea(){
       return length*width;
    }


    public double calculatePerimeter(){
        return (length+width)*2;
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area="+
                calculateArea() +", perimeter="+ calculatePerimeter()+
                '}';
    }
}
