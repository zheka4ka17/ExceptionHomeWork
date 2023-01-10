public class Ex3 {
    /*Создать класс, объекты которого будут неизменяемыми.
Класс инкапсулирует в себе информацию о треугольнике на
плоскости (длины каждой из его ребер). Длины сторон за-
даются в конструкторе. Если по заданным сторонам нельзя
построить треугольник, в конструктор должно бросаться
исключение.*/
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,1,4);
        System.out.println(triangle.getA());
        System.out.println(triangle.getB());
        System.out.println(triangle.getC());

        System.out.println();


        Triangle triangle2 = new Triangle(4,3,6);
        System.out.println(triangle2.getA());
        System.out.println(triangle2.getB());
        System.out.println(triangle2.getC());

    }
}

final class  Triangle {
    Triangle triangle= null;
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public  Triangle(int a, int b, int c) {
        try {
            if((((a + b) <= c) || ((a + c) <= b) || ((c + b) <= a)) && (a>0 && b>0 && c>0))
                throw new CantToBuildTriangleException();
            else {
                this.a = a;
                this.b = b;
                this.c = c;
                System.out.println("Треугольник успешно построен!");
            }
        } catch (CantToBuildTriangleException e) {
            System.out.printf("Невозможно постороить треугольник из отрезков такой длины: %d , %d , %d", a ,b,c);
            System.out.println();

        }


    }
}


class CantToBuildTriangleException extends Exception{

}