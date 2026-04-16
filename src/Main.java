import java.util.SortedMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        System.out.println("1) Целочисленный массив ");
        System.out.println("int[] integer = new int[]{1,2,3};");
        int[] integer = new int[]{1, 2, 3};//создал массив, использовал ключевое слово new

        System.out.println("2) Массив, в котором можно хранить три дробных числа");
        System.out.println("float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};");
        float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};//создал массив, сразу задав значения его ячеек

        System.out.println("3) Произвольный массив");
        System.out.println("char [] letters = {'А','В','С'};");
        char[] letters = {'А', 'В', 'С'};//создал произвольный массив - символьный

        //Задача №2
        System.out.println("Задача №2");
        //1 массив
        for (int i = 0; i < integer.length; i++) {
            System.out.print(integer[i]);//выводим значение i-го элемента массива.
            if (i < integer.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        //2 массив
        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.print(fractionalNumbers[i]);//выводим значение i-го элемента массива.
            if (i < fractionalNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        //3 массив
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);//выводим значение i-го элемента массива.
            if (i < letters.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        //Задача №3
        System.out.println("Задача №3");
        //1 массив
        for (int i = integer.length - 1; i >= 0; i--) {
            System.out.print(integer[i]);//выводим значение i-го элемента массива.
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        //2 массив
        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumbers[i]);//выводим значение i-го элемента массива.
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        //3 массив
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);//выводим значение i-го элемента массива.
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        //Задача №4
        System.out.println("Задача №4");
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 == 1) {
                integer[i] += 1;
            }
        }
        System.out.println(Arrays.toString(integer));

    }
}