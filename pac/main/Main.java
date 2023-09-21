package pac.main;


public class Main {
    public static void main(String[] args) throws  MyArraySizeException{
        String[][] array1 = {{"1","1","1","1"}, // корректный массив
                            {"1","1","1","1"},
                            {"1","1","1","1"},
                            {"1","1","1","1"}};

        String[][] array2 = {{"1","1","1","1"}, // массив неверной размерности
                            {"1","1","1","1"}};

        String[][] array3 = {{"1","1","1","A"}, // массив, содержащий букву вместо цифры в ячейке  - 0-3
                            {"1","1","1","1"},
                            {"1","1","1","1"},
                            {"1","1","1","1"}};

        checkArray(array1); // Сумма всех элементов массива: 16
        checkArray(array2); // Неверный размер массива. Размер массива должен быть 4 на 4
        checkArray(array3); // Ошибка формата. В ячейке с индексом 0 - 3 лежит неверное значение
        System.out.println("End");
    }

    public static void checkArray(String [][] array) throws  MyArraySizeException{
        if (array.length != 4 || array[0].length != 4) {
                throw new MyArraySizeException();

        } else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    try {
                        Integer.parseInt(array[i][j]);
                        sum ++;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            System.out.println("Сумма всех элементов массива: " + sum);
        }
    }
}