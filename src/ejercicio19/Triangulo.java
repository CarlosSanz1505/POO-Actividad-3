package ejercicio19;

public class Triangulo {
    public static double perimetro(double lado) {
        return lado*3;
    }
    
    public static double altura(double lado) {
        double altura = lado*Math.sqrt(3)/2;
        return altura;
    }
    
    public static double area(double lado) {
        double area = lado*altura(lado);
        return area;
    }
}
