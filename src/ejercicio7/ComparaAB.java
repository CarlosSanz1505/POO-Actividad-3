package ejercicio7;

public class ComparaAB {
    public static String mmi(double a, double b) {
        if (a>b) {
            return "A > B";
        }
        if (a==b) {
            return "A = B";
        }
        if (a<b) {
            return "A < B";
        }
        return "";
    }
}
