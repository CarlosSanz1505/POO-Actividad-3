package ejercicio23;

public class Cuadratica {
    public static String raices(double a, double b, double c) {
        String err = "No hay soluciones reales";
        double x1 = 0;
        double x2 = 0;
        int d = 1;
        if (a == 0) {
            if (b == 0) {
                d = 0;
            } else {
                x1 = -c/b;
                x2 = x1;
            }
        } else {
            if (Math.pow(b, 2) >= 4*a*c) {
                x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
                x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
            } else {
                d = 0;
            }
        }
        if (d == 0) {
            return err;
        } else {
            if (x1 == x2) {
                return "x = " + String.valueOf(x1);
            } else {
                return "x1 = " + String.valueOf(x1) + ", x2 = " + String.valueOf(x2);
            }
        }
    }
}
