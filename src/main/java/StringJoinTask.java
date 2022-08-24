//Применение метода join()

public class StringJoinTask {
    public static void main(String[] args) {
        String result = String.join(" ", "Alfa", "Beta", "Gamma");
        System.out.println(result);
        String st = String.join(",","email:valob9@gmail.com", "Kavaliou","Ulazimir");
        System.out.println(st);
    }
}
