public class VectorTest {
    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(3);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].lenght());
        System.out.println(vectors[0].scalarProuct(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].subtract(vectors[1]));
    }
}
