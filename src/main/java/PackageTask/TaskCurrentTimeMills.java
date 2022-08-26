package PackageTask;

// Измерение времени выполнения программы метод currentTimeMills

public class TaskCurrentTimeMills {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Время выполнения программы - " + startTime);
        String s1 = "Coca-cola";
        for (int i = 0; i < 10000; i++) {
            s1 += String.valueOf(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время окончания программы - " + endTime);
    }
}
