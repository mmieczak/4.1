public class TriangleMath {
    private Triangle triangle;

    TriangleMath(Triangle triangle) {
        this.triangle = triangle;
    }

    public void showResult() {
        System.out.println("Triangle of given sides length : a=" + triangle.getA() + " b=" + triangle.getB() + " c=" + triangle.getC() + " is right triangle: " + isRightTriangle(triangle));
    }

    private boolean isRightTriangle(Triangle triangle) {
        double abSquare;
        double cSquare;

        // Find maximum element
        double get_max = Math.max(triangle.getA(), Math.max(triangle.getB(), triangle.getC()));

        // Find minimum element
        double get_min = -Math.max(-triangle.getA(), Math.max(-triangle.getB(), -triangle.getC()));

        // Find middle element
        double get_mid = (triangle.getA() + triangle.getB() + triangle.getC()) - (get_max + get_min);

        //The converse (reverse) of the Pythagorean Theorem
        abSquare = Math.pow(get_min, 2) + Math.pow(get_mid, 2);
        cSquare = Math.pow(get_max, 2);

        //return if : a^2 + b^2 = c^2 , where a is smallest & c is largest value
        return abSquare == cSquare;
    }

}
