public class Mystery {

    // TODO: Fix the bugs in mystery
    public static double mystery(double a, double b) {
        if (a < b) {
            return a + b;
        } else if (a > b) {
            return (a + b) / 2;
        } else {
            throws new 
IllegalArgumentException("a and b should not be equal");
        }
    }

    // No need to touch main!
    public static void main(String[] args) {
        System.out.println(mystery(3.0, 4.0));
    }
}
