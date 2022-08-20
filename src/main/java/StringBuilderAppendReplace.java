
public class StringBuilderAppendReplace {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Fifa-");
        StringBuilder str2 = new StringBuilder("Champion");
        str1.append(str2);
        System.out.println(str1);
        str1.replace(5, 13, "Liverpool");
        System.out.println(str1);
    }

}
