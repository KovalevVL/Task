// Пузырьковая сортировка обьектов типа String, с помощью метода CompareTo

public class CompareToTask {
    static String arr[] = {"Now", " i s", " the", "time", "for ", "al l", " good", "men",
            "to", "соте", "to", " the", "aid", " of", " their", " count ry"};

    public static void main(String[] args) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }
    }
}