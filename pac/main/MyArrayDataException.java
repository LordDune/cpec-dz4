package pac.main;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j){
        super(String.format("Ошибка формата. В ячейке с индексом %d - %d лежит неверное значение", i,j));
    }
}
