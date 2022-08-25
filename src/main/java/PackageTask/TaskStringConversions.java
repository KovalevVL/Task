package PackageTask;

//Преобразовать целое число в двоичную, шестнадцатеричную
//и восьмеричную строковую форму

public class TaskStringConversions {
    public static void main(String[] args) {
        int num = 2241;
        System.out.println("Число num в двоичной форме :" + Integer.toBinaryString(num));
        System.out.println("Число num в восмеричной форме :" + Integer.toOctalString(num));
        System.out.println("Число num в шестнадцатиричной форме :" + Integer.toHexString(num));
    }
}
