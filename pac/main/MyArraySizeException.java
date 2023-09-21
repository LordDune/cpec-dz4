package pac.main;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(){
        super("Неверный размер массива. Размер массива должен быть 4 на 4");
    }
}
