package ejercicio18;

public class Salarios {
    public static double calcularBruto(double hrs, double vlr) {
        double bruto = hrs*vlr;
        return bruto;
    }
    
    public static double calcularNeto(double hrs, double vlr, double rtn) {
        double neto = hrs*vlr*(100-rtn)/100;
        return neto;
    }
}
