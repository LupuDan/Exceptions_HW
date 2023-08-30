import java.io.FileNotFoundException;

public class Task_3 {

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[2] = 9; // Индекс 2, чтобы не выходить за пределы массива
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
}
