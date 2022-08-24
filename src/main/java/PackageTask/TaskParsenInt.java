package PackageTask;


//Эта программа суммирует ряд целых чисел , вводимых пользователем.
//Она преобразует строковое представление каждого числа в целое
//значение методом parseint ()


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskParsenInt {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // создать буферизированный поток чтения типа ВufferedReader ,исполь зуя стандатный лоток ввода Systeш. in
        String str;
        int i;
        int sum = 0;
        System.out.println("Введите число *0* - для выхода.");
        do {
            str = bf.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
                i = 0;
            }
            sum += 1;
            System.out.println("Текущая сумма :" + sum);
        } while (i != 0);
    }
}
