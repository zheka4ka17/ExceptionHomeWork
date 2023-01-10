import java.io.IOException;
import java.util.Random;
/*2

Напишите код, который создает объекты данного класса
и вызывает метод halt. В случае, если в методе было брошено
RuntimeException, вывести в консоль halt; в противном слу-
чае – пробросить исключение наверх.*/
public class Ex5  {
    public static void main(String[] args) throws IOException {
        Runner runner = new Runner();
        try {
            try {
                runner.halt();
            } catch (IOException e) {
                throw new IOException();
            }
        } catch (RuntimeException e) {
            System.out.println("halt");
        }
    }
}


class Runner {
    private static final Random rnd = new Random();
    public void halt() throws IOException {
        if (rnd.nextBoolean()) {
            throw new RuntimeException ();
        }
        else {
            throw new IOException();
        }
    }
}