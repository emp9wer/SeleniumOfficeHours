package src.day28_Encapsulation.square;

public class TestSquare {
    public static void main(String[] args) {


        Square s1 = new Square(7);

        System.out.println(s1.calcArea());
        System.out.println(s1.calcPerimeter());
        System.out.println(s1.getSide());
        System.out.println(s1);


    }

}
