public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 9, 1);
        TriangleMath triangleCheck1 = new TriangleMath(triangle1);
        triangleCheck1.showResult();

        Triangle triangle2 = new Triangle(3, 4, 5);
        TriangleMath triangleCheck2 = new TriangleMath(triangle2);
        triangleCheck2.showResult();

    }
}
