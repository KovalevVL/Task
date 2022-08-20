public class StringBuilderLeghtCharAt {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Fifa Champion - Liverpool");
        str.setLength(14);
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
