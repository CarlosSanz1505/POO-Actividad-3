package ejercicio22;

public class Salario {
    public static String salida(String nombre, double valor, double horas) {
        String out = nombre;
        if (valor*horas > 450000) {
            out = out + " - $" + String.valueOf(valor*horas);
        }
        return out;
    }
}
