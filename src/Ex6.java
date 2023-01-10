import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Random;
/*Создайте метод, который принимает массив объектов
        данного класса, и вызывает у каждого объекта метод read.
        Если при исполнении будет брошено исключение File
        SystemAlreadyExistsException, поймать исключение и бро-
        сить исключение FileNotFoundException.*/

public class Ex6 {
    public static void main(String[] args) throws FileNotFoundException {
        XmlReader [] arr = {new XmlReader(),new XmlReader(),new XmlReader(),new XmlReader(),new XmlReader(),new XmlReader()};
        readArray(arr);


    }
     public static void readArray(XmlReader [] arr) throws FileNotFoundException {
        for (XmlReader a : arr) {
            try {
                a.read();
            } catch (FileSystemAlreadyExistsException e) {
                throw new FileNotFoundException();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
     }


}

class XmlReader {
    private static final Random rnd = new Random();
    public void read() throws IOException {
        switch (rnd.nextInt(3)) {
            case 1:
                throw new
                        NullPointerException();
            case 2:
                throw new Error();
            case 3:
                throw new
                        FileNotFoundException();
            default:
                throw new
                        FileSystemAlreadyExistsException();
        }
    }
}
