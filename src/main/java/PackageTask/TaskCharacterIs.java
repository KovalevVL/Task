package PackageTask;

//Продемонстрировать применение некоторых методов типа Is

public class TaskCharacterIs {
    public static void main(String[] args) {
        char a[] = {'a', 'A', '6', ' ', 'E', 'e', '%'};
        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i])) {
                System.out.println(a[i] + " - цифра");
            }
            if (Character.isLetter(a[i])) {
                System.out.println(a[i] + " - буква");
            }
            if (Character.isWhitespace(a[i])) {
                System.out.println(a[i] + " - пробельный элемент");
            }
            if (Character.isUpperCase(a[i])) {
                System.out.println(a[i] + " - прописная буква");
            }
            if (Character.isLowerCase(a[i])) {
                System.out.println(a[i] + " - строчная буква");
            }else {
                System.out.println(a[i] + " - символ не определен");
            }
        }
    }
}
