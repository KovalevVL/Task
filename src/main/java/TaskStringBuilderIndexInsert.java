public class TaskStringBuilderIndexInsert {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Fifa-Liverpool");
        str.insert(5, "Champion ");
        int result = str.indexOf("Fi");
        int result1 = str.indexOf("o");
        System.out.println(str);
        System.out.println(result);
        System.out.println(result1);
    }
}
