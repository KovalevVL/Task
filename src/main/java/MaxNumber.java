//«адача:
//
//«аполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//
//ƒл€ генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

public class MaxNumber {
    public static void main(String[] args) {
        int number = 10;
        double[] array = new double[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            System.out.println(array[i]);
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println(" ћаксимальное число равно " + max);
        System.out.println(" ћинимальное число равно " + min);
        System.out.println(" —реднее занчение равно " + avg);

    }
}
