public class Ex2 {
    /*Создать метод, принимающий на вход число. В случае,
если число отрицательное, в методе должно быть брошено
проверяемое исключение. Если число больше 100, должно
быть брошено непроверяемое исключение. Создать свои ис-
ключения для данного примера.*/
    public static void main(String[] args) {
checksMethod(0);
checksMethod(-1);
checksMethod(101);
    }

    public static void checksMethod(int a) {
        try {
            if (a >= 0 && a <= 100)
                System.out.println(a);
            else if (a < 0)
                throw new MyNegativeException();
            else if (a > 100)
                throw new MyUncheckedException();
        }
             catch(MyNegativeException e){
                System.out.println("Ошибка, число отрицательное");
            }



    }
}
class MyNegativeException extends Exception{

}

class MyUncheckedException extends RuntimeException{

}