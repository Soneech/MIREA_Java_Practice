package practice3.tasks123;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // вызовется переопределённый метод toString класса Circle
        System.out.println(s1.getArea()); // вызовется переопределённый в классе Circle абстрактный метод
        System.out.println(s1.getPerimeter()); // вызовется переопределённый в классе Circle абстрактный метод
        System.out.println(s1.getColor());  // вызовется метод родительского класса Shape
        System.out.println(s1.isFilled());  // вызовется метод родительского класса Shape

        // System.out.println(s1.getRadius());  // ошибка
        // т.к. при апкастинге - привидении дочернего объекта к родительскому типу - мы можем использовать
        //только переопределённые методы родительского класса в дочернем

        System.out.println("---------------------------------------");

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);  // вызовется переопределённый метод toString класса Circle
        System.out.println(c1.getArea());  // вызовется переопределённый в классе Circle абстрактный метод
        System.out.println(c1.getPerimeter());  // вызовется переопределённый в классе Circle абстрактный метод
        System.out.println(c1.getColor());  // вызовется метод родительского класса Shape
        System.out.println(c1.isFilled());  // вызовется метод родительского класса Shape
        System.out.println(c1.getRadius());  // вызовется метод класса Circle

        System.out.println("---------------------------------------");

        //Shape s2 = new Shape();  // ошибка. Нельзя создать экземпляр абстрактного клксса
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);  // вызовется переопределённый метод toString класса Rectangle
        System.out.println(s3.getArea());  // вызовется метод класса Rectangle
        System.out.println(s3.getPerimeter());  // вызовется метод класса Rectangle
        System.out.println(s3.getColor());  // вызовется метод родительского класса Shape
        //System.out.println(s3.getLength());  //ошибка. Аналогично с 1ым примером

        System.out.println("---------------------------------------");

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);  // вызовется переопределённый метод toString класса Rectangle
        System.out.println(r1.getArea());  // вызовется метод класса Rectangle
        System.out.println(r1.getColor());  // вызовется метод родительского класса Shape
        System.out.println(r1.getLength());  // вызовется метод класса Rectangle

        System.out.println("---------------------------------------");

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);  // вызовется метод класса Square
        System.out.println(s4.getArea());  // вызовется метод родительского класса Rectangle
        System.out.println(s4.getColor());  // вызовется метод родительского класса Shape
        //System.out.println(s4.getSide());  // ошибка. Аналогично с 1 и 3 примерами

        System.out.println("---------------------------------------");

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);  // вызовется метод класса Square
        System.out.println(r2.getArea());  // вызовется метод класса Rectangle
        System.out.println(r2.getColor());  // вызовется метод родительского класса Shape
        //System.out.println(r2.getSide()); //ошибка. Аналогично с 1, 3, 5 примерами
        System.out.println(r2.getLength());  // вызовется метод класса Rectangle

        System.out.println("---------------------------------------");

        Square sq1 = (Square)r2;  // Downcast Rectangle r2 to Square
        System.out.println(sq1);  // вызовется метод класса Square
        System.out.println(sq1.getArea());  // вызовется метод класса Rectangle
        System.out.println(sq1.getColor());  // вызовется метод родительского класса Shape
        System.out.println(sq1.getSide());  // вызовется метод класса Square
        System.out.println(sq1.getLength());  // вызовется метод класса Rectangle
    }
}
