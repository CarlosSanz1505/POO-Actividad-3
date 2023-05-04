package ejercicio10;

public class Matricula {
    public static double pago(double pat, int estrato) {
        double matricula = 50000;
        if (pat > 2000000 && estrato > 3) {
            matricula = matricula + pat*0.03;
        }
        return matricula;
    }
}
