package figurasGeometricas;

public class Cuadrado {
    public double lado;
    public double perimetro() {
        return 4*lado;
    }
    
    public double area() {
        return Math.pow(lado, 2);
    }
}
