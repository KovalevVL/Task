public class StringBuilderTask {
    public static void main (String [] args){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0; i<10; i++){
            stringBuilder.append("Fifa LiGa");
        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
